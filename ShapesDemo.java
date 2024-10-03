abstract class Shapes
{
    int a;
    int b;
    abstract void printArea();
}

class Rectangle extends Shapes
{
    Rectangle(int len, int bred)
    {
        super.a=len;
        super.b=bred;
    }
    void printArea()
    {
        double ar = super.a * super.b;
        System.out.println("Area of the rectangle is "+ar);
    }
}

class Triangle extends Shapes
{
    Triangle(int bre, int h)
    {
        super.a=bre;
        super.b=h;
    }
    void printArea()
    {
        double area = (0.5)*super.a*super.b;
        System.out.println("Area of the triangle is "+area);
    }
}

class Circle extends Shapes
{
    Circle(int r)
    {
        super.a=r;
    }
    void printArea()
    {
        double area1 = 3.14*super.a*super.a;
        System.out.println("Area of the circle is "+area1);
    }
}

class ShapesDemo
{
    public static void main(String args[])
    {
        Shapes rect = new Rectangle(6,3);
        rect.printArea();
        Shapes tri = new Triangle(2,8);
        tri.printArea();
        Shapes cir = new Circle(5);
        cir.printArea();
    }
}