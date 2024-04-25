package DesignPattern.factory;

public class ShapeFactory {
    public Shape createShape(int numOfSides) {
        if(numOfSides == 1)
            return new Circle();
        if(numOfSides == 2)
            return new Line();
        if (numOfSides == 4)
            return new Rectangle();
        if (numOfSides == 3)
            return new Triangle();
        if( numOfSides == 5)
             return  new Pentagon();
        return null;
    }
}
