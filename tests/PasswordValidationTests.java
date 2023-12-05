import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTests {
    @Test
    public void testHasGoodLength(){
        PasswordValidation passwordValidation = new PasswordValidation();

        String password = "Topsecretkey123";

        boolean lengthResult = passwordValidation.hasGoodLength(password);
        Assertions.assertTrue(lengthResult);
    }

    @Test
    public void testHasWrongLength(){
        PasswordValidation passwordValidation = new PasswordValidation();

        String password = "Toshortsad1";

        boolean lengthResult = passwordValidation.hasGoodLength(password);
        Assertions.assertFalse(lengthResult);
    }
}
