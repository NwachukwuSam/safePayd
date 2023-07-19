package Data.Repositories;

import Data.Models.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User findById(int id);
    long count();

    List<User> findAll();
    void delete(User user);
    void deleteById(int id);
    void deleteAll();
    User findUserName(String userName);
}
