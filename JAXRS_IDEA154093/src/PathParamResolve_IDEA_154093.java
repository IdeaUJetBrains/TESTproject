import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by Olga Pavlova on 5/12/2016.
 */
//@Path("/test" + "/{id}" )
//@Path("/{id}" + "/test" )
@Path(SubResource_IDEA_154093.EXAMPLE + "/{id}")
public class PathParamResolve_IDEA_154093 {

    @GET
    public String getExample(@PathParam("id") Integer id) {
        return "Example no. " + id.toString();
    }

}