import java.util.Random;

public class ICA74
{
 public static void main(String[] args)
  {
   String alphabet= "abcdefghijklmnopqrstuvwxyz";
   int length;
    String s = "";
    Random random = new Random();
    

        
        int randomLen = 5+random.nextInt(26);

        for (int i = 0; i < randomLen; i++)

        {
            char c = alphabet.charAt(random.nextInt(26));
            s+=c;
        }
         
        System.out.println(s);
    





     
   

  }//end of main

}//end of class
