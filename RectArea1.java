class Rectangle1
{
    int len;
    int bred;
    Rectangle1(int l, int b)
    {
        len=l;
        bred=b;
    }
    double calcAreas()
    {
        double ar;
        ar = len*bred;
        return(ar);
    }
}

class RectArea1
{
    public static void main(String args[])
    {
        int l=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        Rectangle1 r = new Rectangle1(l,b);
        double a;
        a= r.calcAreas();
        System.out.println("Area of the rectangle is: "+a);
    }
}