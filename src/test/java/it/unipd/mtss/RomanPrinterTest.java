////////////////////////////////////////////////////////////////////
// Matteo Umatche 1189718
// Matteo Bando 1226287 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;



public class RomanPrinterTest {

    @Test(expected = IllegalArgumentException.class)
    public void printBiggerThanC_ExceptionThrown() {
        // Arrange
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(101)).thenReturn("CI");
        }

        // Act
        RomanPrinter.print(101);
    }
    @Test
    public void PrintNumberOne_AsciiArt_I()
        //Arrange
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(1)).thenReturn("I");
        }
        String expectedOutput="\n"+
        "   |_   _|   \n"+ 
        "     | |     \n"+ 
        "     | |     \n"+ 
        "     | |     \n"+  
        "   |_____|   \n";
        //Act
        String actualOutput=RomanPrinter.print(1);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    
    @Test
    public void PrintNumberFive_AsciiArt_V(){
        //Arrange
        try(MockedStatic<IntegerToRoman> utilities =Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(5)).thenReturn("V");
        }
        String expectedOutput="\n"+
        " \\ \\    / /  \n"+
        "  \\ \\  / /   \n"+
        "   \\ \\/ /    \n"+
        "    \\  /     \n"+
        "     \\/      \n";
        //Act
        String actualOutput=RomanPrinter.print(5);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void PrintNumberTen_AsciiArt_X(){
        //Arrange
        try(MockedStatic<IntegerToRoman> utilities =Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(10)).thenReturn("X");
        }
        String expectedOutput="\n"+
        "  \\ \\ / /    \n"+
        "   \\ V /     \n"+
        "    > <      \n"+ 
        "   / . \\     \n"+
        "  /_/ \\_\\    \n";
        //Act
        String actualOutput=RomanPrinter.print(10);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void PrintNumberFifty_AsciiArt_L(){
        //Arrange
        try(MockedStatic<IntegerToRoman> utilities =Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(50)).thenReturn("L");
        }
        String expectedOutput="\n"+
        "  | |        \n"+
        "  | |        \n"+
        "  | |        \n"+
        "  | |____    \n"+
        "  |______|   \n";
        //Act
        String actualOutput=RomanPrinter.print(50);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void PrintNumberOneHundred_AsciiArt_C(){
        //Arrange
        try(MockedStatic<IntegerToRoman> utilities =Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(100)).thenReturn("C");
        }
        String expectedOutput="\n"+
        "  / ____|    \n"+
        "  | |        \n"+
        "  | |        \n"+
        "  | |_____   \n"+
        "   \\_____|   \n";
        //Act
        String actualOutput=RomanPrinter.print(100);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    
    @Test
    public void PrintNumberEightyNine_AsciiArt_LXXXIX(){
        //Arrange
        try(MockedStatic<IntegerToRoman> utilities =Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(89)).thenReturn("LXXXIX");
        }
        String expectedOutput="\n"+
    "  | |          \\ \\ / /      \\ \\ / /      \\ \\ / /       |_   _|     \\ \\ / /    \n"+
    "  | |           \\ V /        \\ V /        \\ V /          | |        \\ V /     \n"+
    "  | |            > <          > <          > <           | |         > <      \n"+
    "  | |____       / . \\        / . \\        / . \\          | |        / . \\     \n"+
    "  |______|     /_/ \\_\\      /_/ \\_\\      /_/ \\_\\       |_____|     /_/ \\_\\    \n";
        //Act
        String actualOutput=RomanPrinter.print(89);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
}
