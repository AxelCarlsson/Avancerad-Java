public class Shape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        shape.draw();
        circle.draw();
        triangle.draw();
        square.draw();

        System.out.println();

        shape.erase();
        circle.erase();
        triangle.erase();
        square.erase();
    }

    public void draw(){
        System.out.println("Draw shape");
    }
    public void erase(){
        System.out.println("Erase shape");
    }

}
