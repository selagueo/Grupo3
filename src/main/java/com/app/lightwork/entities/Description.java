package com.app.lightwork.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Description {
    //Id Identifier:
    @Id
    //Generating an UNIQUE ID for each object:
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    private String aboutMe;
    private String archivements;
    private String hobbies;
    
}