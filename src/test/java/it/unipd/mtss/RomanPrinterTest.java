////////////////////////////////////////////////////////////////////
// Matteo Umatche 1189718
// Matteo Bando 1226287 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.fail;
// import static org.mockito.Mock;
// import static org.mockito.Mockito.when;

import org.junit.Ignore;
import org.junit.Test;

public class RomanPrinterTest {

    
    @Test
    public void PrintNumberOne_AsciiArt_I(){
        //Arrange
        // IntegerToRoman integerToRomanMock = Mockito.mock(IntegerToRoman.class);
        // Mockito.when(integerToRomanMock.convert(1)).thenReturn("I");
        String expectedOutput=
            "|_   _|\n" + 
            "  | |  \n" +
            "  | |  \n" +
            "  | |  \n" +
            "|_____|\n";
        //Act
        String actualOutput=RomanPrinter.print(1);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    
    @Test
    public void PrintNumberFive_AsciiArt_V(){
        //Arrange
        String expectedOutput=
            "\\ \\    / /\n"+
            " \\ \\  / / \n"+
            "  \\ \\/ /  \n"+
            "   \\  /    \n"+
            "    \\/     \n";
        //Act
        String actualOutput=RomanPrinter.print(5);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void PrintNumberTen_AsciiArt_X(){
        //Arrange
        String expectedOutput=
            " \\ \\ / / \n"+
            "  \\ V /  \n"+
            "   > <   \n"+
            "  / . \\  \n"+
            " /_/ \_\\ \n";
        //Act
        String actualOutput=RomanPrinter.print(10);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void PrintNumberFifty_AsciiArt_L(50){
        //Arrange
        String expectedOutput=
            " | |     \n"+
            " | |     \n"+
            " | |     \n"+
            " | |     \n"+
            " |______|\n";
        //Act
        String actualOutput=RomanPrinter.print();
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void PrintNumberOneHundred_AsciiArt_C(){
        //Arrange
        String expectedOutput=
            "  / ____|\n"+
            " | |     \n"+
            " | |     \n"+
            " | |     \n"+
            "  \\_____|\n";
        //Act
        String actualOutput=RomanPrinter.print(100);
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    /*
    @Ignore
    @Test
    public void PrintNumberEightyNine_AsciiArt_IXC(){
        //Arrange
        String expectedOutput="";
        //Act
        String actualOutput=RomanPrinter.print();
        //Assert
        assertEquals(expectedOutput, actualOutput);
    }*/
}

