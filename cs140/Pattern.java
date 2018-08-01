/********************************************************
 file:Pattern.java
 author: T. Diaz
 class: CS140 Introduction to Computer Science
 assignment: lab3
 date last modified: 11/22/2016
 purpose: to practice the nested for loop.
********************************************************/
public class Pattern
{
 public static void main(String[] args)
 { 
  int i,j ;
  int max=7;
     for( i=7; i>0; i--)  // while i is decreasing, the j is increasing
      {
      
       for(j=1; j<i; j++)  // so set up that when j is less than i, print it out
       System.out.print(j+" ");
       System.out.println();
       }

  }//end of the main header
}//end of the class
