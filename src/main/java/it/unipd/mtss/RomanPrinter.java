////////////////////////////////////////////////////////////////////
// Matteo Umatche 1189718
// Matteo Bando 1226287 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {

    public static String print(int num){

        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
        HashMap<String, String[]>  asciiArtNumerals= new HashMap<String, String[]>();
        String[] I={
            "|_   _|", 
            "  | |  ", 
            "  | |  ", 
            "  | |  ",  
            "|_____|"};
        String[] V={"\\ \\    / /"," \\ \\  / / ","  \\ \\/ /  ","   \\  /   ","    \\/    "};
        String[] L={" | |     "," | |     "," | |     "," | |     "," |______|"};
        String[] C={"  / ____|"," | |     "," | |     "," | |     ","  \\_____|"};
        asciiArtNumerals.put("I",I);
        asciiArtNumerals.put("V",V);
        asciiArtNumerals.put("L",L);
        asciiArtNumerals.put("C",C);

        String output="";
        for(int i = 0; i < 5; i++){
            for(int j=0;j<romanNumber.length();j++){
                String RomanLetter=String.valueOf(romanNumber.charAt(j));
                String[] AsciiArt=asciiArtNumerals.get(RomanLetter);
                output.concat(AsciiArt[i]);
            }
            output.concat("\n");
        }
        

        return output;
    }
}


