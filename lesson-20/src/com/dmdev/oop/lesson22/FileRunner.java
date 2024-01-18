package com.dmdev.oop.lesson22;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * output stream application --------> file
 *
 * input stream application <-------- file
 *
 *
 */

public class FileRunner {
	public static void main(String[] args) throws IOException {
		File file = new File("resources/test.txt");

		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.createNewFile());
		System.out.println(file.createNewFile());
		
		 try (FileOutputStream fos = new FileOutputStream(file)) {
	            String textToWrite = "Україна — незалежна країна, розташована в Східній Європі. Столицею є місто Київ. Україна має багатий історичний спадок і була частиною Київської Русі, Великого князівства Литовського, Речі Посполитої та Російської імперії.\r\n"
	            		+ "\r\n"
	            		+ "Україна має різноманітний ландшафт, який включає Карпати, Кримські гори, степи та численні річки. Країна володіє багатим культурним спадком, включаючи традиції, народні співи, народні ремесла та архітектуру.\r\n"
	            		+ "\r\n"
	            		+ "Однією з головних рис України є мовна різноманітність. Офіційною мовою є українська, але також використовуються різні регіональні мови. Країна володіє багатою літературною та мистецькою спадщиною.\r\n"
	            		+ "\r\n"
	            		+ "Україна здобула незалежність у 1991 році, коли розпалася Радянський Союз. Сьогодні Україна є суверенною державою з багатим культурним спадком, яка продовжує розвиватися та змінюватися.\r\n"
	            		+ "";
	            fos.write(textToWrite.getBytes());
	            System.out.println("Текст успішно записано у файл.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getParent());
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());

		File dir = new File("resoutces/test1/test/folder");
		System.out.println(dir.isDirectory());
		System.out.println(dir.mkdirs());
		System.out.println(dir.list());
		String[] files = dir.list();

		System.out.println(dir.getAbsolutePath());

	}

}
