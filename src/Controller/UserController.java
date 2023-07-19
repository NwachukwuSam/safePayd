package Controller;
import Services.UserServices;
import Services.UserServicesImpl;
import dtos.Requests.RegisterRequest;
public class UserController {
    private UserServices userServices = new UserServicesImpl();

    public Object register(RegisterRequest request){
        try {
            return userServices.register(request);
        }
        catch (IllegalArgumentException ex){
            return ex.getMessage();
        }
    }

    public Object findUserById(int id){
        return userServices.findUser(id);
    }
}
