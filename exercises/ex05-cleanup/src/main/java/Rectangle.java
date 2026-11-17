/**
 * A rectangle with a width and a height.
 */
public class Rectangle {
    private double width;
    private double height;

    /**
     * Creates a rectangle with the given dimensions.
     *
     * @param width the initial width
     * @param height the initial height
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of this rectangle.
     *
     * @return the product of the width and height
     */
    public double area() {
        return width * height;
    }

    /**
     * Multiplies both dimensions of this rectangle by the given factor.
     *
     * @param factor the multiplier for the width and height
     */
    public void scale(double factor) {
        width = width * factor;
        height = height * factor;
    }

    /**
     * Compares this rectangle's area with another rectangle's area.
     *
     * @param other the rectangle to compare with
     * @return {@code true} if this rectangle's area is strictly greater
     */
    public boolean isLargerThan(Rectangle other) {
        return area() > other.area();
    }
}