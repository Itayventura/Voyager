package user;

import io.smallrye.mutiny.Uni;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/users")
public class UserResource {

    final Logger logger;
    final UserService userService;

    @Inject
    public UserResource(Logger logger, UserService userService) {
        this.logger = logger;
        this.userService = userService;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<User> register(){
        return userService.register();
    }

    @Path("/{userId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<UserEntity> getUserById(@PathParam("userId") UUID userId){
        logger.infof("get user %s by id", userId.toString());
        return userService.getUser(userId);
    }
}
