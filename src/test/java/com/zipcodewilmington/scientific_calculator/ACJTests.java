package com.zipcodewilmington.scientificcalculator;
package com.zipcodewilmington.scientific_calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ACJTests {
public class ACJTests {

    private Memory myCalculator;

    @BeforeEach
    void setup() {
        myCalculator = new Memory();
    }

    // SIN TESTS
    @Test
    void sinOfZeroDisplaysZero() {
        myCalculator.changeNumber(0);
        myCalculator.sin();
        assertEquals("0.0", myCalculator.getDisplay());
    }

    @Test
    void sinDoesNothingWhenErrorIsActive() {
        myCalculator.setDisplay(10.0);
        myCalculator.divide(0);
        myCalculator.sin();
        assertEquals("Err", myCalculator.getDisplay());
    }

    // COS TESTS
    @Test
    void cosOfZeroDisplaysOne() {
        myCalculator.setDisplay(0.0);
        myCalculator.cos();
        assertEquals(1.0, myCalculator.getDisplay(), 0.0001);
    }

    @Test
    void cosDoesNothingWhenErrorIsActive() {
        myCalculator.divide(0);
        myCalculator.cos();
        assertEquals("Err", myCalculator.getDisplay());
    }

    // LOG TESTS
    @Test
    void log10Displays1For10() {
        myCalculator.setDisplay(10.0);
        myCalculator.log();
        assertEquals(1.0, myCalculator.getCurrentValue(), 0.0001);
    }

    @Test
    void logOfZeroDisplaysErr() {
        myCalculator.setDisplay(0.0);
        myCalculator.log();
        assertEquals("Err", myCalculator.getDisplay());
    }

    // TAN TESTS
    @Test
    void tanOfZeroDisplaysZero() {
        myCalculator.setDisplay(0.0);
        myCalculator.tan();
        assertEquals(0.0, myCalculator.getDisplay(), 0.0001);
    }

    @Test
    void tanDoesNothingWhenErrorIsActive() {
        myCalculator.divide(0);
        myCalculator.tan();
        assertEquals("Err", myCalculator.getDisplay());
    }

    // INVERSE TESTS
    @Test
    void sinInverseOfOneDisplaysPiOverTwo() {
        myCalculator.setDisplay(1.0);
        myCalculator.sinInverse();
        assertEquals(Math.PI / 2, myCalculator.getDisplay(), 0.0001);
    }

    @Test
    void sinInverseOfTwoDisplaysErr() {
        myCalculator.setDisplay(2.0);
        myCalculator.sinInverse();
        assertEquals("Err", myCalculator.getDisplay());
    }

    @Test
    void cosInverseOfOneDisplaysZero() {
        myCalculator.setDisplay(1.0);
        myCalculator.cosInverse();
        assertEquals(0.0, myCalculator.getDisplay(), 0.0001);
    }

    @Test
    void cosInverseOfTwoDisplaysErr() {
        myCalculator.setDisplay(2.0);
        myCalculator.cosInverse();
        assertEquals("Err", myCalculator.getDisplay());
    }

    @Test
    void tanInverseOfOneDisplaysPiOverFour() {
        myCalculator.setDisplay(1.0);
        myCalculator.tanInverse();
        assertEquals(Math.PI / 4, myCalculator.getDisplay(), 0.0001);
    }

    // MEMORY TESTS
    @Test
    void storingFiveInMemoryAndRecallingDisplaysFive() {
        myCalculator.setDisplay(5.0);
        myCalculator.memoryStore();
        myCalculator.setDisplay(0.0);
        myCalculator.memoryRecall();
        assertEquals(5.0, myCalculator.getDisplay());
    }

    @Test
    void memoryDefaultsToZeroOnCreation() {
        myCalculator.memoryRecall();
        assertEquals(0.0, myCalculator.getDisplay());
    }

    @Test
    void clearingMemoryAfterStoringFiveResetsToZero() {
        myCalculator.setDisplay(5.0);
        myCalculator.memoryStore();
        myCalculator.memoryClear();
        myCalculator.memoryRecall();
        assertEquals(0.0, myCalculator.getDisplay());
    }

    @Test
    void memoryAddWithDisplayOfThreeIncreasesMemoryByThree() {
        myCalculator.setDisplay(2.0);
        myCalculator.memoryStore();
        myCalculator.setDisplay(3.0);
        myCalculator.memoryAdd(3.0);
        myCalculator.memoryRecall();
        assertEquals(5.0, myCalculator.getDisplay());
    }

    @Test
    void memoryStoreDoesNothingWhenErrorIsActive() {
        myCalculator.setDisplay(5.0);
        myCalculator.memoryStore();
        myCalculator.setDisplay(0.0);
        myCalculator.divide(0); // triggers error

        myCalculator.setDisplay(99.0);
        myCalculator.memoryStore();
        myCalculator.memoryClear();
        myCalculator.memoryRecall();

        assertEquals(5.0, myCalculator.getDisplay());
    }

    @Test
    void memoryRecallDoesNothingWhenErrorIsActive() {
        myCalculator.setDisplay(5.0);
        myCalculator.memoryStore();
        myCalculator.divide(0); // triggers error

        myCalculator.memoryRecall();

        assertEquals("Err", myCalculator.getDisplay());
    }

}
        calculator.sinInverse();

        assertEquals(Math.PI / 2, calculator.getDisplay(), 0.0001);

