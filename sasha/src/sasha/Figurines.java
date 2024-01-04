package sasha;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;

public class Figurines {
    public static void main(String[] args) {
	long startTime = System.nanoTime();

	System.out.println("Старт програми");

	List<Figure> figures = new ArrayList<>();
	figures.add(new Circle(1.0, "smollCircle"));
	figures.add(new Circle(32, "bigCircle"));
	figures.add(new Cylinder(1.0, 1.0, "smollCylinder"));
	figures.add(new Cylinder(5.0, 10.0, "bigCylinder"));
	figures.add(new Cone(1.0, 1.0, "smollCone"));
	figures.add(new Cone(5.0, 10.0, "bigCone"));
	figures.add(new Ball(2.0, "smallBall"));
	figures.add(new Ball(8.0, "bigBall"));
	figures.add(new Ball(8.0, "середній Ball"));
	figures.add(new Circle(3.5, "mediumCircle"));
	figures.add(new Cylinder(2.5, 5.0, "shortCylinder"));
	figures.add(new Ball(6.0, "ще ма'ячик"));
	figures.add(new Ball(8.0, "салага"));
	figures.add(new Ball(66.0, "салага"));
	figures.add(new Ball(66.0, "салага"));
	figures.add(new Ball(36.0, "салага"));
	figures.add(new Ball(16.0, "салага"));
	figures.add(new Ball(6.0, "салага"));
	figures.add(new Ball(6.0, "салага"));
	figures.add(new Ball(6.0, "салага"));
	figures.add(new Ball(6.0, "салага"));
	figures.add(new Ball(6.0, "салага"));
	figures.add(new Ball(6.0, "салага"));

	Collections.sort(figures, new Comparator<Figure>() {
	    @Override
	    public int compare(Figure figure1, Figure figure2) {
		return figure1.getName().compareTo(figure2.getName());
	    }
	});

	Calculator calculator = new Calculator();

	for (Figure figure : figures) {
	    calculator.calculateFigure(figure);
	}

	System.out.println("Кількість створених фігур: " + figures.size());
	// Виводимо відсортований ліст
	for (Figure figure : figures) {
	    // System.out.println(figure.getName());
	}

	Set<String> uniqueNames = new HashSet<>();

	List<Figure> uniqueFigures = new ArrayList<>();

	for (Figure figure : figures) {
	    if (uniqueNames.add(figure.getName())) {
		uniqueFigures.add(figure);
	    }
	}
	
	System.out.println("\nІмена всіх унікальних фігур  ");
	for (String name : uniqueNames) {
	    System.out.println(name);
	}
	
	System.out.println("Кількість унікальних імен: " + uniqueNames.size());

	// Виведемо час виконання
	Long endTime = System.nanoTime();
	long durationInNanos = endTime - startTime;

	// Мілісекунди
	long durationInMillis = durationInNanos / 1_000_000;
	System.out.println("\nЧас виконання програми в мілісекундах:  " + durationInMillis + " мс");

	// Мікросекунди
	long durationInMicros = durationInNanos / 1_000;
	System.out.println("                       в мікросекундах: " + durationInMicros + " мкс");

	// Наносекунди
	System.out.println("                       в наносекундах:  " + durationInNanos + " нс");

    }
}
