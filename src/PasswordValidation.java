public class PasswordValidation {
    public boolean hasGoodLength(String password){
        return password.length() >= 12;
    }

    public boolean hasNoWhiteSpaces(String password){
        return !password.matches(".*\\s.*");
    }
}
