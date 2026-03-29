package Bai3;

public class Main {
    static void main(String[] args) {

        //Tạo các đối tượng
        Circle circle = new Circle(5.0);
        Rectangle rectangle= new Rectangle(4.0,3.0);
        Square square = new Square(5.0);

        //Thiết lập màu sắc
        circle.setColor("Red");
        rectangle.setColor("Blue");
        square.setColor("Green");

        //In ra
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Square color: " + square.getColor());
    }
}
