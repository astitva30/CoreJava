import java.util.Scanner;
import static java.lang.System.out;
abstract class AreaShape
{
	abstract void area();
	abstract void showArea();
}
abstract class VolumeShape
{
	abstract void volume();
	abstract void showVolume();
}




class Circle extends AreaShape
{
	private float circleArea;
	public void area()
	{
		System.out.println("Enter the radius:");
		float radius = sc.nextFloat();
		this.circleArea= radius*radius*22/7;
	}
	public void showArea()
	{
		out.println("Area of circle:"+circleArea);
	}
}
class Triangle extends AreaShape
{
	private float triangleArea;
	public void area()
	{
		System.out.println("Enter base and height respectively: ");
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		this.triangleArea = base*height/2;
	}
	public void show()
	{
		out.println("Area of triangle: " + triangleArea);
	}
}
class Rectangle extends AreaShape
{
	private float rectangleArea;
	public void area()
	{
		System.out.println("Enter length and bredth respecively: ");
		float length = sc.nextFloat();
		float bredth = sc.nextFloat();
	}
	public void show()
	{
		out.println("Area of rectangle: " + rectangleArea);
	}
}








class Cone extends VolumeShape
{
	private float coneVolume;
	public void volume()
	{
		System.out.println("Enter the radius and height respectively:");
		float radius1 = sc.nextFloat();
		float height1 = sc.nextFloat();
		this.coneVolume = (radius1*radius1*height1*22)/21;
	}
	public void showVolume()
	{
		out.println("Volume of cone is: " + coneVolume);
	}
}
class Sphere extends VolumeShape{
	private float sphereVolume;
	public void volume()
	{
		System.out.println("Enter the radius: ");
		float radius2 = sc.nextFloat();
		this.sphereVolume = (radius2*radius2*radius2*22*4)/21;
	}
	public void showVolume()
	{
		out.println("The volume of sphere is : " +sphereVolume);
	}
}
class Cylender extends VolumeShape{
	private float cylenderVolume;
	public void volume()
	{
		System.out.println("Enter radius and height respecively: ");
		float radius3 = sc.nextFloat();
		float height3 = sc.nextFloat();
		this.cylenderVolume = (22*radius3*radius3*height3)/7;
	}
	public void showVolume()
	{
		out.println("The volume of Cylender is : " + cylenderVolume);

	}
}



public class AbstractAreaVol
{
	static public void main(String...args)
	{
		
	}
}