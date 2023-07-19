import Controller.UserController;
import dtos.Requests.RegisterRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

//@SpringBootApplication
public class Main {
    private static UserController userController = new UserController();
        public static void main(String[] args) {
            //SpringApplication.run(main.class, args);
            startApp();
        }
    private static void startApp(){
            String message = """
                Hi, What brings you here?
                1-> Register
                2-> Find Users
                """;
            String input = UserInput(message);
            switch (input.charAt(0)){
                case '1' -> register();
                case '2' -> findUser();
                default ->  {
                    display("Invalid input try again");
                    startApp();
                }
            }
        }
        private static void display(String message){
            JOptionPane.showMessageDialog(null, message);
        }
        private static String input(String prompt){
            return JOptionPane.showInputDialog(prompt);
        }
        private static String UserInput(String message){
            return input(message);
        }
        private static void register(){
            RegisterRequest request = new RegisterRequest();
            request.setFirstName(input("Enter First Name: "));
            request.setLastName(input("Enter Last Name: "));
            request.setUserName(input("Enter User Name: "));
            request.setPassword(input("Enter Password: "));
            var result = userController.register(request);
            display(request.toString());
            startApp();
        }
        private static void findUser(){
            int UserInput = Integer.parseInt(input("Enter User ID to search: "));

            display((String) userController.findUserById(UserInput));
            startApp();
        }
}