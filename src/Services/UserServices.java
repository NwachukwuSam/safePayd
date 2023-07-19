package Services;

import Data.Models.User;
import dtos.Requests.RegisterRequest;

public interface UserServices {
    User register(RegisterRequest registerRequest);

    User register(String firstName, String lastName, String userName, String passWord);

    User findUser(int id);
}
