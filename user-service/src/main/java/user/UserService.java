package user;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.UUID;

@ApplicationScoped
public class UserService {

    final UserRepository userRepository;
    final UserMapper userMapper;

    @Inject
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public Uni<User> register() {
        return userRepository.persistAndFlush(new UserEntity())
                .onItem().transform(userMapper::toUser);
    }

    public Uni<UserEntity> getUser(UUID userId){
        return userRepository.findById(userId);
    }
}
