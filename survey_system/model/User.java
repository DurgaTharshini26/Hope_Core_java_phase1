package survey_system.model;


// User represents a person who fills out a survey
// ENCAPSULATION: all fields are private, accessed only through getters
public class User {

    private String userId;
    private String name;
    private String email;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name   = name;
        this.email  = email;
    }

    // Getters
    public String getUserId() { return userId; }
    public String getName()   { return name; }
    public String getEmail()  { return email; }

    public void display() {
        System.out.println("User: " + name + " (" + email + ")");
    }
}
