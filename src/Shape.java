
abstract class Shape {
    protected int x;
    protected int y;

    public Shape(){};

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();

    public abstract double calculateCircumference();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}





