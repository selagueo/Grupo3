package com.app.lightwork.entities;

import com.app.lightwork.enumerations.Category;
import com.app.lightwork.enumerations.WorkStatus;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Work {
    //Id Identifier:
    @Id
    //Generating an UNIQUE ID for each object:
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    private String title;
    
    @OneToOne
    private Description description;
    
    private String requirements;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date datedischarge;//alta de trabajo
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date datedrop;//fecha de baja
    
    @ManyToOne
    private Zone zone;
      
    @OneToMany
    private Photo photo;
    
    @Enumerated(EnumType.STRING)
    private WorkStatus workStatus;
    
    @Enumerated(EnumType.STRING)
    private Category category;
    
    public Work(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Date getDatedischarge() {
        return datedischarge;
    }

    public void setDatedischarge(Date datedischarge) {
        this.datedischarge = datedischarge;
    }

    public Date getDatedrop() {
        return datedrop;
    }

    public void setDatedrop(Date datedrop) {
        this.datedrop = datedrop;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public WorkStatus getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(WorkStatus workStatus) {
        this.workStatus = workStatus;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
    
}
