class Rect
{
    int len;
    int bred;
    void getData(int l,int b)
    {
        len=l;
        bred=b;
    }
    double calculateArea()
    {
        double ar;
        ar= len*bred;
        return ar;
    }
}

class RectangleArea
{
    public static void main(String args[])
    {
        Rect r = new Rect();
        int length=Integer.parseInt(args[0]);
        int breadth = Integer.parseInt(args[1]);
        r.getData(length,breadth);
        double area;
        area = r.calculateArea();
        System.out.println("Area is "+area);
    }
}

   