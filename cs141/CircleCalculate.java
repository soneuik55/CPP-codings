public class CircleCalculate
{
    public static double calculateArea(int radius)
	{
		return Math.PI*radius*radius;
	}
	
	public static double calculateCircumference(int radius)
	{
		return Math.PI*radius*2.0;
	}
}

//---------------------------

public class ShowCircleData
{

    public static void main(String[] args)
    {
	    System.out.println("A circle with radius 9 has an area of: "+
				CircleCalculate.calculateArea(9)+"\n"+
				"A circle with radius 13 has a circumference of: "+
				CircleCalculate.calculateCircumference(13));
    }

}