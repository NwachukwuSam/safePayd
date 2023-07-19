package Data.Repositories;

import Data.Models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private int count;
    private List<User> users = new ArrayList<>();
    @Override
    public User save(User user) {
        boolean userHasNotBeenSaved = user.getId()==0;
        if (userHasNotBeenSaved) {
            user.setId(generateUserId());
            users.add(user);
            count++;
        }
        return user;
    }
    private int generateUserId(){
        return count+1;
    }

    @Override
    public User findById(int id) {
            for (User user : users)
                if  (user.getId()==id){
                    return user;
                }
            return null;
    }
    @Override
    public List<User> findAll() {
        for (User user:users){
            if (user.getId()>0)
                return users;
        }
        return null;
    }
    @Override
    public void delete(User user) {
        for (User userss : users)
            if  (userss.equals(user)){
                users.remove(user);
                break;
            }
        count--;
    }

    @Override
    public void deleteById(int id) {
        for (User user : users)
            if  (user.getId()==id){
                users.remove(user);
                break;
            }
        count--;
    }

    @Override
    public void deleteAll() {
        for (User user : users) {
            users.remove(user);
            break;
        }
        count = 0;
    }
    @Override
    public User findUserName(String userName) {
        for (User user: users){
            if (user.getUserName().equalsIgnoreCase(userName)) return user;
        }
        return null;
    }
    @Override
    public long count() {
        return count;
    }
}
