/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 * A class that models a User for Uno Online.
 * The user has a name and a password.
 * 
 * @author dancye, 2019
 */
public class User {
    private String name;
    private String password;

    /**
     * a constructor that takes in the user's name and password
     * 
     * @param givenName
     * @param givenPass
     */
    public User(String givenName, String givenPass) {
        name = givenName;
        password = givenPass;
    }

    public User(String name, String password, PasswordValidator validator) {
        this.name = name;
        if (validator.validate(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Invalid password.");
        }
    }

    /**
     * The getter for the user name
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * The setter for the user name
     * 
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * The getter for the password
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * A setter for the password
     * 
     * @param givenPass
     */
    public void setPassword(String givenPass) {
        password = givenPass;
    }

}
