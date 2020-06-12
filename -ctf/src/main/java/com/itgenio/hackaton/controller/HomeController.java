package com.itgenio.hackaton.controller;

import com.itgenio.hackaton.entity.Flag;
import com.itgenio.hackaton.entity.User;
import com.itgenio.hackaton.service.FlagService;
import com.itgenio.hackaton.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    UserService userService;
    @Autowired
    FlagService flagService;
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("flag", new Flag());
        return "index";
    }
    @PostMapping("/")
    public String flag(Model model,@ModelAttribute Flag flag){
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
    @PostMapping("/login")
    public String loginSubmit(Model model, @ModelAttribute User user){
        boolean loginSucceed = userService.login(user);
        if(loginSucceed){
            return "index";
        }
        model.addAttribute("error", true);
        return "login";
    }

    @GetMapping("/registration")
    public String register(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }
    @PostMapping("/registration")
    public String registrationSubmit(Model model, @ModelAttribute User user){
        boolean flag = userService.saveUser(user);
        if(!flag){
            model.addAttribute("error", true);
            return "registration";
        }
        return "index";
    }
    @GetMapping("/flag")
    public String flagGet(Model model){
        model.addAttribute("flag", new Flag());
     //   model.addAttribute("allFlags", getAllFlagHtml()); this method is supposed to show all html code
        System.err.println(getAllSolvedFlags(findId()));
        return "flag";
    }
    @PostMapping("/flag")
    public String flagCheck(Model model, @ModelAttribute Flag flag){
        model.addAttribute("true", new Error());
        boolean checkFlag = flagService.checkFlag(flag, findUsername());
        System.out.println(getAllSolvedFlags(findId()));
        if(checkFlag){
            return "flag";
        }
        return "flag";
    }
    @GetMapping("/xysavexyFlag")
    public String saveFlag(Model model){
        model.addAttribute("flag", new Flag());
        return "saveFlag";
    }
    @PostMapping("/xysavexyFlag")
    public String saveFlag(Model model, @ModelAttribute Flag flag){
        flagService.saveFlag(flag);
        return "saveFlag";
    }

    private String findUsername(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(user == null){
            return "test";
        }
        return user.getUsername();
    }
    private Long  findId(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(user == null){
            return 0L;
        }
        return user.getId();
    }
    private ArrayList<Long> getAllSolvedFlags(Long id){
        ArrayList<Long> list = new ArrayList<>();
        if(flagService.getAllSolvedFlagsUser(id)!=null){
            for(int i = 0; i<flagService.getAllSolvedFlagsUser(findId()).size();i++){
                list.add(flagService.getAllSolvedFlagsUser(findId()).get(i).getFlagId());
            }
            return list;
        }
        list.add(0L);
        return list;
    }
    Flag flag = new Flag();
    private ArrayList<String>getAllFlagHtml(){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<flagService.getAllFlags();i++){
            list.add(flagService.getFlag((long) i));
        }
        return list;
    }
}
