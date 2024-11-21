package metier;

import org.junit.Test;
import org.springframework.util.Assert;

public class CalculTest {
    private Calcul calcul;

    @Test
    public void testSomme() {
        calcul = new Calcul();
        double a = 5;
        double b = 2;
        double expected = 7;
        double res = calcul.sum(a, b);
        Assert.isTrue(res == expected);
    }
}
