import org.junit.Test;
import java.math.BigInteger;
import static org.junit.Assert.assertEquals;

public class Ctz {

    @Test
    public void testMin() {
        BigInteger[] numbers = {BigInteger.valueOf(5), BigInteger.valueOf(3), BigInteger.valueOf(9), BigInteger.valueOf(2), BigInteger.valueOf(7)};
        assertEquals(BigInteger.valueOf(2), Mtz._min(numbers));
    }

    @Test
    public void testMax() {
        BigInteger[] numbers = {BigInteger.valueOf(5), BigInteger.valueOf(3), BigInteger.valueOf(9), BigInteger.valueOf(2), BigInteger.valueOf(7)};
        assertEquals(BigInteger.valueOf(9), Mtz._max(numbers));
    }

    @Test
    public void testSum() {
        BigInteger[] numbers = {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)};
        assertEquals(BigInteger.valueOf(6), Mtz._sum(numbers));
    }

    @Test
    public void testMult() {
        BigInteger[] numbers = {BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)};
        assertEquals(BigInteger.valueOf(24), Mtz._mult(numbers));
    }
}