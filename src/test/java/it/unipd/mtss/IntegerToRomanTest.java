////////////////////////////////////////////////////////////////////
// Matteo Umatche 1189718
// Matteo Bando 1226287 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class IntegerToRomanTest {
    // Test: convertire 1 in "I"
    @Test
    public void Convert_NumberOneToRoman_I() {
        // Arrange
        int input = 1;
        String expectedOutput = "I";

        // Act
        String actualOutput = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    // Test: convertire 4 in "IV"
    @Test
    public void Convert_NumberFourToRoman_IV() {
        // Arrange
        int input = 4;
        String expectedOutput = "IV";

        // Act
        String actualOutput = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    // Test: convertire 9 in "IX"
    @Test
    public void Convert_NumberNineToRoman_IX() {
        // Arrange
        int input = 9;
        String expectedOutput = "IX";

        // Act
        String actualOutput = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    // Test: convertire 40 in "XL"
    @Test
    public void Convert_NumberFortyToRoman_XL() {
        // Arrange
        int input = 40;
        String expectedOutput = "XL";

        // Act
        String actualOutput = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    // Test: convertire 100 in "C"
    @Test
    public void Convert_NumberOneHundredToRoman_C() {
        // Arrange
        int input = 100;
        String expectedOutput = "C";

        // Act
        String actualOutput = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Convert_NumbeIfBiggerThan1000_ExceptionThrown() {
        // Arrange
        int input = 10001;

        // Act
        IntegerToRoman.convert(input);
    }

    // Test: Do come input un numero negativo e controlla che venga lanciata
    // un'eccezione
    @Test(expected = IllegalArgumentException.class)
    public void Convert_NumbeIfNegative_ExceptionThrown() {
        // Arrange
        int input = -1;

        // Act
        IntegerToRoman.convert(input);
    }

    // Test: Do come input 0 e controlla che venga lanciata un'eccezione
    @Test(expected = IllegalArgumentException.class)
    public void Convert_NumbeIfZero_ExceptionThrown() {
        // Arrange
        int input = 0;

        // Act
        IntegerToRoman.convert(input);
    }

    // Test: Instanzia la classe IntegerToRoman
    @Test
    public void Instanciate_ClassIntegerToRoman() {
        // Arrange
        IntegerToRoman integerToRoman;

        // Act
        integerToRoman = new IntegerToRoman();

        // Assert
        assertEquals(integerToRoman.getClass(), IntegerToRoman.class);

    }
// Test: Controlla che il metodo convert ritorni una stringa
    @Test
    public void Convert_ReturnString() {
        // Arrange
        int input = 1;

        // Act
        String actualOutput = IntegerToRoman.convert(input);

        // Assert
        assertEquals(actualOutput.getClass(), String.class);

    }

    @Test(expected = java.lang.NumberFormatException.class)
    public void Convert_NumbeIfString_ExceptionThrown() {
        // Arrange
        String input = "ciao";

        // Act
        IntegerToRoman.convert(Integer.parseInt(input));

        // Assert
        fail();
    }

}