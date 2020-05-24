package szx.pet_info.service;

import szx.pet_info.entity.User;

public interface IUserService {
    User login(String username, String password);
}
