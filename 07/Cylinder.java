class Cylinder extends Circle {
    double height;

    Cylinder(double r, double h) {
        super(r); // Call the constructor of Circle
        height = h;
    }

    double getVolume() {
        return getArea() * height;
    }

    double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
