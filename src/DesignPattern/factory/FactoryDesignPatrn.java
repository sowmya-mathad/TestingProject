package DesignPattern.factory;

public class FactoryDesignPatrn {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = null;
        shape = factory.createShape(4);
        System.out.println("Return Shape is " + shape.getShape());
    }
}
