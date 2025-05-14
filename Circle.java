abstract class Shape
{
double dimension;
abstract double calarea();
} 

class Circle extends Shape
{
Circle()
{
dimension=0;
}
Circle(double d)
{
System.out.println("Double constuctor called");
dimension=d;
}
Circle(int d)
{
System.out.println("Integer constuctor called");
dimension=d;
}
void setRadius(int a)
{
dimension=a;
}
void setRadius(double a)
{
dimension=a;
}
double calarea()
{
return((22/7.0)*dimension*dimension);
}
double calcir()
{
return(2*(22/7.0)*dimension);
}
}

class DemoShape
{
public static void main(String []args)
{
Circle c =new Circle(10.5);
System.out.println("The Area is :" + c.calarea());
System.out.println("The Circumference is :" + c.calcir());
c.setRadius(7);
System.out.println("The Area is :" + c.calarea());
System.out.println("The Circumference is :" + c.calcir());
}
}