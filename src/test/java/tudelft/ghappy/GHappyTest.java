package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.chocolate.ChocolateBags;

public class GHappyTest {
    @Test
    public void bigAndSmallBars() {
        boolean result = new GHappy().gHappy("gggggggg");
        Assertions.assertEquals(true, result);
    }
}
