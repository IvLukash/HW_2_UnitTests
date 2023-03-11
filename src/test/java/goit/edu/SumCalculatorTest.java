package goit.edu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    public void testThatSum1WorksCorrect() {
        //when
        int actual = calc.sum(1);
        //then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSum3WorksCorrect() {
        //when
        int actual = calc.sum(3);
        //then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSum0ThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calc.sum(0)
        );
    }
}