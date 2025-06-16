/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

public class HasDigitRule implements PasswordRule {
    @Override
    public boolean validate(String password) {
        return password.matches(".*\\d.*");
    }

    @Override
    public String getErrorMessage() {
        return "Password must contain at least one digit.";
    }
}
