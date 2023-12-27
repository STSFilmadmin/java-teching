package com.dmdev.lesson10;

/**
 * 4. підрахувати кількість усіх крапок, ком і знаків оклику в рядку.
 */

public class Task4 {

    public static void main(String[] args) {
	String value = "dkslhjgfdsf!!!kjgh  gsda/dsg dsg,,,, ds,gsd.,,, sd";
	System.out.println(countSumbol(value));
    }

    private static int countSumbol(String value) {
	String result = value.replace(".", "").replace(",", "").replace("!", "");

	return value.length() - result.length();
    }

}
