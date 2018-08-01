 
/*************************************************************** 
*  file: Son_GameOfLife.java
*  author: Son, Sunghwan  
*  class: CS 141 Programming and Problem Solving  
*  
*  assignment: program 6
*  date last modified: 3/16/2017  
*  
*  purpose: In order to practice using recursion and exception theory. Through this program, I could understand the structure using if and for statement better.	
*                  
*                
*
*  
****************************************************************/ 
import java.io.*;
import java.util.Scanner;


public class Son_GameOfLife
 {
   //Private variables in the field
    private int ROW, COL;
    private String fileName;
    private char[][] gameBoard;     
    
      private File textFile;
      private char[] lineArray;
   
  //Constructor of Son_GameOfLife
  public Son_GameOfLife(String theFile)
    {
      fileName=theFile;
           File name = new File(fileName);
          readInFile(name);
    }


//This method reads the game board from the text File by using try and catch blocks
  public void readInFile(File textFile){
                  lineArray = new char[COL];
                  String lineBy="";  
                   
      try {
           Scanner inputFile = new Scanner(textFile);
            
           //set the rows and cols from the text file                
                 ROW=inputFile.nextInt();
                 COL=inputFile.nextInt();
                           inputFile.nextLine();
          // Set the 2D arrat with row and col   
                 gameBoard=new char[ROW][COL];
    
         
      int count =0;

// Filling the gameboard from the text file
 for(int r=0; r<gameBoard.length; r++)
  {
    lineBy = inputFile.nextLine();
    lineBy=lineBy.replace(" ", "");                      // This removes the spaces between characters.
   

    for(int c = 0; c<gameBoard[r].length; c++)
    {
       gameBoard[r][c]=lineBy.charAt(c);
      // System.out.print(gameBoard[r][c]); 
     }
}




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }// end of try
    }//end of readInFile Method.



//This returns the columns
   public int getColumns()
  {
   return COL;
  }
//This returns the Rows
   public int getRows()
  {
   return ROW;
  }


//This method returns the value representing how many cells are alive around each cell.
   public int getCell(int i, int j)
 {
     int theValue=0;
     	
    if (i-1 > 0 && j-1 > 0 && gameBoard[i - 1][j - 1] == 'X') 
        theValue++;
    
     
    if (i-1 > 0 && j > 0  && gameBoard[i - 1][j] == 'X') 
        theValue++;
     
 
     if (i-1 > 0  && j+1<COL && gameBoard[i - 1][j + 1] == 'X') 
        theValue++;
    
    if (i > 0 && j-1 > 0  && gameBoard[i][j - 1] == 'X') 
        theValue++;
    
    
    if (i > 0 &&  j+1<COL  && gameBoard[i][j + 1] == 'X') 
        theValue++;
    
    
    if (j-1 > 0 && i+1 < ROW && gameBoard[i + 1][j - 1] == 'X') 
        theValue++;
    
    
    if (i+1 < ROW && gameBoard[i + 1][j] == 'X') 
        theValue++;
    
    
    if (i+1 < ROW && j+1 < COL && gameBoard[i + 1][j + 1] == 'X') 
        theValue++;

    if (i < ROW && j < COL && gameBoard[i][j] == 'X') 
        theValue++;


    return theValue; 
   }//end of getCell method


//This method set the cell by using row, column
   public void setCell(int r, int c, int value)
   {
        //already alive
      if( ( gameBoard[r][c] == 'X') )
       {  
               if(value==2 || value==3)
                 gameBoard[r][c]='X';
         else if(value<2)
          { 
            gameBoard[r][c]='0'; 
          } 
        else if(value>3) {
          gameBoard[r][c]='0';
                          }
        }


    //already dead cell  
      if(gameBoard[r][c] == '0')
        {
            if(value==3)
             gameBoard[r][c]='X';
         }

   }//end of setCell method

//This method compute the next generation as many as the number of generations entered by a user.
public  void computeNextGeneration(int generation)
{
   char[][] temp= new char[this.ROW][this.COL];
     int neighbors=0;
     int count=0;    

  do
  {
     count++;
      System.out.println("Generation: " + count);
    print();

    for(int r=0; r<gameBoard.length; r++) {
      for(int c=0; c<gameBoard[r].length; c++)
       {
         
         neighbors=getCell(r,c);
         setCell(r,c, neighbors);
           
               
      }//end of for loop COL

    }//end of for loop ROW

  	

   generation--;  
  // computeNextGeneration(generation);
    
   
   }while(generation!=0);




}


//This method prints the 2d array "gameBoard"
    public void print()
   {
	
       for(int r=0; r<ROW; r++)
    {
      for(int c=0; c<COL; c++)
      {  
        System.out.print(gameBoard[r][c]);
      }
        System.out.println();
   }   
  System.out.println();
  }//end of print method

}//end of class


