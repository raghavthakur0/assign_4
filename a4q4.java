import java.util.Scanner;
abstract class Vehicle
{

    public abstract void start();
    public void stop()
    {
        System.out.println("Vehicle Stopped");
    }
}
class twowheeler extends Vehicle
{
        public void start()
        {
                System.out.println("two-wheeler Started");
        }   
}
class fourwheeler extends Vehicle
{
        public void start()
        {
                System.out.println("four-wheeler Started");
        }
}
public class a4q4
{
    public static void main(String args[])
    {
        twowheeler t = new twowheeler();
        fourwheeler f = new fourwheeler();
        t.start();
        t.stop();
        f.start();
        f.stop();
    }
}