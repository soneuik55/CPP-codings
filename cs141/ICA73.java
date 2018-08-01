import java.io.*;
import java.util.Scanner;

public class ICA73
{
 public static void main(String[] args)throws IOException
 {
String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

/*1*/   result.setCharAt(0, original.charAt(0));
/*2*/   result.setCharAt(1, original.charAt(original.length()-1));

        System.out.println(result);

}//end of main
}//end of class
