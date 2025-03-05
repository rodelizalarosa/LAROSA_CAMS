
package dashboard;


public class User {
    private String userType;
    private int userId;

    public User(String userType, int userId) {
        this.userType = userType;
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public int getUserId() {
        return userId;
    }
}
