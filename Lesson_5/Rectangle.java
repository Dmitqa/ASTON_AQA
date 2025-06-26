class Rectangle implements GeometricFigure {
    private double side1;
    private double side2;
    String backgroundColour;
    String boundaryColour;

    public Rectangle(double side1, double side2, String boundaryColour, String backgroundColour) {
        this.side1 = side1;
        this.side2 = side2;
        this.backgroundColour = backgroundColour;
        this.boundaryColour = boundaryColour;
    }

    public double getSquare() {
        return side1 * side2;
    }

    public double getPerimeter() {
        return side1 * 2 + side2 * 2;
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
