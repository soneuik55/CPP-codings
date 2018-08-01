public class ex1
{

   int marks; 
 


public static void main(String[] args) { 
    Student[] studentArray = new Student[7]; 
    studentArray[0] = new Student(); 
    studentArray[0].marks = 99; 
    System.out.println(studentArray[0].marks); 
    modify(studentArray[0].marks); 
    System.out.println(studentArray[0].marks);  
} 



public static void modify(int marks) { 
    marks = 100; 
}

}