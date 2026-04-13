package com.zipcodewilmington.scientific_calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.zipcodewilmington.scientificcalculator.Memory;

public class ACJTests {

private Memory myCalculator = new Memory();
    
// SIN TESTS
// Normal Behavior sin(0) should return 0
@Test
void sinOfZeroDisplaysZero() {
    myCalculator.changeNumber(0);
    myCalculator.sin();
    assertEquals("0.0", myCalculator.getDisplay());
}

// Error should return error if incorrect function performed
@Test
void sinDoesNothingWhenErrorIsActive() {
        myCalculator.setDisplay(10.0);
        myCalculator.divide(0); 
        myCalculator.sin();
        assertEquals("Err", myCalculator.getDisplay());
    }

//COS TESTS
//Normal behavior should return one
@Test
void cosOfZeroDisplaysOne() {
    myCalculator.setDisplay(0.0);
    myCalculator.cos();
    assertEquals(1.0, myCalculator.getCurrentValue(), 0.0001);
}

// Cos no display should result when error occurs
@Test
void cosDoesNothingWhenErrorIsActive() {
    myCalculator.divide(0);
    myCalculator.cos();
    assertEquals("Err", myCalculator.getDisplay());
    }

// LOG TESTS
// Normal behavior log of ten should return 10
@Test
void log10Displays10() {
    myCalculator.setDisplay(10);
    myCalculator.log();
    assertEquals(1.0, myCalculator.getCurrentValue(), 0.0001);
}

// Log of zero error should return "Err"
@Test
void logOfZeroDisplaysErr() {
    myCalculator.setDisplay(0.0);
    myCalculator.log();
    assertEquals("Err", myCalculator.getDisplay());
}

// TAN TESTS
// Normal behavior of tan of zero should return 0
@Test
void tanOfZeroDisplaysZero() {
    myCalculator.setDisplay(0.0);
    myCalculator.tan();
    assertEquals(0.0, myCalculator.getCurrentValue(), 0.0001);
}

// No action should occur when error is made
@Test
void tanDoesNothingWhenErrorIsActive() {
    myCalculator.divide(0);
    myCalculator.tan();
    assertEquals("Err", myCalculator.getDisplay());
}

// INVERSE TESTS

//SININVERSE TEST - NORMAL BEHAVIOR
// Normal behavior should occur when sinInverse of 1 is PI/2
@Test
void sinInverseOfOneDisplaysPiOverTwo() {
    myCalculator.setDisplay(1.0);
    myCalculator.sinInverse();
    assertEquals(Math.PI / 2, myCalculator.getCurrentValue(), 0.0001);
}

//SININVERSE TEST - ERROR
// Error should return when sinInverse value is outside -1 to 1
@Test
void sinInverseOfTwoDisplaysErr() {
    myCalculator.setDisplay(2.0); 
    myCalculator.sinInverse();
    assertEquals("Err", myCalculator.getDisplay());
}

// COSINVERSE TEST - NORMAL BEHAVIOR
// Normal behavior should express cosInverse of 1 is 0
@Test
void cosInverseOfOneDisplaysZero() {
    myCalculator.setDisplay(1.0);
    myCalculator.cosInverse();
    assertEquals(0.0, myCalculator.getCurrentValue(), 0.0001);
}

// COSINVERSE TEST - ERROR
// Error returns when cosInverse value is outside -1 to 1
@Test
void cosInverseOfTwoDisplaysErr() {
    myCalculator.setDisplay(2.0);
    myCalculator.cosInverse();
    assertEquals("Err", myCalculator.getDisplay());
}

// TANINVERSE TEST - NORMAL BEHAVIOR
// Normal behavior of tanInverse of 1 displays PI/4
@Test
void tanInverseOfOneDisplaysPiOverFour() {
    myCalculator.setDisplay(1.0);
    myCalculator.tanInverse();
    assertEquals(Math.PI / 4, myCalculator.getCurrentValue(), 0.0001);
    }

// TANINVERSE TEST - ERROR
// MATH FACT - tanInverse has no error situation — all values are valid


// MEMORY TESTS

// MEMORY TEST - NORMAL BEHAVIOR
// Normal behavior should be added to stored value and update display
@Test
void storingFiveInMemoryAndRecallingDisplaysFive() {  
    myCalculator.setDisplay(5.0);
    myCalculator.memoryStore();
    myCalculator.setDisplay(0.0);
    myCalculator.memoryRecall();
    assertEquals(5.0, myCalculator.getCurrentValue(), 0.0001);
}

// Normal behavior — memory defaults to zero
@Test
void memoryDefaultsToZeroOnCreation() {
    myCalculator.memoryRecall();
    assertEquals(0.0, myCalculator.getCurrentValue(), 0.0001);
}

// Normal behavior — memory clear resets to zero
@Test
void clearingMemoryAfterStoringFiveResetsToZero() {
    myCalculator.setDisplay(5.0);
    myCalculator.memoryStore();
    myCalculator.memoryClear();
    myCalculator.memoryRecall();
    assertEquals(0.0, myCalculator.getCurrentValue(), 0.0001);
}

// Normal behavior — memoryAdd
@Test
void memoryAddWithDisplayOfThreeIncreasesMemoryByThree() {
    myCalculator.setDisplay(2.0);
    myCalculator.memoryStore();
    myCalculator.setDisplay(3.0);
    myCalculator.memoryAdd(3.0);
    myCalculator.memoryRecall();
    assertEquals(5.0, myCalculator.getCurrentValue(), 0.0001);
}

// MEMORY ERROR TESTS

// Error occurs when memoryStore blocked during error
@Test
void memoryStoreDoesNothingWhenErrorIsActive() {
    myCalculator.setDisplay(5.0);
    myCalculator.memoryStore();
    myCalculator.setDisplay(0.0);
    myCalculator.divide(0); // triggers error

// Store while error is active
    myCalculator.setDisplay(99.0);
    myCalculator.memoryStore();
    myCalculator.memoryClear();
    myCalculator.clearDisplay();
    myCalculator.memoryRecall();

// Memory should still be 5, not 99
    assertEquals(5.0, myCalculator.getCurrentValue(), 0.0001);
}

// Error testing memoryRecall blocked during error
    @Test
    void memoryRecallDoesNothingWhenErrorIsActive() {
    myCalculator.setDisplay(5.0);
    myCalculator.memoryStore();
    myCalculator.divide(0); // triggers error
    
    myCalculator.memoryRecall();

    assertEquals("Err", myCalculator.getDisplay());
    }

}


