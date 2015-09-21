package ru.comicscat.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Vitali Usik
 * 
 */
@Entity
@Table(name = "PAINTER")
public class Painter {

    public Painter(){
    }

    @Id
    @Column(name = "painter_id")
    @GeneratedValue
    private Integer painter_id;

    @Column(name = "painter_link")
    private String painter_link;

    @Column(name = "painter_name")
    private String painter_name;

    @Column(name = "painter_bio")
    private String painter_bio;

    @Column(name = "painter_photo")
    private String painter_photo;

    @Column(name = "painter_nationality")
    private String painter_nationality;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "painters")
    private Set<Comics> listComics = new HashSet<Comics>(0);

    /**
     * @return the painter_id
     */
    public Integer getPainter_id() {
        return painter_id;
    }

    /**
     * @param painter_id the painter_id to set
     */
    public void setPainter_id(Integer painter_id) {
        this.painter_id = painter_id;
    }

    /**
     * @return the painter_link
     */
    public String getPainter_link() {
        return painter_link;
    }

    /**
     * @param painter_link the painter_link to set
     */
    public void setPainter_link(String painter_link) {
        this.painter_link = painter_link;
    }

    /**
     * @return the painter_name
     */
    public String getPainter_name() {
        return painter_name;
    }

    /**
     * @param painter_name the painter_name to set
     */
    public void setPainter_name(String painter_name) {
        this.painter_name = painter_name;
    }

    /**
     * @return the painter_bio
     */
    public String getPainter_bio() {
        return painter_bio;
    }

    /**
     * @param painter_bio the painter_bio to set
     */
    public void setPainter_bio(String painter_bio) {
        this.painter_bio = painter_bio;
    }

    /**
     * @return the painter_photo
     */
    public String getPainter_photo() {
        return painter_photo;
    }

    /**
     * @param painter_photo the painter_photo to set
     */
    public void setPainter_photo(String painter_photo) {
        this.painter_photo = painter_photo;
    }

    /**
     * @return the painter_nationality
     */
    public String getPainter_nationality() {
        return painter_nationality;
    }

    /**
     * @param painter_nationality the painter_nationality to set
     */
    public void setPainter_nationality(String painter_nationality) {
        this.painter_nationality = painter_nationality;
    }

    /**
     * @return the listComics
     */
    public Set<Comics> getListComics() {
        return listComics;
    }

    /**
     * @param listComics the listComics to set
     */
    public void setListComics(Set<Comics> listComics) {
        this.listComics = listComics;
    }
}
