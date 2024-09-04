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
    public void testBinarySearchElementFound() {
        Main main = new Main();
        int arr[] = {2, 3, 4, 10, 40};
        int result = main.binarySearch(arr, 0, arr.length - 1, 10);
        assertEquals(String.valueOf(3), result, "Element should be at index 3");
    }
    @Test
    public void testAdditionOperation() {
        ArithmeticOperation add = (a, b) -> a + b;
        assertEquals(String.valueOf(30), add.operate(20, 10), "20 + 10 should be 30");
    }

    @Test
    public void testSubtractionOperation() {
        ArithmeticOperation subtract = (a, b) -> a - b;
        assertEquals(String.valueOf(10), subtract.operate(20, 10), "20 - 10 should be 10");
    }


}
