package Exception;

import java.io.FileInputStream;

public class Test {
    public static void main(String[] args)
    {
        FileInputStream fis=null;
        try
        {
            fis=new FileInputStream("");
            fis.read();
            System.out.println(100/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                fis.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
