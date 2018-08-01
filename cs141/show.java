public class show
{
 public static void main(String[] args)
 {
   double area=0;
   double circumference=0;
  
   CircleCalculate circle1= new CircleCalculate();

   CircleCalculate circleCir= new CircleCalculate();

   area=circle1.calculateArea(9);
   circumference=circleCir.claculateCircumference(3);
  
   System.out.println(area);
   System.out.println(circumference);
  }
}
