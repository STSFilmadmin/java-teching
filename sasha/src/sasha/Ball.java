package sasha;

class Ball extends Circle {
    Ball(double radius, String name) {
	super(radius, name);
    }

    @Override
    Object calculateVolume() {
	if (radius >= 0) {
	    return (4.0 / 3.0) * Math.PI * radius * radius * radius;
	} else {
	    return "НЕ ВІДОМА ТАК ЯК НЕ МОЖЛИВО ЇЇ ОБЧИСЛИТИ ЧЕРЕЗ НЕВІРНІ ВХІДНІ ДАНІ...";
	}
    }
}