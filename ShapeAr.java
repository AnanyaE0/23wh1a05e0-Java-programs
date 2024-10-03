class Shape
{
    int d1;
    int d2;
    Shape(int s)
    {
        d1=d2=s;
    }
    Shape(int l, int b)
    {
        d1=l;
        d2=b;
    }
    void printArea()
    {
        System.out.println("The area is "+(d1*d2));
    }
}

class ShapeAr
{
    public static void main(String args[])
    {
        Shape s2 = new Shape(4);
        s2.printArea();
        Shape s3 = new Shape(6,8);
        s3.printArea();
    }
}