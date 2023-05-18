////////////////////////////////////////////////////////////////////
// Matteo Umatche 1189718
// Matteo Bando 1226287 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.assertThrows;



public class RomanPrinterTest {
   
    @Test 
    public void Instanciate_ClassRomanPrinter_true() { 
        // Arrange 
        RomanPrinter romanPrinter; 
 
        // Act 
        romanPrinter = new RomanPrinter(); 
 
        // Assert 
        assertEquals(romanPrinter.getClass(), RomanPrinter.class); 
 
    }
    

    @Test(expected = IllegalArgumentException.class)
    public void printNotRoman_ExceptionThrown() {
        // Arrange
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(99999)).thenReturn("KK");
        }

        // Act
        RomanPrinter.print(99999);
    }

    @Test
    public void PrintNumberOne_AsciiArt_I(){
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
    public void PrintNumberFiveHundred_AsciiArt_D(){
        //Arrange
        try(MockedStatic<IntegerToRoman> utilities =Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(500)).thenReturn("D");
        }
        String expectedOutput="\n"+
        "  |  __ \\    \n"+
        "  | |  | |   \n"+
        "  | |  | |   \n"+
        "  | |__| |   \n"+
        "  |_____/    \n";
        //Act
        String actualOutput=RomanPrinter.print(500);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void PrintNumberOneThousand_AsciiArt_M(){
        //Arrange
        try(MockedStatic<IntegerToRoman> utilities =Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(1000)).thenReturn("M");
        }
        String expectedOutput="\n"+
        "  |  \\/  |    \n"+
        "  | \\  / |    \n"+
        "  | |\\/| |    \n"+
        "  | |  | |   \n"+
        "  |_|  |_|   \n";
        //Act
        String actualOutput=RomanPrinter.print(1000);
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

    @Test
    public void PrintNumberFourHundredSixtyEight_AsciiArt_CDLXVIII(){
        //Arrange
        try(MockedStatic<IntegerToRoman> utilities =Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(468)).thenReturn("CDLXVIII");
        }
        String expectedOutput="\n"+
    "  / ____|      |  __ \\      | |          \\ \\ / /     \\ \\    / /     |_   _|      |_   _|      |_   _|   \n"+   
    "  | |          | |  | |     | |           \\ V /       \\ \\  / /        | |          | |          | |     \n"+ 
    "  | |          | |  | |     | |            > <         \\ \\/ /         | |          | |          | |     \n"+
    "  | |_____     | |__| |     | |____       / . \\         \\  /          | |          | |          | |     \n"+
    "   \\_____|     |_____/      |______|     /_/ \\_\\         \\/         |_____|      |_____|      |_____|   \n";
        //Act
        String actualOutput=RomanPrinter.print(468);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
}
