package dtos.Responses;
import javax.swing.*;
public class FindUserResponse {
    private String userId;
    private String fullName;
    private String userName;
    private String dateRegistered;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }
    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
    @Override
    public String toString() {
        return "FindUserResponse{" +
                "userId='" + userId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", userName='" + userName + '\'' +
                ", dateRegistered='" + dateRegistered + '\'' +
                '}';
    }
}
