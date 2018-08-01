public class demo
{

 public static void main(String[] args)
  {
    Rec box1 = new Rec(5.0, 2.0);
    Rec box2 = new Rec(5.0, 2.0);
System.out.println(box1==box2);
System.out.println(box1.equals(box2));
box1.setLength(10.0);
System.out.println(box1.equals(box2));
box2=box1;
System.out.println(box1==box2); 
System.out.println(box1.equals(box2)); 
box1.setLength(5.0);
System.out.println(box1.equals(box2));
   
   }
}
