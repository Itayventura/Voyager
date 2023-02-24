package user;

import java.util.UUID;

public class User {

    private String id;

    public User(String id) {
        this.id = id;
    }

    public User(UUID id) {
        this.id = id.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
