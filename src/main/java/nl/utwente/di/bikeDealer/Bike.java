package nl.utwente.di.bikeDealer;

/**
 * Created by gerben on 19-5-15.
 */
public class Bike {

    private String id;
    private String ownerId;
    private String colour;
    private String gender;

    public Bike(String ownerId, String colour, String gender) {
        this.id = BikeDAO.getInstance().getNewId();
        this.ownerId = ownerId;
        this.colour = colour;
        this.gender = gender;
    }

    public Bike(String id, String ownerId, String colour, String gender) {
        this.id = id;
        this.ownerId = ownerId;
        this.colour = colour;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getColour() {
        return colour;
    }

    public String getGender() {
        return gender;
    }
}
