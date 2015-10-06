package ru.comicscat.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Vitali Usik
 * 
 */
@Entity
@Table(name = "USERS")
public class User {

    public User() {
    }

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private Integer user_id;

    @Column(name = "user_login")
    private String user_login;

    @Column(name = "user_pass")
    private String user_pass;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "user_surname")
    private String user_surname;

    @NotEmpty @Email
    @Column(name = "user_mail")
    private String user_mail;

    @Column(name = "user_register_date")
    private Date user_register_date;

    @Column(name = "user_role")
    private String user_role;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "comics_added_by")
    private Set<Comics> comicsSet = new HashSet<Comics>(0);

    /**
     * @return the user_id
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the user_login
     */
    public String getUser_login() {
        return user_login;
    }

    /**
     * @param user_login the user_login to set
     */
    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    /**
     * @return the user_pass
     */
    public String getUser_pass() {
        return user_pass;
    }

    /**
     * @param user_pass the user_pass to set
     */
    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the user_surname
     */
    public String getUser_surname() {
        return user_surname;
    }

    /**
     * @param user_surname the user_surname to set
     */
    public void setUser_surname(String user_surname) {
        this.user_surname = user_surname;
    }

    /**
     * @return the user_mail
     */
    public String getUser_mail() {
        return user_mail;
    }

    /**
     * @param user_mail the user_mail to set
     */
    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    /**
     * @return the user_register_date
     */
    public Date getUser_register_date() {
        return user_register_date;
    }

    /**
     * @param user_register_date the user_register_date to set
     */
    public void setUser_register_date(Date user_register_date) {
        this.user_register_date = user_register_date;
    }

    /**
     * @return the user_role
     */
    public String getUser_role() {
        return user_role;
    }

    /**
     * @param user_role the user_role to set
     */
    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    /**
     * @return the comicsSet
     */
    public Set<Comics> getComicsSet() {
        return comicsSet;
    }

    /**
     * @param comicsSet the comicsSet to set
     */
    public void setComicsSet(Set<Comics> comicsSet) {
        this.comicsSet = comicsSet;
    }
}
