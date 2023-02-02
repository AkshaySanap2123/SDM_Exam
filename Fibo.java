class Fibo
{
    public static void main(String[] args) {
        int a=0, b=1, c,i, count=20;
        System.out.println(a+" "+b);

        for( i=0; i<count; i++)
        {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }

    }
}