
package chapter13;

import java.lang.System;
import java.lang.String;
import java.lang.Comparable;
import java.util.Arrays;
import java.math.BigInteger;

public class SortComparableObjects {

    public static void main(String[] args) {

        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city: cities) System.out.print(city + " ");
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"), new BigInteger("432232323239292"), new BigInteger("54623239292")};
        Arrays.sort(hugeNumbers);
        for (BigInteger number: hugeNumbers) System.out.print(number + " ");
        System.out.println();

        Comparable[] array = {"Savannah", new BigInteger("2323231092923992")};
//        Arrays.sort(array);

    }  // main()

}  // class SortComparableObjects