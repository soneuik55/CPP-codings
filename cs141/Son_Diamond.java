/*************************************************************** 
*  file: Son_Diamond.java  
*  author: Son, Sunghwan  
*  class: CS 141 Programming and Problem Solving  
*  
*  assignment: program 4
*  date last modified: 2/14/2017  
*  
*  purpose: In order to practice using several methods and calling methods in the other methods. Also, study the relationship between compareTo and Array.sort
*               
*                   
*
*  
****************************************************************/ 
import java.util.Arrays;

public class Son_Diamond implements Comparable<Son_Diamond>
{
  private String stockNumber; 
  private double carot ;
  private String clarity ;
  private char color; 
  private String cut;


 //This is a constructor method. 
   public Son_Diamond(String initializestockNum, double initializeCarot, String initializeClarity, char initializeColor, String initializeCut )
{
    stockNumber=initializestockNum; 
    carot=initializeCarot ;
    clarity=initializeClarity ;
    color=initializeColor; 
    cut=initializeCut;
}//end of constructor method.


//It returns the stock number a diamond 
 public String getStock()
 {
  return stockNumber;
  } 
//It returns the carot of a diamond 
 public double getCarot()
 {
  return carot;
  }    
 //It returns the clarity of a diamond 
 public String getClarity()
 {
  return clarity;
  }      
 //It returns the color of a diamond 
 public char getColor()
 {
  return color;
 }     
 //It returns the cut of a diamond 
 public String getCut()
 {
  return cut;
 }     

//Itis a descriptive method showing all the instance variables.
 public String toString()
{
 
 return String.format("%3s %10.1f %10s %10c %10s" , stockNumber,carot,clarity,color,cut);




}

//The method compareTo works with Array.sort.
// It will follow the rank list for each carot, clarity, and color.
public int compareTo(Son_Diamond other)
{
  
  
// compare carot first. 
  // compare which is bigger, bigger one will be placed to the right. 
  // =, when the both carots of two diamonds are the same, compare the clairity or the color. 
  //clarity:  FL, IF, VVS1, VVS2, VS1, VS2, SI1, SI2, I1, I2,I3  
  //color: D , E , F , G, H, I, J, K, M, N, L, O, P, Q, R, S, T, U, V, W, X, Y, Z
 int result=0;

 
      
    result = Double.compare(other.carot,this.carot);
     if (result == 0)
     {
       result= Double.compare((rankClarity(other.clarity)),(rankClarity(this.clarity)));
           if(result==0) // In the case both clariteis of two diamonds are same.
           {
             result=compareChar(this.color,other.color);


           }
        

     }
     
     return result;

}	



//This method is to make a rank list for the clarity in order to use it in compareTo
public int rankClarity(String cl)
{
   int rank=0;
   switch(cl.toUpperCase())
  {
   case "FL" :
        rank=11;   
        break;
 
   case "IF":
        rank=10;
        break;

   case "VVS1" :
        rank=9;   
        break;
 
   case "VVS2":
        rank=8;
        break;

   case "VS1" :
        rank=7;   
        break;
 
   case "VS2":
        rank=6;
        break;

   case "SI1" :
        rank=5;   
        break;
 
   case "SI2":
        rank=4;
        break;

   case "I1" :
        rank=3;   
        break;
 
   case "I2":
        rank=2;
        break;

   case "I3" :
        rank=1;   
        break;
 
  

   }// end switch


return rank;
}//end of rankClarity method



//Make another method to compare charcters because compareTo cannot be used for the comparing characters.
public int compareChar(char col1, char col2)
{
 int result=0;
  
if(col1>col2)
result=1;
else if(col1<col2)
result=-1;
else 
result=0;



return result;
}//end compareChar method
















}//end of class
