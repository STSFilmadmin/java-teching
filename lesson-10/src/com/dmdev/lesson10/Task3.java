package com.dmdev.lesson10;

/*написати функцію, що приймає як параметри ім'я, прізвище та
по батькові та повертає ініціали*/

public class Task3 {

    public static void main(String[] args) {

	String patronymicName = "Mukhaylovuch";
	String lastName = "Boilo";
	String firstName = "Vasyl";
	System.out.println(format(firstName, lastName, patronymicName));
    }

    public static String format(String firstName1, String lastName1, String patronymicName1) {
	char firstNameChar = firstName1.toUpperCase().charAt(0);
	char lastNameChar = lastName1.toUpperCase().charAt(0);
	char patronymicNameChar = patronymicName1.toUpperCase().charAt(0);
	// String fio = firstNameChar+lastNameChar+patronymicNameChar;
	// return firstNameChar+"."+lastNameChar+"."+patronymicNameChar;
	return String.format("%s.%s.%s", firstNameChar, lastNameChar, patronymicNameChar);

    }
}
