class Cube extends Rect {
    int depth;

    Cube(int width, int height, int depth) {
        super(width, height); // Call the constructor of Rect
        this.depth = depth;
    }

    int getVolume() {
        return getArea() * depth;
    }
}
