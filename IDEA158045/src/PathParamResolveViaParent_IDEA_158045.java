import javax.ws.rs.Path;

@Path("/test")
public class PathParamResolveViaParent_IDEA_158045 {
    @Path("{productId}/components")
    public SubResource_IDEA_158045 foo() {
        return new SubResource_IDEA_158045();
    }
}
