package nl.utwente.di.bikedealer;

import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by tim on 19-5-15.
 */

@XmlRootElement
@Path("/model")
public class Bike {

    private String id;
    private String ownerID;
    private String colour;
    private String gender;

    public Bike(String id, String ownerID, String colour, String gender) {
        this.id = id;
        this.ownerID = ownerID;
        this.colour = colour;
        this.gender = gender;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
