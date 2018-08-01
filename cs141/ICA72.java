import java.util.ArrayList;

public  class ICA72
{
 public static void main(String[] args)
 {
  ArrayList<Integer> numbers = new ArrayList<Integer>();
  
   numbers.add(10);
   numbers.add(20);
   numbers.add(30);

   PrintArrayList(numbers);


   }//end of main

 public static void PrintArrayList(ArrayList<Integer> array)
  {



  for (int index = array.size()-1; index >= 0; index--)
         System.out.print ((array.get(index)+1) + "  ");


  }
 


}//end of class
