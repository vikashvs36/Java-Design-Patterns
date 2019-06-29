package BehavioralDesignPattern.ChainOfResponsbility;

public abstract class Validator {
    protected Validator nextValidator;

    public void setNextValidator(Validator validator) {
        this.nextValidator = validator;
    }

    public boolean dispatchNext(String input, String type) {
        if(nextValidator != null) {
            return nextValidator.isValidate(input, type);
        }
        throw new RuntimeException("No validator found for "+type);
    }

    public abstract boolean isValidate(String input, String type);
}
