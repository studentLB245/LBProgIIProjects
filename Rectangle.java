class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4.0, 40.0);
        System.out.println("Area of Rectangle 1: " + r1.getArea());
        System.out.println("Perimeter of Rectangle 2: " + r2.getPerimeter());
    }
}
