////////////////////////////////////////////////////////////////////
// Matteo Umatche 1189718
// Matteo Bando 1226287 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;
import java.util.regex.Pattern;

public class RomanPrinter {

    public static String print(int num){

        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
        if(romanNumber.isEmpty() || !Pattern.matches("^(?!.*C\\S).*",romanNumber)){
            throw new IllegalArgumentException("Number must be between 1 and 100");
        }
        
        if(!Pattern.matches("^[IVXLC]+$", romanNumber)){
            throw new IllegalArgumentException("Not a Roman Number");
        }
        
        HashMap<String, String[]>  asciiArtNumerals= new HashMap<String, String[]>();
        String[] I={
            "   |_   _|   ", 
            "     | |     ", 
            "     | |     ", 
            "     | |     ",  
            "   |_____|   "};
        String[] V={
            " \\ \\    / /  ",
            "  \\ \\  / /   ",
            "   \\ \\/ /    ",
            "    \\  /     ",
            "     \\/      "};
        String[] X={
            "  \\ \\ / /    ",
            "   \\ V /     ",
            "    > <      ", 
            "   / . \\     ",
            "  /_/ \\_\\    "};
        String[] L={
            "  | |        ",
            "  | |        ",
            "  | |        ",
            "  | |____    ",
            "  |______|   "};
        String[] C={
            "  / ____|    ",
            "  | |        ",
            "  | |        ",
            "  | |_____   ",
            "   \\_____|   "};
       
        asciiArtNumerals.put("I",I);
        asciiArtNumerals.put("V",V);
        asciiArtNumerals.put("X",X);
        asciiArtNumerals.put("L",L);
        asciiArtNumerals.put("C",C);

        StringBuilder output = new StringBuilder();
        output.append("\n");
        for(int i = 0; i < 5; i++){
            for(int j=0;j<romanNumber.length();j++){
                String RomanLetter=String.valueOf(romanNumber.charAt(j));
                String[] AsciiArt=asciiArtNumerals.get(RomanLetter);
                output.append(AsciiArt[i]);
            }
            output.append("\n");
        }
        return output.toString();
    }
}