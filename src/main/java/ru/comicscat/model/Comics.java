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
import javax.persistence.ManyToOne;
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "comics_publisher_id", nullable = false)
    private Publisher publisher;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "comics_localpublisher_id", nullable = false)
    private LocalPublisher localpublisher;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "comics_writer", catalog = "comicscat", joinColumns = { 
            @JoinColumn(name = "comics_id", nullable = false, updatable = false) }, 
            inverseJoinColumns = { @JoinColumn(name = "writer_id", 
                    nullable = false, updatable = false) })
    private Set<Writer> writers = new HashSet<Writer>(0);

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "comics_painter", catalog = "comicscat", joinColumns = { 
            @JoinColumn(name = "comics_id", nullable = false, updatable = false) }, 
            inverseJoinColumns = { @JoinColumn(name = "painter_id", 
                    nullable = false, updatable = false) })
    private Set<Painter> painters = new HashSet<Painter>(0);

    @Column(name = "comics_format")
    private String comics_format;

    @Column(name = "comics_num_pages")
    private Integer comics_num_pages;

    @Column(name = "comics_binding")
    private String comics_binding;

    @Column(name = "comics_isbn")
    private String comics_isbn;

    @Column(name = "comics_numCopies")
    private Integer comics_numCopies;

    @Column(name = "comics_weight")
    private Integer comics_weight;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "comics_added_by", nullable = false)
    private LocalPublisher comics_added_by;

    /**
     * @return the comics_id
     */
    public Integer getComics_id() {
        return comics_id;
    }

    /**
     * @param comics_id the comics_id to set
     */
    public void setComics_id(Integer comics_id) {
        this.comics_id = comics_id;
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
     * @return the publisher
     */
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the localpublisher
     */
    public LocalPublisher getLocalpublisher() {
        return localpublisher;
    }

    /**
     * @param localpublisher the localpublisher to set
     */
    public void setLocalpublisher(LocalPublisher localpublisher) {
        this.localpublisher = localpublisher;
    }

    public Set<Writer> getWriters() {
        return writers;
    }

    public void setWriters(Set<Writer> writers) {
        this.writers = writers;
    }

    /**
     * @return the painter
     */
    public Set<Painter> getPainters() {
        return painters;
    }

    /**
     * @param painter the painter to set
     */
    public void setPainters(Set<Painter> painter) {
        this.painters = painter;
    }

    /**
     * @return the comics_format
     */
    public String getComics_format() {
        return comics_format;
    }

    /**
     * @param comics_format the comics_format to set
     */
    public void setComics_format(String comics_format) {
        this.comics_format = comics_format;
    }

    /**
     * @return the comics_num_pages
     */
    public Integer getComics_num_pages() {
        return comics_num_pages;
    }

    /**
     * @param comics_num_pages the comics_num_pages to set
     */
    public void setComics_num_pages(Integer comics_num_pages) {
        this.comics_num_pages = comics_num_pages;
    }

    /**
     * @return the comics_binding
     */
    public String getComics_binding() {
        return comics_binding;
    }

    /**
     * @param comics_binding the comics_binding to set
     */
    public void setComics_binding(String comics_binding) {
        this.comics_binding = comics_binding;
    }

    /**
     * @return the comics_isbn
     */
    public String getComics_isbn() {
        return comics_isbn;
    }

    /**
     * @param comics_isbn the comics_isbn to set
     */
    public void setComics_isbn(String comics_isbn) {
        this.comics_isbn = comics_isbn;
    }

    /**
     * @return the comics_numCopies
     */
    public Integer getComics_numCopies() {
        return comics_numCopies;
    }

    /**
     * @param comics_numCopies the comics_numCopies to set
     */
    public void setComics_numCopies(Integer comics_numCopies) {
        this.comics_numCopies = comics_numCopies;
    }

    /**
     * @return the comics_weight
     */
    public Integer getComics_weight() {
        return comics_weight;
    }

    /**
     * @param comics_weight the comics_weight to set
     */
    public void setComics_weight(Integer comics_weight) {
        this.comics_weight = comics_weight;
    }

    /**
     * @return the comics_added_by
     */
    public LocalPublisher getComics_added_by() {
        return comics_added_by;
    }

    /**
     * @param comics_added_by the comics_added_by to set
     */
    public void setComics_added_by(LocalPublisher comics_added_by) {
        this.comics_added_by = comics_added_by;
    }
}
