import javax.ws.rs.GET;
import javax.ws.rs.PathParam;

/**
 * Created by Olga Pavlova on 9/23/2016.
 */
public class SubResource_IDEA_158045 {

    @GET
    public NewClass fooSub(@PathParam("productId") final Integer productId) {
        return new NewClass();
    }
}
