import java.util.Scanner;

public class Son_ICA7
{
 public static void main(String[] args)
 {
  final int ROW=5;
  final int COL=10;
  int[][] numbers =new int[ROW][COL];
   
   //storing numbers into 2d-arrays
  for(int row=0 ; row<ROW; row++)
  {
    

   for(int col=0; col<COL; col++)
  {
   
    numbers[row][col]=row*10 + col;



  } //end of for loop for col
  } //end of for loop for row
 


  //printing out 2d-arrays
 for(int row=0 ; row<ROW; row++)
  {
    for(int col=0; col<COL; col++)
  {
     System.out.print (numbers[row][col]+ " ");
    if(col%10==9)
     System.out.println();



  } //end of for loop for col
  } //end of for loop for row
 


 }//end of main
}//end of class
