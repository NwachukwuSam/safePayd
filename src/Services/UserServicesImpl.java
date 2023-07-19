package Services;

import Data.Models.User;
import Data.Repositories.UserRepository;
import dtos.Requests.RegisterRequest;

public class UserServicesImpl implements UserServices{
    private UserRepository userRepository;
    @Override
    public User register(RegisterRequest request) {
        return null;
    }

    @Override
    public User register(String firstName, String lastName, String userName, String passWord) {
        if(userExist(userName)) throw new IllegalArgumentException(userName + "already exist");
        User user = new User();
        user.setUserName(userName);
        user.setLastName(lastName);
        user.setFirstName(firstName);
        user.setPassword(passWord);
        return userRepository.save(user);
    }
    private boolean userExist(String userName) {
        User foundUser = userRepository.findUserName(userName);
        if (foundUser!=null) return true;
        return false;
    }

    @Override
    public User findUser(int id) {
        return userRepository.findById(1);
    }
}
