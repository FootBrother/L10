package L10;

class Cshape {
    public double area() {
        return 0.0;
    }
}

class CCircle extends Cshape {
    private double radius;

    public CCircle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

class CSquare extends Cshape {
    private double sideLength;

    public CSquare(double sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }
}

class CTriangle extends Cshape {
    private double triangle_side;

    public CTriangle(double triangle_side) {
        this.triangle_side = triangle_side;
    }

    public double area() {
        return triangle_side * 5 / 2;
    }
}

public class class12 {

    public static double largest(Cshape... shapes) {
        double maxArea = -1.0;
        for (Cshape shape : shapes) {
            double area = shape.area();
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Cshape[] shapes = new Cshape[6]; // 創建父類別陣列

        shapes[0] = new CCircle(5.0);
        shapes[1] = new CCircle(10.0);

        shapes[2] = new CSquare(15.0);
        shapes[3] = new CSquare(20.0);

        shapes[4] = new CTriangle(25.0);
        shapes[5] = new CTriangle(30.0);

        for (Cshape shape : shapes) { // 從父類別陣列輸出子類別的面積
            double area = shape.area();
            System.out.println("面積:" + area);
        }

        double largestArea = largest(shapes);
        System.out.println("最大面積: " + largestArea);
    }
}
