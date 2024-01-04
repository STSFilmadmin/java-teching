package sasha;

class Cone extends Cylinder {
Cone(double radius, double height, String name) {
    super(radius, height, name);
}

@Override
Object calculateVolume() {
    if (getRadius() > 0 && getHeight() >= 0) {
        return (1.0 / 3.0) * Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }
        return "НЕ ВІДОМА ТАК ЯК НЕ МОЖЛИВО ЇЇ ОБЧИСЛИТИ ЧЕРЕЗ НЕВІРНІ ВХІДНІ ДАНІ...";
    }
}