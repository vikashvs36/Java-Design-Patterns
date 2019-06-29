package BehavioralDesignPattern.ChainOfResponsbility;

public class NumberlValidator extends Validator {
    @Override
    public boolean isValidate(String input, String type) {
        if(type.equalsIgnoreCase("number")) {
            try {
                Integer.parseInt(input);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return dispatchNext(input, type);
    }
}
