interface vechicle{
public void ride();
}
class car implements vechicle
{
public void ride()
{
System.out.println("car is moving");
}
}
class interface1
{
public static void main(String[] args)
{
vechicle c=new car();
c.ride();

}
}
