import java.util.Scanner;
public class pr
{

  
    public enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, DEFAULT}
 public static void main(String[] args)
  {
     int length =5 + (int)(21*Math.random());
      System.out.println(length);	

      StringBuilder str = new StringBuilder();
    boolean switching = true;

    for (int i = 0; i < length; i++) {
        char ch = (char)('A' + (int)(26*Math.random())); // a random letter
	if(Math.random()>0.5)
	    ch = (char)(ch+32);
	if(switching)
	    str.append(ch);
	else
	    str.insert(0, ch);
	switching = !switching;
    }
     char ch = (char)('A' + length); // a random letter

  System.out.println(ch);
        int[][] table = new int[5][10];
        boolean header = true;

        for (int row=0; row < table.length; row++) 
            for (int col=0; col < table[row].length; col++)
                table[row][col] = row * 10 + col;

        for (int row=0; row < table.length; row++)
        {
            for (int col=0; col < table[row].length; col++)
	    {
		if(row==0 && col==0 && header)
		    System.out.print("#  |  \t");
                else if(col==0)
	            System.out.print(row+"  |  \t");
                System.out.print (table[row][col] + "\t");
	    }
            System.out.println();
            if(row==0 && header)
            {
		System.out.print("\n------------------------------------------"+
                                 "------------------------------------------\n");
                header = false;
                row=-1;
            }
     }



double[][] ar=new double[8][10];
 ar[7][9]=5;
System.out.println(ar[7][9]);
System.out.println();


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Work hours available for the following days: ");
	for(Day today : Day.values())
            System.out.println(today);

        System.out.print("What day do you want to know about?");
        Day choice = Day.DEFAULT;
       
            choice = Day.valueOf(keyboard.nextLine().toUpperCase());
       
System.out.println(Day.values());
        switch(choice) 
        {
            case SUNDAY:
                 System.out.println("Hours are 11 to 5");
                 break;
            case MONDAY:
                 System.out.println("Hours are 9 to 9");
                 break;
            case TUESDAY:
                 System.out.println("Hours are 9 to 9");
                 break;
            case WEDNESDAY:
                 System.out.println("Hours are 9 to 9");
                 break;
            case THURSDAY:
                 System.out.println("Hours are 9 to 9");
                 break;
            case FRIDAY:
                 System.out.println("Hours are 9 to 9");
                 break;
            case SATURDAY:
                 System.out.println("Hours are 10 to 6");
                 break;
            default:
                 System.out.println("Not a valid entry.");
          
        }








  }

}
