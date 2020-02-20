package com.app.lightwork.entities;

import com.app.lightwork.enumerations.Gender;
import java.sql.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

public class User {
//Id Identifier:
    @Id
    //Generating an UNIQUE ID for each object:
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    private String name;
    private String lastName;
    private String mail;
    private String password;
    private Date date;
    private Gender gender;
    private long phone;
    private Description description;
    
    
    @ManyToOne
    private Zone zone;
    
    /*
     	Saying ONE TO ONE on our photo attribute, will means that every user will only have
     ONE picture.
     */
    @OneToOne
    private Photo photo;
    
    @OneToOne
    private ReputationOne reputationOne;
    
    @OneToOne
    private ReputationTwo reputationTwo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date registration;
    
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date unRegistration;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * @return the phone
     */
    public long getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     * @return the description
     */
    public Description getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(Description description) {
        this.description = description;
    }

    /**
     * @return the zone
     */
    public Zone getZone() {
        return zone;
    }

    /**
     * @param zone the zone to set
     */
    public void setZone(Zone zone) {
        this.zone = zone;
    }

    /**
     * @return the photo
     */
    public Photo getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    /**
     * @return the reputationOne
     */
    public ReputationOne getReputationOne() {
        return reputationOne;
    }

    /**
     * @param reputationOne the reputationOne to set
     */
    public void setReputationOne(ReputationOne reputationOne) {
        this.reputationOne = reputationOne;
    }

    /**
     * @return the reputationTwo
     */
    public ReputationTwo getReputationTwo() {
        return reputationTwo;
    }

    /**
     * @param reputationTwo the reputationTwo to set
     */
    public void setReputationTwo(ReputationTwo reputationTwo) {
        this.reputationTwo = reputationTwo;
    }

    /**
     * @return the registration
     */
    public java.util.Date getRegistration() {
        return registration;
    }

    /**
     * @param registration the registration to set
     */
    public void setRegistration(java.util.Date registration) {
        this.registration = registration;
    }

    /**
     * @return the unRegistration
     */
    public java.util.Date getUnRegistration() {
        return unRegistration;
    }

    /**
     * @param unRegistration the unRegistration to set
     */
    public void setUnRegistration(java.util.Date unRegistration) {
        this.unRegistration = unRegistration;
    }
    
}
