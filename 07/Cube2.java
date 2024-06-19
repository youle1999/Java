class Cube2 extends Rect2 {
    int depth;

    Cube2(int x, int y, int z) {
        super(x, y); // Call the constructor of Rect2
        this.depth = z;
    }

    int getVolume() {
        return getArea() * depth;
    }
}
