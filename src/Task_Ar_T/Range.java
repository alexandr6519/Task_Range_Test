package Task_Ar_T;

public class Range {
    private double x;
    private double y;

    public Range(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getLength() {
        return Math.abs(this.x - this.y);
    }

    public boolean isInside(double x) {
        return (x >= Math.min(this.x, this.y) && x <= Math.max(this.x, this.y));
    }

    public Range getIntersection(Range range) {
        if (Math.max(this.x, range.x) >= Math.min(this.y, range.y)) {
            return null;
        }
        return new Range(Math.max(this.x, range.x), Math.min(this.y, range.y));
    }
}
