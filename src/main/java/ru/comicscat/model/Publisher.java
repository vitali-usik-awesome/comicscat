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
@Table(name = "PUBLISHER")
public class Publisher {

    public Publisher() {
    }

    @Id
    @Column(name = "pub_id")
    @GeneratedValue
    private Integer pub_id;

    @Column(name = "pub_link")
    private String pub_link;

    @Column(name = "pub_name")
    private String pub_name;

    @Column(name = "pub_logo_url")
    private String pub_logo_url;

    @Column(name = "pub_desc")
    private String pub_desc;

    @Column(name = "pub_parent_company")
    private String pub_parent_company;

    @Column(name = "pub_status")
    private String pub_status;

    @Column(name = "pub_founded")
    private String pub_founded;

    @Column(name = "pub_country")
    private String pub_country;

    @Column(name = "pub_site")
    private String pub_site;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "publisher")
    private Set<Comics> comicsSet = new HashSet<Comics>(0);

    /**
     * @return the pub_id
     */
    public Integer getPub_id() {
        return pub_id;
    }

    /**
     * @param pub_id the pub_id to set
     */
    public void setPub_id(Integer pub_id) {
        this.pub_id = pub_id;
    }

    /**
     * @return the pub_link
     */
    public String getPub_link() {
        return pub_link;
    }

    /**
     * @param pub_link the pub_link to set
     */
    public void setPub_link(String pub_link) {
        this.pub_link = pub_link;
    }

    /**
     * @return the pub_name
     */
    public String getPub_name() {
        return pub_name;
    }

    /**
     * @param pub_name the pub_name to set
     */
    public void setPub_name(String pub_name) {
        this.pub_name = pub_name;
    }

    /**
     * @return the pub_logo_url
     */
    public String getPub_logo_url() {
        return pub_logo_url;
    }

    /**
     * @param pub_logo_url the pub_logo_url to set
     */
    public void setPub_logo_url(String pub_logo_url) {
        this.pub_logo_url = pub_logo_url;
    }

    /**
     * @return the pub_desc
     */
    public String getPub_desc() {
        return pub_desc;
    }

    /**
     * @param pub_desc the pub_desc to set
     */
    public void setPub_desc(String pub_desc) {
        this.pub_desc = pub_desc;
    }

    /**
     * @return the pub_parent_company
     */
    public String getPub_parent_company() {
        return pub_parent_company;
    }

    /**
     * @param pub_parent_company the pub_parent_company to set
     */
    public void setPub_parent_company(String pub_parent_company) {
        this.pub_parent_company = pub_parent_company;
    }

    /**
     * @return the pub_status
     */
    public String getPub_status() {
        return pub_status;
    }

    /**
     * @param pub_status the pub_status to set
     */
    public void setPub_status(String pub_status) {
        this.pub_status = pub_status;
    }

    /**
     * @return the pub_founded
     */
    public String getPub_founded() {
        return pub_founded;
    }

    /**
     * @param pub_founded the pub_founded to set
     */
    public void setPub_founded(String pub_founded) {
        this.pub_founded = pub_founded;
    }

    /**
     * @return the pub_country
     */
    public String getPub_country() {
        return pub_country;
    }

    /**
     * @param pub_country the pub_country to set
     */
    public void setPub_country(String pub_country) {
        this.pub_country = pub_country;
    }

    /**
     * @return the pub_site
     */
    public String getPub_site() {
        return pub_site;
    }

    /**
     * @param pub_site the pub_site to set
     */
    public void setPub_site(String pub_site) {
        this.pub_site = pub_site;
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
