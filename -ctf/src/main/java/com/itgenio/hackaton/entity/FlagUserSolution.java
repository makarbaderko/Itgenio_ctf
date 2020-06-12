package com.itgenio.hackaton.entity;

import javax.persistence.*;

@Entity
@Table(name="t_flagUserSolution")
public class FlagUserSolution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Long flagId;
    public Long userId;
    public boolean solved;
    public  FlagUserSolution(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getFlagId() {
        return flagId;
    }

    public void setFlagId(Long flagId) {
        this.flagId = flagId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public FlagUserSolution(Long flagId, Long userId, boolean solved) {
        this.flagId = flagId;
        this.userId = userId;
        this.solved = solved;
    }
}
