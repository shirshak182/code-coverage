import org.example.ArithmeticOperation;
import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author - Shirshak Upadhayay
 * @Date - 04/09/2024
 */
public class MainTest {

    @Test
    public void testAdditionOperation() {
        ArithmeticOperation add = (a, b) -> a + b;
        assertEquals("20 + 10 should be 30",String.valueOf(30), String.valueOf(add.operate(20, 10)));
    }

    @Test
    public void testSubtractionOperation() {
        ArithmeticOperation subtract = (a, b) -> a - b;
        assertEquals("20 - 10 should be 10",String.valueOf(10), String.valueOf(subtract.operate(20, 10)));
    }


}
