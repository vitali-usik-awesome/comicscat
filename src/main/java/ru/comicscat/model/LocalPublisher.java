package ru.comicscat.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Vitali Usik
 * 
 */
@Entity
@Table(name = "LOCALPUBLISHER")
public class LocalPublisher {

    public LocalPublisher() {
    }

    @Id
    @Column(name = "lpub_id")
    @GeneratedValue
    private Integer lpub_id;

    @Column(name = "lpub_link")
    private String lpub_link;

    @Column(name = "lpub_name")
    private String lpub_name;

    @Column(name = "lpub_logo_url")
    private String lpub_logo_url;

    @Column(name = "lpub_desc")
    private String lpub_desc;

    @Column(name = "lpub_status")
    private String lpub_status;

    @Column(name = "lpub_founded")
    private String lpub_founded;

    @Column(name = "lpub_country")
    private String lpub_country;

    @Column(name = "lpub_city")
    private String lpub_city;

    @Column(name = "lpub_site")
    private String lpub_site;

    @Column(name = "lpub_vk")
    private String lpub_vk;

    @Column(name = "lpub_mail_pr")
    private String lpub_mail_pr;

    @Column(name = "lpub_mail_sales")
    private String lpub_mail_sales;

    @Column(name = "lpub_address")
    private String lpub_address;

    @Column(name = "lpub_phone")
    private String lpub_phone;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "localpublisher")
    private Set<Comics> comicsSet = new HashSet<Comics>(0);

    /**
     * @return the lpub_id
     */
    public Integer getLpub_id() {
        return lpub_id;
    }

    /**
     * @param lpub_id the lpub_id to set
     */
    public void setLpub_id(Integer lpub_id) {
        this.lpub_id = lpub_id;
    }

    /**
     * @return the lpub_link
     */
    public String getLpub_link() {
        return lpub_link;
    }

    /**
     * @param lpub_link the lpub_link to set
     */
    public void setLpub_link(String lpub_link) {
        this.lpub_link = lpub_link;
    }

    /**
     * @return the lpub_name
     */
    public String getLpub_name() {
        return lpub_name;
    }

    /**
     * @param lpub_name the lpub_name to set
     */
    public void setLpub_name(String lpub_name) {
        this.lpub_name = lpub_name;
    }

    /**
     * @return the lpub_logo_url
     */
    public String getLpub_logo_url() {
        return lpub_logo_url;
    }

    /**
     * @param lpub_logo_url the lpub_logo_url to set
     */
    public void setLpub_logo_url(String lpub_logo_url) {
        this.lpub_logo_url = lpub_logo_url;
    }

    /**
     * @return the lpub_desc
     */
    public String getLpub_desc() {
        return lpub_desc;
    }

    /**
     * @param lpub_desc the lpub_desc to set
     */
    public void setLpub_desc(String lpub_desc) {
        this.lpub_desc = lpub_desc;
    }

    /**
     * @return the lpub_status
     */
    public String getLpub_status() {
        return lpub_status;
    }

    /**
     * @param lpub_status the lpub_status to set
     */
    public void setLpub_status(String lpub_status) {
        this.lpub_status = lpub_status;
    }

    /**
     * @return the lpub_founded
     */
    public String getLpub_founded() {
        return lpub_founded;
    }

    /**
     * @param lpub_founded the lpub_founded to set
     */
    public void setLpub_founded(String lpub_founded) {
        this.lpub_founded = lpub_founded;
    }

    /**
     * @return the lpub_country
     */
    public String getLpub_country() {
        return lpub_country;
    }

    /**
     * @param lpub_country the lpub_country to set
     */
    public void setLpub_country(String lpub_country) {
        this.lpub_country = lpub_country;
    }

    /**
     * @return the lpub_city
     */
    public String getLpub_city() {
        return lpub_city;
    }

    /**
     * @param lpub_city the lpub_city to set
     */
    public void setLpub_city(String lpub_city) {
        this.lpub_city = lpub_city;
    }

    /**
     * @return the lpub_site
     */
    public String getLpub_site() {
        return lpub_site;
    }

    /**
     * @param lpub_site the lpub_site to set
     */
    public void setLpub_site(String lpub_site) {
        this.lpub_site = lpub_site;
    }

    /**
     * @return the lpub_vk
     */
    public String getLpub_vk() {
        return lpub_vk;
    }

    /**
     * @param lpub_vk the lpub_vk to set
     */
    public void setLpub_vk(String lpub_vk) {
        this.lpub_vk = lpub_vk;
    }

    /**
     * @return the lpub_mail_pr
     */
    public String getLpub_mail_pr() {
        return lpub_mail_pr;
    }

    /**
     * @param lpub_mail_pr the lpub_mail_pr to set
     */
    public void setLpub_mail_pr(String lpub_mail_pr) {
        this.lpub_mail_pr = lpub_mail_pr;
    }

    /**
     * @return the lpub_mail_sales
     */
    public String getLpub_mail_sales() {
        return lpub_mail_sales;
    }

    /**
     * @param lpub_mail_sales the lpub_mail_sales to set
     */
    public void setLpub_mail_sales(String lpub_mail_sales) {
        this.lpub_mail_sales = lpub_mail_sales;
    }

    /**
     * @return the lpub_address
     */
    public String getLpub_address() {
        return lpub_address;
    }

    /**
     * @param lpub_address the lpub_address to set
     */
    public void setLpub_address(String lpub_address) {
        this.lpub_address = lpub_address;
    }

    /**
     * @return the lpub_phone
     */
    public String getLpub_phone() {
        return lpub_phone;
    }

    /**
     * @param lpub_phone the lpub_phone to set
     */
    public void setLpub_phone(String lpub_phone) {
        this.lpub_phone = lpub_phone;
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
