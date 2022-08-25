package users_crud.service;

import users_crud.models.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void delete(User user);

    void update(User user);

    User getUser(Long id);
}
