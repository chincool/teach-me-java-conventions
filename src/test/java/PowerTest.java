import org.junit.jupiter.api.Test;
import powerpackage.PowerFinder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerTest {
    @Test
    public void shouldReturnOneIfOneIsRaisedToOne() {
        PowerFinder powerFinder = new PowerFinder(1,1);
        int result = powerFinder.findPowerOf();
        Boolean isCorrect = powerFinder.isResultCorrect(result,1);
        assertTrue(isCorrect);
    }

    @Test
    public void shouldReturnTwoIfTwoIsRaisedToOne() {
        PowerFinder powerFinder = new PowerFinder(2,1);
        int result = powerFinder.findPowerOf();
        Boolean isCorrect = powerFinder.isResultCorrect(result,2);
        assertTrue(isCorrect);
    }

    @Test
    public void shouldReturnFourIfTwoIsRaisedToTwo() {
        PowerFinder powerFinder = new PowerFinder(2,2);
        int result = powerFinder.findPowerOf();
        Boolean isCorrect = powerFinder.isResultCorrect(result,4);
        assertTrue(isCorrect);
    }

    @Test
    public void shouldReturnSixIfThreeIsRaisedToTwo() {
        PowerFinder powerFinder = new PowerFinder(3,2);
        int result = powerFinder.findPowerOf();
        Boolean isCorrect = powerFinder.isResultCorrect(result,6);
        assertFalse(isCorrect);
    }
}
