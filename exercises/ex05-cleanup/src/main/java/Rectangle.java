
/**
 * Represents a rectangle with a width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
   */
  public Rectangle(double w, double h) {
    width = w;
    height = h;
  }

  /**
   * Calculates the area of the rectangle.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the factor by which we scale the rectangle
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Checks whether this rectangle is larger than another rectangle.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has a greater area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}