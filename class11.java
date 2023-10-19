package L10;

class Cshape {
    public double area() {
        return 0.0;
    }
}

class CCircle extends Cshape { // a題
    private double radius;

    public CCircle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

class CSquare extends Cshape { // b題
    private double sideLength;

    public CSquare(double sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }
}

class CTriangle extends Cshape { // c題
    private double triangle_side;

    public CTriangle(double triangle_side) {
        this.triangle_side = triangle_side;
    }

    public double area() {

        return triangle_side * 5 / 2;
    }
}

public class class11 {

    public static double largest(Cshape... shapes){   //e題
        double maxArea = -1.0;
        for(Cshape shape : shapes){
            double area = shape.area();
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {

        CCircle circle1 = new CCircle(25.0); // (d題)建立圓形丶正方形與三角形物件各2個
        CCircle circle2 = new CCircle(20.0);
        double circlearea1 = circle1.area();
        double circlearea2 = circle2.area();
        System.out.println("圓面積:" + circlearea1);
        System.out.println("圓面積:" + circlearea2);
        System.out.println();

        CSquare square1 = new CSquare(4.0);
        CSquare square2 = new CSquare(8.0);
        double squareArea1 = square1.area();
        double squareArea2 = square2.area();
        System.out.println("正方形面積" + squareArea1);
        System.out.println("正方形面積" + squareArea2);
        System.out.println();

        CTriangle triangle1 = new CTriangle(8.0);
        CTriangle triangle2 = new CTriangle(16.0);
        double triangleArea1 = triangle1.area();
        double triangleArea2 = triangle2.area();
        System.out.println("三角形面積" + triangleArea1);
        System.out.println("三角形面積" + triangleArea2);
        System.out.println();

        double largestArea = largest(circle1, circle2, square1, square2, triangle1, triangle2); // e題
        System.out.println("最大面積: " + largestArea);
    }
}
