package dtos.Requests;

public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /*@Override
    public String toString() {
        return "RegisterRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

     */
    public String toString() {
        return String.format("""
                ========================
                First Name: %s
                Last Name: %s
                UserName :%s
                Password :%s
                ========================""", firstName, lastName, userName, password);
    }
}
