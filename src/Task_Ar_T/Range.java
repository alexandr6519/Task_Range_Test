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

    public double[][] intersection(double[] range_1, double[] range_2) {
        Range range = new Range(range_2[0], range_2[1]);
        double min_1 = Math.min(range_1[0], range_1[1]);
        double min_2 = Math.min(range_2[0], range_2[1]);
        double max_1 = Math.max(range_1[0], range_1[1]);
        double max_2 = Math.max(range_2[0], range_2[1]);
        double[][] r = {range_1, {0, 0}};

        if (isInside(min_1))
            if (isInside(max_1))
                return r;
            else
                return new double[][]{{min_1, max_2}, {0, 0}};
        else if (isInside(max_1))
            return new double[][]{{min_2, max_1}, {0, 0}};
        else
            //r = new double[][]{{0, 0}, {0, 0}};
            return new double[][]{{0, 0}, {0, 0}};//r;
    }
}
