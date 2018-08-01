public class Rec
{
  private double length;
  private double width;
  
  public Rec(double len, double w)
  {
   length=len;
   width=w;
  }
  
  public void setLength(double len)
 {
   length=len;
  }
  
  public void setWidth(double w)
  {
    width=w;
  }
  
  public double getWidth()
  {
   return width;
  }
 
  public double getLength()
  {
   return length;
  }
  
  public double getArea()
  {

  return width*length;
  }


}

