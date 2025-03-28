package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void bigAndSmallBars() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", result);
    }
}
