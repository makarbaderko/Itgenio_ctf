package com.itgenio.hackaton.entity;
import javax.persistence.*;

@Entity
@Table(name="t_flag")
public class Flag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int flagId;
    public String flagKey;
    public Flag(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFlagId() {
        return flagId;
    }

    public void setFlagId(int flagId) {
        this.flagId = flagId;
    }

    public String getFlagKey() {
        return flagKey;
    }

    public void setFlagKey(String flagKey) {
        this.flagKey = flagKey;
    }
}
