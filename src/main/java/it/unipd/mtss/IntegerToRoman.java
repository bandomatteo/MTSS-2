////////////////////////////////////////////////////////////////////
// Matteo Umatche 1189718
// Matteo Bando 1226287 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

  private static final String[] romanNumerals = {
      "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
  };

  private static final int[] arabicNumbers = {
      1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
  };

  public static String convert(int number) {
    if (number < 1 || number > 1000) {
      throw new IllegalArgumentException("Number must be between 1 and 1000");
    }

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < romanNumerals.length; i++) {
      while (number >= arabicNumbers[i]) {
        result.append(romanNumerals[i]);
        number -= arabicNumbers[i];
      }
    }

    return result.toString();
  }

}