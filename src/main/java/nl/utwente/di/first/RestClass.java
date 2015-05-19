package nl.utwente.di.first;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by gerben on 19-5-15.
 */
@Path("/hello")
public class RestClass{


    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHelloHTML(){
        return "<b>Hello!</b>";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloPLAIN(){
        return "Hello!";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getHelloXML(){
        return "<tag>Hello!</tag>";
    }
}
