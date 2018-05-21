public class Circle {
    float radius;

    public Circle(float radius) {
              this.radius = radius;
    }
    public int getArea() {
        return (int)Math.ceil(3.14159265 * radius * radius);
    }

}
