package test;
import org.junit.jupiter.api.Test;
import src.Dollar;
import static org.junit.jupiter.api.Assertions.*;

public class DollarTest {
    
    @Test
    public void testMultiplication() {
       Dollar five = new Dollar(5);
       five.times(2);
       assertEquals(10, five.amount);
    }
}
