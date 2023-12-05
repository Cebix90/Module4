import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTests {

    private final PasswordValidation passwordValidation;

    public PasswordValidationTests() {
        passwordValidation = new PasswordValidation();
    }

    @Test
    public void testHasGoodLength(){
        Assertions.assertTrue(passwordValidation.hasGoodLength("Topsecretkey123!"));
    }

    @Test
    public void testHasWrongLength(){
        Assertions.assertFalse(passwordValidation.hasGoodLength("Toshortsad1"));
    }

    @Test
    public void testHasNoWhiteSpaces(){
        Assertions.assertTrue(passwordValidation.hasNoWhiteSpaces("Topsecretkey123!"));
    }

    @Test
    public void testHasNoRepetitions(){
        Assertions.assertTrue(passwordValidation.hasNoRepetitions("Topsecretkey123!"));
    }

    @Test
    public void testHasNumbersWithNumbers(){
        Assertions.assertTrue(passwordValidation.hasNumbers("Topsecretkey123!"));
    }

    @Test
    public void testHasNumbersWithoutNumbers() {
        Assertions.assertFalse(passwordValidation.hasNumbers("NoNumbersHere"));
        Assertions.assertFalse(passwordValidation.hasNumbers(""));
    }

    @Test
    public void testHasSpecialCharacter(){
        Assertions.assertTrue(passwordValidation.hasSpecialCharacter("Topsecretkey123!"));
    }

    @Test
    public void testIsNotNull(){
        Assertions.assertFalse(passwordValidation.isNotNull(null));
    }
}
