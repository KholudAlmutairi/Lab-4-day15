
class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height,double base){
        this.height=height;
        this.base=base;
    }

    public Triangle(int x, int y, double height, double base) {
        super(x, y);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculateCircumference() {
        // Perimeter of an equilateral triangle: 3 * side
        return 3 * base;
    }
}