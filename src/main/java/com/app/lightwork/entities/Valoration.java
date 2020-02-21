package com.app.lightwork.entities;

import com.app.lightwork.enumerations.ValorationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;


public class Valoration {
    //Id Identifier:
    @Id
    //Generating an UNIQUE ID for each object:
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String idUser1;
    private String idUser2;
    private int points;
    private String commentary;
    private ValorationType valorationType;
    
    
}
