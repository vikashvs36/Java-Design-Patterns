package BehavioralDesignPattern.ChainOfResponsbility;

public class PasswordValidator extends Validator {
    @Override
    public boolean isValidate(String input, String type) {
        if (type.equalsIgnoreCase("password")) {
            return input.length() > 6;
        }
        return dispatchNext(input, type);
    }
}