package user;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserMapper {

    public User toUser(UserEntity userEntity){
        return new User(userEntity.getId());
    }
}
