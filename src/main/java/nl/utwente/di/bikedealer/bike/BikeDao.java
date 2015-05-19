package nl.utwente.di.bikedealer.bike;

import javax.ws.rs.Path;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tim on 19-5-15.
 */

@Path("/dao")
public class BikeDao {

    public Map<Integer, Bike> bikeMap = new HashMap<Integer, Bike>();


    private static BikeDao instance;

    private BikeDao() {

    }

    public Map<Integer, Bike> getBikeMap() {
        return bikeMap;
    }

    public static BikeDao getInstance() {
        if (instance == null){
            instance = new BikeDao();
        }
        return instance;
    }

}
