package CreationalDesignPatterns.Builder.bean;

public class User {

    private int id;
    private String userName;
    private String password;

    // Optional Data variables
    private String firstName;
    private String lastName;

    private User(Builder builder){
        this.id=builder.id;
        this.userName=builder.userName;
        this.password=builder.password;
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
        private int id;
        private String userName;
        private String password;

        // Optional Data variables
        private String firstName;
        private String lastName;

        public Builder(int id, String userName, String password){
            this.id=id;
            this.userName=userName;
            this.password=password;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
