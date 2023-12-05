import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTests {

    private final PasswordValidation passwordValidation;

    public PasswordValidationTests() {
        passwordValidation = new PasswordValidation();
    }

    @Test
    public void testHasGoodLength(){
        String password = "Topsecretkey123!";
        boolean lengthResult = passwordValidation.hasGoodLength(password);

        Assertions.assertTrue(lengthResult);
    }

    @Test
    public void testHasWrongLength(){
        String password = "Toshortsad1";
        boolean lengthResult = passwordValidation.hasGoodLength(password);

        Assertions.assertFalse(lengthResult);
    }

    @Test
    public void testHasNoWhiteSpaces(){
        String password = "Topsecretkey123!";
        boolean noWhiteSpacesResult = passwordValidation.hasNoWhiteSpaces(password);

        Assertions.assertTrue(noWhiteSpacesResult);
    }

    @Test
    public void testHasNoRepetitions(){
        String password = "Topsecretkey123!";
        boolean noRepetitionsResult = passwordValidation.hasNoRepetitions(password);

        Assertions.assertTrue(noRepetitionsResult);
    }

    @Test
    public void testHasNumbersWithNumbers(){
        Assertions.assertTrue(passwordValidation.hasNumbers("Topsecretkey123!"));
    }

    @Test
    public void testHasNumbersWithoutNumbers() {
        Assertions.assertFalse(passwordValidation.hasNumbers("NoNumbersHere"));
        Assertions.assertFalse(passwordValidation.hasNumbers(""));
        Assertions.assertFalse(passwordValidation.hasNumbers(null));
    }
}
