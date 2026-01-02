// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

// Child class 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle with a radius");
    }
}

// Child class 2
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square with four equal sides");
    }
}

public class QuesD {
    public static void main(String[] args) {
        // Polymorphism in action: Using a Shape reference for different objects
        Shape myShape;

        myShape = new Circle();
        myShape.draw(); // Output: Drawing a Circle...

        myShape = new Square();
        myShape.draw(); // Output: Drawing a Square...
    }
}
