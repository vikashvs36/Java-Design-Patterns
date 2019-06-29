package BehavioralDesignPattern.ChainOfResponsbility;

public class ChainTest {
    public static void main(String[] args) {
        /*Validator validator = new EmailValidator();
        Validator numberlValidator = new NumberlValidator();
        Validator passwordValidator = new PasswordValidator();

        validator.setNextValidator(numberlValidator);
        numberlValidator.setNextValidator(passwordValidator);*/

        boolean p = ChainValidator.getBean().isValidate("142556@2", "email");
        System.out.println(p);
    }
}
