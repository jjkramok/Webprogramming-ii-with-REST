package nl.utwente.di.bikedealer.bike;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by tim on 19-5-15.
 */

@Path("/resources/rest")
public class BikeService {

    @POST
    public String createBike(Bike bike) {
        return null;
    }

    @GET
    @Path("/colour={colour}&gender={gender}")
    @Produces(MediaType.TEXT_HTML)
    public String getBikes(@PathParam("colour") String colour, @PathParam("gender") String gender) {
        String first    = "<html> <body> <h1> All bikes according to " + colour + " and " + gender + " </h1>";
        String last     = " </body> </html>";
        Map<Integer, Bike> bikeMap = BikeDao.getInstance().getBikeMap();
        List<Bike> result = new ArrayList<Bike>();
        for (Bike bike : bikeMap.values()) {
            if (bike.getColour().equals(colour) && bike.getGender().equals(gender)) {
                result.add(bike);
            }
        }
        return first + result.toString() + last;
    }

    @GET
    @Path("/bikes/{bikeId}")
    @Produces(MediaType.TEXT_HTML)
    public String getBikeDetails(@PathParam("bikeId") String bikeId) {
        return null;
    }

    @PUT
    @Path("/bikes/{bikeId}")
    @Produces(MediaType.TEXT_HTML)
    public String updateBikes(Bike bike) {
        return null;
    }

    @DELETE
    @Path("/bikes/{bikeId}")
    public String deleteBike(@PathParam("bikeId") String bikeId) {
        return null;
    }

    @POST
    @Path("/bikes/{bikeId}/order")
    @Produces(MediaType.TEXT_HTML)
    public String orderBike(@PathParam("bikeId") String bikeId) {
        return null;
    }
}
