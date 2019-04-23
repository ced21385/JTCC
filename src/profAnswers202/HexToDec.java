package profAnswers202;
//chapter12
import java.util.Scanner;
import java.lang.NumberFormatException;
import java.lang.System;
import java.lang.String;

public class HexToDec {

    public static void main(String[] args) {
        System.out.print("Enter a hex number: ");
        Scanner input = new Scanner(System.in);
        String hex = input.nextLine();

        try {System.out.println("Decimal: " + HexToDec.hexToDecimal(hex));}
        catch (NumberFormatException ex) {System.out.println(ex);}
    }  // main()

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        char hexChar;
        for (int i = 0; i < hex.length(); i++) {
            hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + HexToDec.hexCharToDecimal(hexChar);
        }  // for
        return decimalValue;
    }  // hexToDecimal()

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') return 10 + ch - 'A';
        else if (ch >= 'a' && ch <= 'f') return 10 + ch - 'a';
        else if (ch >= '0' && ch <= '9') return      ch - '0';
        else throw new NumberFormatException("Illegal character: " + ch);
    }  // hexCharToDecimal()

}  // class HexToDec
