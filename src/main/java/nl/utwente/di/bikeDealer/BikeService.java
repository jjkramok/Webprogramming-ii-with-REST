package nl.utwente.di.bikeDealer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by gerben on 19-5-15.
 */
@Path("/")
public class BikeService {

    @POST
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public Bike addBike(@FormParam("ownerId") String ownerId, @FormParam("colour") String colour, @FormParam("gender") String gender){
        Bike bike = new Bike(ownerId, colour, gender);
        BikeDAO.getInstance().addBike(bike);
        return bike;
    }


    @GET
    @Path("colour={colour}&gender={gender}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bike> getPage(@PathParam("colour") String colour, @PathParam("gender") String gender){
        return BikeDAO.getInstance().getBikesByColourAndGender(colour, gender);
    }

}
