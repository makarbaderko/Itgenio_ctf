package com.itgenio.hackaton.service;

import com.itgenio.hackaton.entity.Flag;
import com.itgenio.hackaton.entity.FlagUserSolution;
import com.itgenio.hackaton.entity.Role;
import com.itgenio.hackaton.entity.User;
import com.itgenio.hackaton.repository.FlagRepository;
import com.itgenio.hackaton.repository.FlagUserRepository;
import com.itgenio.hackaton.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlagService  {
    @Autowired
    FlagUserRepository flagUserRepository;
    @Autowired
    FlagRepository flagRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    public boolean saveFlag(Flag flag){
        flag.setFlagKey(bCryptPasswordEncoder.encode(flag.getFlagKey()));
        flagRepository.save(flag);
        return true;
    }
    public String getFlag(Long id){
        if(flagRepository.findFlagById(id).getFlagText()==null){
            return "<div>Not found</div>";
        }
        return flagRepository.findFlagById(id).getFlagText();
    }
    public boolean checkFlag(Flag flag, String username){
        String key = flag.getFlagKey();
        Long idU = userRepository.findByUsername(username).getId();
        try{
            Flag f = flagRepository.findFlagByFlagKey(key);
            if(f==null){
                System.err.println("false");
                return false;
            }
            System.err.println(f);
            System.err.println(bCryptPasswordEncoder.encode(key));
            if(bCryptPasswordEncoder.matches(key, f.getFlagKey())){
                 flagUserRepository.save(new FlagUserSolution(f.getId(), idU, true));
                System.err.println("true");
                return true;

            }
            System.err.println("false2");
            return false;
        }catch (NullPointerException n){
            System.err.println("NullPointer");
        }
        return false;
    }
    public List<FlagUserSolution> getAllSolvedFlagsUser(Long id){
        List <FlagUserSolution> list = flagUserRepository.findAllByUserId(id);
        return list;
    }
    public int getAllFlags(){
        return flagRepository.findAll().size();
    }
}
