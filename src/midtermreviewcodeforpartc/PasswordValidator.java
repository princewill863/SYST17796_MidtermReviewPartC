/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

import java.util.List;

public class PasswordValidator {
    private final List<PasswordRule> rules;

    public PasswordValidator(List<PasswordRule> rules) {
        this.rules = rules;
    }

    public boolean validate(String password) {
        for (PasswordRule rule : rules) {
            if (!rule.validate(password)) {
                System.out.println(rule.getErrorMessage());
                return false;
            }
        }
        return true;
    }
}



