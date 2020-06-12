package com.itgenio.hackaton.entity;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="t_flag")
public class Flag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public String flagKey ;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Flag(){
    }

    public Flag(long id, String flagKey) {
        this.id = id;
        this.flagKey = flagKey;
    }
    public Flag( String flagKey) {
        this.flagKey = flagKey;
    }

    public String getFlagKey() {
        return flagKey;
    }

    public void setFlagKey(String flagKey) {
        this.flagKey = flagKey;
    }
}
