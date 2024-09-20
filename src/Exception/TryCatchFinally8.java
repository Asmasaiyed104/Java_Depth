package Exception;

class TryCatchFinally8
{
    public static void main(String[] args)
    {
        System.out.println("1");

        try
        {
            System.out.println(100/0);
            System.out.println("2");
        }
        catch(Exception e)
        {
            System.out.println("3");
        }
        finally
        {
            System.out.println("4");
        }
        System.out.println("1111");
        try
        {
            System.out.println("44");
        }
        catch(Throwable e)
        {
            System.out.println("5");
        }

        System.out.println("6");
    }
}