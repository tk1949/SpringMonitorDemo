package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Account {

    @Id
    private String accountID  ;
    private int    type       ;
    private String name       ;
    private String email      ;
    private String phoneNumber;
    private String loginName  ;
    private String password   ;
    private long   loginTime  ;

    private String createID   ;
    private String updateID   ;
    private long   createTime ;
    private long   updateTime ;

}
