package java17And21;


public sealed interface Shape permits Circle, Square, Triangles{
    // Common properties and methods for all shapes
}

final class Circle implements Shape {
    // Circle-specific properties and methods
}
final class Square implements Shape {
    // Circle-specific properties and methods
}
final class Triangles implements Shape {
    // Circle-specific properties and methods
}