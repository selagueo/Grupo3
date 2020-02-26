package com.app.lightwork.entities;

import com.app.lightwork.enumerations.ValorationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
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
     * @return the idUser1
     */
    public String getIdUser1() {
        return idUser1;
    }

    /**
     * @param idUser1 the idUser1 to set
     */
    public void setIdUser1(String idUser1) {
        this.idUser1 = idUser1;
    }

    /**
     * @return the idUser2
     */
    public String getIdUser2() {
        return idUser2;
    }

    /**
     * @param idUser2 the idUser2 to set
     */
    public void setIdUser2(String idUser2) {
        this.idUser2 = idUser2;
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * @return the commentary
     */
    public String getCommentary() {
        return commentary;
    }

    /**
     * @param commentary the commentary to set
     */
    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    /**
     * @return the valorationType
     */
    public ValorationType getValorationType() {
        return valorationType;
    }

    /**
     * @param valorationType the valorationType to set
     */
    public void setValorationType(ValorationType valorationType) {
        this.valorationType = valorationType;
    }
    
    
}
