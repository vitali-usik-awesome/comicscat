package ru.comicscat.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Vitali Usik
 * 
 */
@Entity
@Table(name = "COMICS")
public class Comics {

    public Comics() {
    }



    @Id
    @Column(name = "comics_id")
    @GeneratedValue
    private Integer comics_id;

    @Column(name = "comics_date_added")
    private Date comics_date_added;

    @Column(name = "comics_parent")
    private Integer comics_parent;

    @Column(name = "comics_link")
    private String comics_link;

    @Column(name = "comics_status")
    private String comics_status;

    @Column(name = "comics_title")
    private String comics_title;

    @Column(name = "comics_title_origin")
    private String comics_title_origin;

    @Column(name = "comics_cover_url")
    private String comics_cover_url;

    
    
    
    
    
    private Set<Writer> writers = new HashSet<Writer>(0);
    
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "comics_writer", catalog = "comicscat", joinColumns = { 
            @JoinColumn(name = "comics_id", nullable = false, updatable = false) }, 
            inverseJoinColumns = { @JoinColumn(name = "writer_id", 
                    nullable = false, updatable = false) })
    public Set<Writer> getWriters() {
        return writers;
    }

    public void setWriters(Set<Writer> writers) {
        this.writers = writers;
    }
//    @Column(name = "comics_writer")
//    private String comics_writer;

    @Column(name = "comics_painter")
    private String comics_painter;

    @Column(name = "comics_colorist")
    private String comics_colorist;

    @Column(name = "comics_description")
    private String comics_description;

    @Column(name = "comics_screens")
    private String comics_screens;

    @Column(name = "comics_videos")
    private String comics_videos;

    @Column(name = "comics_type")
    private String comics_type;

    @Column(name = "comics_date_ru_pub")
    private Date comics_date_ru_pub;

    @Column(name = "comics_date_world_pub")
    private Date comics_date_world_pub;

    @Column(name = "comics_publisher_origin")
    private String comics_publisher_origin;

    @Column(name = "comics_publisher_ru")
    private String comics_publisher_ru;

    /**
     * @return the id
     */
    public Integer getId() {
        return comics_id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.comics_id = id;
    }

    /**
     * @return the comics_date_added
     */
    public Date getComics_date_added() {
        return comics_date_added;
    }

    /**
     * @param comics_date_added the comics_date_added to set
     */
    public void setComics_date_added(Date comics_date_added) {
        this.comics_date_added = comics_date_added;
    }

    /**
     * @return the comics_parent
     */
    public Integer getComics_parent() {
        return comics_parent;
    }

    /**
     * @param comics_parent the comics_parent to set
     */
    public void setComics_parent(Integer comics_parent) {
        this.comics_parent = comics_parent;
    }

    /**
     * @return the comics_link
     */
    public String getComics_link() {
        return comics_link;
    }

    /**
     * @param comics_link the comics_link to set
     */
    public void setComics_link(String comics_link) {
        this.comics_link = comics_link;
    }

    /**
     * @return the comics_status
     */
    public String getComics_status() {
        return comics_status;
    }

    /**
     * @param comics_status the comics_status to set
     */
    public void setComics_status(String comics_status) {
        this.comics_status = comics_status;
    }

    /**
     * @return the comics_title
     */
    public String getComics_title() {
        return comics_title;
    }

    /**
     * @param comics_title the comics_title to set
     */
    public void setComics_title(String comics_title) {
        this.comics_title = comics_title;
    }

    /**
     * @return the comics_title_origin
     */
    public String getComics_title_origin() {
        return comics_title_origin;
    }

    /**
     * @param comics_title_origin the comics_title_origin to set
     */
    public void setComics_title_origin(String comics_title_origin) {
        this.comics_title_origin = comics_title_origin;
    }

    /**
     * @return the comics_cover_url
     */
    public String getComics_cover_url() {
        return comics_cover_url;
    }

    /**
     * @param comics_cover_url the comics_cover_url to set
     */
    public void setComics_cover_url(String comics_cover_url) {
        this.comics_cover_url = comics_cover_url;
    }

//    /**
//     * @return the comics_writer
//     */
//    public String getComics_writer() {
//        return comics_writer;
//    }
//
//    /**
//     * @param comics_writer the comics_writer to set
//     */
//    public void setComics_writer(String comics_writer) {
//        this.comics_writer = comics_writer;
//    }

    /**
     * @return the comics_painter
     */
    public String getComics_painter() {
        return comics_painter;
    }

    /**
     * @param comics_painter the comics_painter to set
     */
    public void setComics_painter(String comics_painter) {
        this.comics_painter = comics_painter;
    }

    /**
     * @return the comics_colorist
     */
    public String getComics_colorist() {
        return comics_colorist;
    }

    /**
     * @param comics_colorist the comics_colorist to set
     */
    public void setComics_colorist(String comics_colorist) {
        this.comics_colorist = comics_colorist;
    }

    /**
     * @return the comics_description
     */
    public String getComics_description() {
        return comics_description;
    }

    /**
     * @param comics_description the comics_description to set
     */
    public void setComics_description(String comics_description) {
        this.comics_description = comics_description;
    }

    /**
     * @return the comics_screens
     */
    public String getComics_screens() {
        return comics_screens;
    }

    /**
     * @param comics_screens the comics_screens to set
     */
    public void setComics_screens(String comics_screens) {
        this.comics_screens = comics_screens;
    }

    /**
     * @return the comics_videos
     */
    public String getComics_videos() {
        return comics_videos;
    }

    /**
     * @param comics_videos the comics_videos to set
     */
    public void setComics_videos(String comics_videos) {
        this.comics_videos = comics_videos;
    }

    /**
     * @return the comics_single
     */
    public String getComics_type() {
        return comics_type;
    }

    /**
     * @param comics_single the comics_single to set
     */
    public void setComics_type(String comics_type) {
        this.comics_type = comics_type;
    }

    /**
     * @return the comics_date_ru_pub
     */
    public Date getComics_date_ru_pub() {
        return comics_date_ru_pub;
    }

    /**
     * @param comics_date_ru_pub the comics_date_ru_pub to set
     */
    public void setComics_date_ru_pub(Date comics_date_ru_pub) {
        this.comics_date_ru_pub = comics_date_ru_pub;
    }

    /**
     * @return the comics_date_world_pub
     */
    public Date getComics_date_world_pub() {
        return comics_date_world_pub;
    }

    /**
     * @param comics_date_world_pub the comics_date_world_pub to set
     */
    public void setComics_date_world_pub(Date comics_date_world_pub) {
        this.comics_date_world_pub = comics_date_world_pub;
    }

    /**
     * @return the comics_publisher_origin
     */
    public String getComics_publisher_origin() {
        return comics_publisher_origin;
    }

    /**
     * @param comics_publisher_origin the comics_publisher_origin to set
     */
    public void setComics_publisher_origin(String comics_publisher_origin) {
        this.comics_publisher_origin = comics_publisher_origin;
    }

    /**
     * @return the comics_publisher_ru
     */
    public String getComics_publisher_ru() {
        return comics_publisher_ru;
    }

    /**
     * @param comics_publisher_ru the comics_publisher_ru to set
     */
    public void setComics_publisher_ru(String comics_publisher_ru) {
        this.comics_publisher_ru = comics_publisher_ru;
    }
}
