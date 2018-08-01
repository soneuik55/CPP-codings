import java.io.*;
import java.util.Scanner;

public class Son_GameOfLife
 {
    private int ROW, COL;
    private String fileName;
    private char[][] gameBoard;     
    private int theValue;
      private File textFile;
      private char[] lineArray;
     
  public Son_GameOfLife(String theFile)
    {
      fileName=theFile;
           File name = new File(fileName);
          readInFile(name);
    }

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
    
         System.out.println(ROW);
     System.out.println(COL);
       //filling the 2D array
       int count =0;
 for(int r=0; r<gameBoard.length; r++)
  {
    lineBy = inputFile.nextLine();
    lineBy=lineBy.replace(" ", "");                         //*******************************************************
    //System.out.println(lineBy);
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




   public int getColumns()
  {
   return COL;
  }
   public int getRows()
  {
   return ROW;
  }

   public int getCell(int i, int j)
 {
    if (i > 0 && j > 0 && gameBoard[i - 1][j - 1] == 'X') {
        theValue++;
    }
    ;
    if (i > 0 && gameBoard[i - 1][j] == 'X') {
        theValue++;
    }
    ;
    if (i > 0 && j < COL && gameBoard[i - 1][j + 1] == 'X') {
        theValue++;
    }
    ;
    if (j > 0 && gameBoard[i][j - 1] == 'X') {
        theValue++;
    }
    ;
    if (j < COL && gameBoard[i][j + 1] == 'X') {
        theValue++;
    }
    ;
    if (j > 0 && i < ROW && gameBoard[i + 1][j - 1] == 'X') {
        theValue++;
    }
    ;
    if (i < ROW && gameBoard[i + 1][j] == 'X') {
        theValue++;
    }
    ;
    if (i < ROW && j < COL && gameBoard[i + 1][j + 1] == 'X') {
        theValue++;
    }

    return theValue; 
   }//end of getCell method

   public void setCell(int r, int c, int value)
   {
        //already alive
      if(( gameBoard[r][c] != 0)
       {  
         if(value<2)
          { 
            gameBoard[r][c]='0'; 
          } 
        else if(value>3) {
          gameBoard[r][c]='0';
                                    }
        }
    //already dead cell  
      if((int)gameBoard[r][c] == 0)
        {
            if(neighbors==3)
             gameBoard[r][c]='X';
         }

   }//end of setCell method

//This method compute the next generation as many as the number of generations entered by a user.
public  void computeNextGeneration(int generation)
{
   char[][] temp= new char[this.ROW][this.COL];
    int neighbors=0;
 

  do
  {
   // print();

    for(int r=0; r<gameBoard.length; r++) {
      for(int c=0; c<gameBoard[r].length; c++)
       {
         neighbors=getCell(r,c);
    
         setCell(r,c,neighbors);

     
      }//end of for loop COL

    }//end of for loop ROW

    }

   generation--;  
  // computeNextGeneration(generation);
    
   
   }while(generation==0);




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
 
  }//end of print method

}//end of class


