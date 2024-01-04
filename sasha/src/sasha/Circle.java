package sasha;

class Circle extends Figure {
    protected double radius;
    private String name;

    Circle(double radius, String name) {
	this.radius = radius;
	this.name = name;
    }

    @Override
    Object calculateVolume() {
	if (radius >= 0) {
	    return Math.PI * radius * radius; // Площа для кола
	} else {
	    return "НЕ ВІДОМА ТАК ЯК НЕ МОЖЛИВО ЇЇ ОБЧИСЛИТИ ЧЕРЕЗ НЕВІРНІ ВХІДНІ ДАНІ...";
	}
    }

    @Override
    String getName() {
	return name;
    }
}