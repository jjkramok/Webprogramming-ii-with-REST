package nl.utwente.di.bikedealer.bike;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by tim on 19-5-15.
 */

@Path("/resources")
public class BikeService {

    @POST
    @Produces(MediaType.TEXT_HTML)
    public String createBike(Bike bike) {
        return null;
    }

    public String getBikes() {
        return null;
    }

    public String getBikeDetails() {
        return null;
    }

    public String updateBikes(Bike bike) {
        return null;
    }

    public String deleteBike() {
        return null;
    }

    public String orderBike() {
        return null;
    }
}
