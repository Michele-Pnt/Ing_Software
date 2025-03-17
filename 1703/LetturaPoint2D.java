import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LetturaPoint2D
{
    public static void main(String[] args)
    throws IOException
    {
        FileInputStream f = new FileInputStream("esempio.bin");
        ObjectInputStream is =
        new ObjectInputStream(f);
        Punto2D p;
        try {
            p = (Punto2D)is.readObject();
            is.close();
            System.out.println("x,y = " + p.ascissa() + ", " + p.ordinata());
        } catch (Exception e) {
            System.err.println(e);
        }
       
    }
    
}
