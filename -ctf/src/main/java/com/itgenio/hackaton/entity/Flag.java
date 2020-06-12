package com.itgenio.hackaton.entity;
import javax.persistence.*;


@Entity
@Table(name="t_flag")
public class Flag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public String flagKey ;
    public String flagText;
    public String getFlagText() {
        return flagText;
    }

    public void setFlagText(String flagText) {
        this.flagText = flagText;
    }

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

    public Flag(String flagKey, String flagText) {
        this.flagKey = flagKey;
        this.flagText = flagText;
    }

    public String getFlagKey() {
        return flagKey;
    }

    public void setFlagKey(String flagKey) {
        this.flagKey = flagKey;
    }
}
