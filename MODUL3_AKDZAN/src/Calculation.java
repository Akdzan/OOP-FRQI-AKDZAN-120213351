public class Calculation implements Runnable {
    public double radius, sideLength, area;
    public final double PI = 3.14;

    @Override
    public void run() {
        System.out.println("====Program Will Start In====");
        System.out.println("");

        for (int i = 3; i > 0; i--) {
            System.out.println("Starting with thread " + i);
        }
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }

    public double getSquareArea() {
        return this.area;
    }

    public void setSquareArea() {
        if (sideLength < 1) {
            throw new IllegalArgumentException();
        } else {
            this.area = sideLength * sideLength;
        }
    }

    public double getCircleArea() {
        return this.area;
    }

    public void setCircleArea() {
        if (radius <= 1) {
            throw new IllegalArgumentException();
        } else {
            this.area = this.PI * radius * radius;
        }
    }

    public double getTrapezoidArea() {
        return this.area;
    }

    public void setTrapezoidArea(double side1, double side2, double height) {
        if ((side1 < 1 || side2 < 1)) {
            throw new IllegalArgumentException();
        } else {
            this.area = (side1 + side2) * height / 2;
        }
    }
}
