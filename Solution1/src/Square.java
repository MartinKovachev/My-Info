public class Square {
    float width;

    public Square(float width) {
        this.width = width;
    }

    public int getArea() {
        return (int)Math.ceil(width * width);
    }
}
