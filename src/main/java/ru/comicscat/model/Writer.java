package ru.comicscat.model;

import java.util.HashSet;
//import java.util.List;
import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Vitali Usik
 * 
 */
@Entity
@Table(name = "WRITER")
public class Writer {

    public Writer() {
    }

    @Id
    @Column(name = "writer_id")
    @GeneratedValue
    private Integer writer_id;
    
    @Column(name = "writer_link")
    private String writer_link;

    @Column(name = "writer_name")
    private String writer_name;

    @Column(name = "writer_bio")
    private String writer_bio;

    @Column(name = "writer_photo")
    private String writer_photo;

    @Column(name = "writer_nationality")
    private String writer_nationality;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "writers")
    private Set<Comics> listComics = new HashSet<Comics>(0);

    /**
     * @return the writer_id
     */
    public Integer getWriter_id() {
        return writer_id;
    }

    /**
     * @param writer_id the writer_id to set
     */
    public void setWriter_id(Integer writer_id) {
        this.writer_id = writer_id;
    }

    /**
     * @return the writer_name
     */
    public String getWriter_name() {
        return writer_name;
    }

    /**
     * @param writer_name the writer_name to set
     */
    public void setWriter_name(String writer_name) {
        this.writer_name = writer_name;
    }

    /**
     * @return the writer_bio
     */
    public String getWriter_bio() {
        return writer_bio;
    }

    /**
     * @param writer_bio the writer_bio to set
     */
    public void setWriter_bio(String writer_bio) {
        this.writer_bio = writer_bio;
    }

    /**
     * @return the writer_photo
     */
    public String getWriter_photo() {
        return writer_photo;
    }

    /**
     * @param writer_photo the writer_photo to set
     */
    public void setWriter_photo(String writer_photo) {
        this.writer_photo = writer_photo;
    }

    /**
     * @return the writer_nationality
     */
    public String getWriter_nationality() {
        return writer_nationality;
    }

    /**
     * @param writer_nationality the writer_nationality to set
     */
    public void setWriter_nationality(String writer_nationality) {
        this.writer_nationality = writer_nationality;
    }

    
    public Set<Comics> getListComics() {
        return listComics;
    }

    /**
     * @param listComics the listComics to set
     */
    public void setListComics(Set<Comics> listComics) {
        this.listComics = listComics;
    }

    /**
     * @return the writer_link
     */
    public String getWriter_link() {
        return writer_link;
    }

    /**
     * @param writer_link the writer_link to set
     */
    public void setWriter_link(String writer_link) {
        this.writer_link = writer_link;
    }
}
