class Circle implements GeometricFigure {
    private double radius;
    String backgroundColour;
    String boundaryColour;

    public Circle(double radius, String boundaryColour, String backgroundColour) {
        this.radius = radius;
        this.backgroundColour = backgroundColour;
        this.boundaryColour = boundaryColour;
    }

    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
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
