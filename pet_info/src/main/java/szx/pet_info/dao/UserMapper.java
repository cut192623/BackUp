package szx.pet_info.dao;

import szx.pet_info.entity.User;

public interface UserMapper {
    User login(String username, String password);
}
