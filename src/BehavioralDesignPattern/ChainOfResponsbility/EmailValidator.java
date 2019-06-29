package BehavioralDesignPattern.ChainOfResponsbility;

public class EmailValidator extends Validator {

    @Override
    public boolean isValidate(String input, String type) {
        if(type.equalsIgnoreCase("email")) {
            return input.contains("@");
        }
        return dispatchNext(input, type);
    }
}
