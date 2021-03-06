package model;

/*
 * Class for users of the application
 * @author Bharath Kalidindi
 */
public class User {

    //attributes of User
    private String username;
    private String password;
    private String name;
    private String email;
    private String streetAddress;
    private AccountType accountType;

    /*
     * Creates a new user
     * @param username the username for the user
     * @param password the password for the user
     * @param name the name of the user
     * @param accountType the type of account that this user has
     */
    public User(String username, String password,
        String name, AccountType accountType) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.accountType = accountType;
    }

    /*
     * Creates a new user
     * @param username the username for the user
     * @param password the password for the user
     * @param name the name of the user
     */
    public User(String username, String password, String name) {
        this(username, password, name, AccountType.USER);
    }

    /**
     * gets the username
     * @return username of user
     */
    public String getUsername() {
        return username;
    }

    /**
     * gets the username of user
     * @return username
     */
    public String getPassword() {
        return password;
    }

    /**
     * gets the name of user
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * gets the email of user
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * gets the street address of user
     * @return street address
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * gets the account type of user
     * @return account type
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * sets the username of user
     * @param newUsername new username
     */
    public void setUsername(String newUsername) {
        username = newUsername;
    }

    /**
     * sets the password of user
     * @param newPassword new password
     */
    public void setPassword(String newPassword) {
        password = newPassword;
    }

    /**
     * sets the name of user
     * @param newName new name
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * sets the email of user
     * @param newEmail new email
     */
    public void setEmail(String newEmail) {
        email = newEmail;
    }

    /**
     * sets the street address of user
     * @param newStreetAddress new street address
     */
    public void setStreetAddress(String newStreetAddress) {
        streetAddress = newStreetAddress;
    }

    /**
     * sets the account type of user
     * @param newAccountType new account type
     */
    public void setAccountType(AccountType newAccountType) {
        accountType = newAccountType;
    }

    /**
     * Set equals to compare usernames.
     * @param obj the user instance
     * @return whether the object is a person and their username matches
     */
    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User usr = (User) obj;
        return this.username.equals(usr.username);
    }

    /**
     * Set hash code equal to the username's hashcode.
     * @return the username's hashcode
     */
    @Override
    public int hashCode() {
        return username.hashCode();
    }

    /**
     *
     * @return the username's string
     */
    @Override
    public String toString() {
        return username;
    }
}
