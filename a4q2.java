import java.util.Scanner;
abstract class Anim
{
    private String breed,colour;
    Anim(String breed,String colour)
    {
        this.breed = breed;
        this.colour = colour;
    }
    public String getBreed()
    {
        return breed;
    }
    public String getColour()
    {
        return colour;
    }
    public abstract void speak();
}
class Dog extends Anim
{
    Dog(String b, String c)
    {
        super(b,c);
    }

    public void speak()
    {
        System.out.println("Dog barks "+"and breed = "+getBreed()+" and colour = "+getColour());
    }
}
class Cat extends Anim
{
    Cat(String b, String c)
    {
            super(b,c);
    }
    public void speak()
    {
        System.out.println("Cat meows "+"and breed = "+getBreed()+" and colour = "+getColour());
    }
}
public class a4q2
{
    public static void main(String args[])
    {
        Cat c = new Cat("Boxer","brown");
        Dog d = new Dog("Bulldog","black");
        d.speak();
        c.speak();
    }
}
