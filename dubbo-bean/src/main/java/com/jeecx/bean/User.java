package com.jeecx.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ===========================
 * Created with IntelliJ IDEA.
 * User：yanghl
 * Date：2018/1/21
 * Time：18:32
 * ===========================
 */
@Entity
@Table(name = "tb_user")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
