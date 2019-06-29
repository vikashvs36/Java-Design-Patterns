package CreationalDesignPatterns.Builder;

class User {

    private String username;
    private String password;
    private String address;
    private int zipcode;
    private Long mobileNumber;
    private int numberOfPet;
    private boolean isMarred;

    public User() { }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String address, int zipcode, Long mobileNumber, int numberOfPet, boolean isMarred) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.zipcode = zipcode;
        this.mobileNumber = mobileNumber;
        this.numberOfPet = numberOfPet;
        this.isMarred = isMarred;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getNumberOfPet() {
        return numberOfPet;
    }

    public void setNumberOfPet(int numberOfPet) {
        this.numberOfPet = numberOfPet;
    }

    public boolean isMarred() {
        return isMarred;
    }

    public void setMarred(boolean marred) {
        isMarred = marred;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", zipcode=" + zipcode +
                ", mobileNumber=" + mobileNumber +
                ", numberOfPet=" + numberOfPet +
                ", isMarred=" + isMarred +
                '}';
    }
}

class UserBuilder {

    private String username;
    private String password;
    private String address;
    private int zipcode;
    private Long mobileNumber;
    private int numberOfPet;
    private boolean isMarred;

    public UserBuilder(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder setZipcode(int zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public UserBuilder setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public UserBuilder setNumberOfPet(int numberOfPet) {
        this.numberOfPet = numberOfPet;
        return this;
    }

    public UserBuilder setMarred(boolean marred) {
        isMarred = marred;
        return this;
    }

    public User build() {
        return new User(username, password,address, zipcode, mobileNumber,numberOfPet,isMarred);
    }
}


public class Builder {
    public static void main(String[] args) {
        User user=new UserBuilder("vikash", "Singh").setAddress("Delhi").build();
        System.out.println(user);
    }
}
