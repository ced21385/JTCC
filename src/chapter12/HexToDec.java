package chapter12;

import java.util.Scanner;
import java.lang.NumberFormatException;
import java.lang.System;
import java.lang.String;

public class HexToDec {

    public static void main(String[] args) {

        System.out.print("Enter a hex number: ");
        Scanner input = new Scanner(System.in);
        String hex = input.nextLine();

        try {
            System.out.println("Decimal: " + HexToDec.hexToDecimal(hex));
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }

    }

    public static int hexToDecimal(String hex) throws NumberFormatException {
        int decimalValue = 0;
        char hexChar;
        for (int i = 0; i < hex.length(); i++) {
            hexChar = hex.charAt(i);
            if (hexChar < '0' || hexChar > '9') {
                if (hexChar < 'A' || hexChar > 'F') {
                    throw new NumberFormatException("Illegal Character: " + hexChar);
                }
                decimalValue = Integer.parseInt(hex, 16);
            }

        }
        return decimalValue;
    }
}

