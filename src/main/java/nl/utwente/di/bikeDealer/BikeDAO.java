package nl.utwente.di.bikeDealer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by gerben on 19-5-15.
 */
public class BikeDAO {
    private static BikeDAO instance;
    private HashMap<String, Bike> bikes;
    private String lastId = "1";

    public BikeDAO() {
        bikes = new HashMap<>();
    }


    public static BikeDAO getInstance(){
        if(instance == null){
            instance = new BikeDAO();
        }
        return instance;
    }

    public HashMap<String, Bike> getBikes() {
        return bikes;
    }

    public List<Bike> getBikesByColourAndGender(String colour, String gender){
        ArrayList<Bike> out = new ArrayList<>();
        for (Bike bike: bikes.values()){
            if(( colour.equals("")|| colour.equals(bike.getColour())) && ( gender.equals("")|| gender.equals(bike.getGender())) ){
                out.add(bike);
            }
        }
        return out;
    }

    public void addBike(Bike bike){
        bikes.put(bike.getId(), bike);
    }

    public String getNewId(){
        lastId = "" + (Integer.parseInt(lastId) + 1);
        return lastId;
    }

}
