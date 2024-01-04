package sasha;

class Calculator {
    void calculateFigure(Figure figure) {
	Object volume = figure.calculateVolume();
	String name = figure.getName();
	String additionalWord = "";

	if (figure instanceof Ball) {
	    additionalWord = "кульки-";
	} else if (figure instanceof Cone) {
	    additionalWord = "конуса-";
	} else if (figure instanceof Cylinder) {
	    additionalWord = "циліндрика  -";
	}

	if (figure.getClass() == Circle.class) {
	    System.out.printf("%-30s%-15s%-15s%n", "Величина площі кружочка", name + ":", "= " + volume);
	} else {
	    System.out.printf("%-30s%-15s%-15s%n", "Величина об'єму " + additionalWord, name + ":", "= " + volume);
	}
    }
}