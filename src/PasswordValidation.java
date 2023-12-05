public class PasswordValidation {
    public boolean hasGoodLength(String password){
        return password.length() >= 12;
    }

    public boolean hasNoWhiteSpaces(String password){
        return !password.matches(".*\\s.*");
    }

    public boolean hasNoRepetitions(String password){
        for(int i = 0; i < password.length() - 1; i++){
            if(password.charAt(i) == password.charAt(i + 1)){
                return false;
            }
        }

        return true;
    }
}
