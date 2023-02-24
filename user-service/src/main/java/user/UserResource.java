package user;

import io.smallrye.mutiny.Uni;
//import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {

//    Logger logger;

    @Path("/{userId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<User> getUserById(@PathParam("userId") String userId){
        return Uni.createFrom().item(new User(userId));
    }
}
