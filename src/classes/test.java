package classes;

public class test {
    public static void main(String[] args) {
        triangle triangle1 = new triangle(5, 8, 5, 7, 3);
        triangle triangle2 = new triangle(4, 5, 4, 4, 4);

        double triangle1Area = triangle1.calculateArea();
        System.out.println("Area of triangle1: " + triangle1Area);

        double triangle2Area = triangle2.calculateArea();
        System.out.println("Area of triangle2: " + triangle2Area);

        System.out.println("Side one of triangle1: " + triangle1.sideLenOne);
        System.out.println("Side one of triangle2: " + triangle2.sideLenOne);

        System.out.println("There are " + triangle.numOfSides + " sides in the triangle ");
    }
}
