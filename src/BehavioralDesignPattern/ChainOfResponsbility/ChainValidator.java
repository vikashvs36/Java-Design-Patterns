package BehavioralDesignPattern.ChainOfResponsbility;

public class ChainValidator {

    public static Validator getBean() {
        Validator entryValidator = new EmailValidator();
        Validator numberlValidator = new NumberlValidator();
        Validator passwordValidator = new PasswordValidator();

        entryValidator.setNextValidator(numberlValidator);
        numberlValidator.setNextValidator(passwordValidator);
        return entryValidator;
    }
}
