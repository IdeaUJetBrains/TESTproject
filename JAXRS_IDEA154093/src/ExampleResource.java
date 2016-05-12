import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by Olga Pavlova on 5/12/2016.
 */
//@Path("/test" + "/{id}" )
//@Path("/{id}" + "/test" )
@Path(URLs.EXAMPLE + "/{id}")
public class ExampleResource {

    @GET
    public String getExample(@PathParam("id") Integer id) {
        return "Example no. " + id.toString();
    }

}