package sasha;

class Cylinder extends Figure {
    private double radius;
    private double height;
    private String name;

    Cylinder(double radius, double height, String name) {
	this.radius = radius;
	this.height = height;
	this.name = name;
    }

    public double getRadius() {
	return radius;
    }

    public double getHeight() {
	return height;
    }

    @Override
    Object calculateVolume() {
	if (radius >= 0 && height > 0 ) {
	    return Math.PI * radius * radius * height;
	} else {
	    return "НЕ ВІДОМА ТАК ЯК НЕ МОЖЛИВО ЇЇ ОБЧИСЛИТИ ЧЕРЕЗ НЕВІРНІ ВХІДНІ ДАНІ...";
	}
    }

    @Override
    String getName() {
	return name;
    }
}