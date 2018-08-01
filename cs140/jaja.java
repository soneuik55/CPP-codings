public class jaja
{
 public static void main(String[] args)
 {
  int[] number={3,12,56,34,90,101,1,2,3,6,7};
   
  selectionSort(number);
 
   
   for(int i=0; i<number.length; i++)
    System.out.print(number[i]+" ");

  int index=binarySearch(number, 90);
  System.out.println("The number 90 is in the index"+ index);

  }//end of main

  public static void selectionSort(int[] num)
  {
   int temp=0;
   int min=5;
   for(int i=0; i<num.length;i++)
    {
      min=i;
     for(int j=i+1; j<num.length; j++)
      {
           if( num[j]<num[min])
               min=j;
      }//end of for loop; j
     temp=num[min];
     num[min]=num[i];
     num[i]=temp;

    }//end of for loop; i.

  }//end of selectionSort.
  

  public static int binarySearch(int[] num, int value)
  { 
   boolean found=false;
   int first=0;
   int last=num.length-1;
   int middle=0;
   int position=-1;

   while(!found && first<=last)
   {
     middle=(first+last)/2;
      if( num[middle]==value)
      { 
          position=middle;
          found=true;
      }   
      else if(num[middle]>value)
          last=middle-1;
      else
          first=middle+1;
   }//end of while

  return position;
  }//end of binarySearch




}//end of class


 
