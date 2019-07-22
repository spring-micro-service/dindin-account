package com.github.dindin.domain.entity;

import java.io.Serializable;

public class Permit implements Serializable {
    private Integer id;

    private String permitName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermitName() {
        return permitName;
    }

    public void setPermitName(String permitName) {
        this.permitName = permitName == null ? null : permitName.trim();
    }
}