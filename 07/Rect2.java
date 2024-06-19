class Rect2 {
    int width;
    int height;

    Rect2(int x, int y) {
        this.width = x;
        this.height = y;
    }

    int getArea() {
        return width * height;
    }
}
