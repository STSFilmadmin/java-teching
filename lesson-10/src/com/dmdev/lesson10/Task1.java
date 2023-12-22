package com.dmdev.lesson10;

public class Task1 {
    public static void main(String[] args) {
	String vaule = "Привіт як :(:(:(твої справи може :(:(випмо пивка щоб краще :(:(випмо пивка щоб 	краще :(:(випмо пивка щоб краще :(:(випмо пивка щоб краще :(:(:(було кодити? :(:(:(:(";
	String result = replace(vaule);
	System.out.println(result);
    }

    public static String replace(String vaule) {
	return vaule.replace(":(", ":)");

    }
}
