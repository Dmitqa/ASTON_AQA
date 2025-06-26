class Triangle implements GeometricFigure {
    private double side1;
    private double side2;
    private double side3;
    String backgroundColour;
    String boundaryColour;

    public Triangle(double side1, double side2, double side3, String boundaryColour, String backgroundColour) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.backgroundColour = backgroundColour;
        this.boundaryColour = boundaryColour;
    }

    public double getSquare() {
        double x = getPerimeter() / 2;
        return Math.sqrt(x * (x - side1) * (x - side2) * (x - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public void infoGeometricFigure() {
        System.out.println("Figure: " + getClass());
        System.out.println("Square: " + String.format("%.2f", getSquare()));
        System.out.println("Perimeter: " + String.format("%.2f", getPerimeter()));
        System.out.println("Background colour: " + backgroundColour);
        System.out.println("Boundary colour: " + boundaryColour);
        System.out.println();
    }
}
