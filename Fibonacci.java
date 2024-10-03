class Fibonacci
{
    public static void main(String args[])
    {
        int n=5,temp;
        int num1=0,num2=1;
        for(int i=0;i<n;i++)
        {
            if(i==0 || i==1)
            {
                System.out.println(i);
            }
            else
            {
                temp=num1+num2;
                num1=num2;
                num2=temp;
                System.out.println(temp);
            }
        }
    }
}