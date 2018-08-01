public class ICA10a
{
 public static void main(String[] args)
  {
    Labrador dog1=new Labrador(jon);
    Labrador dog2=new Labrador(smile);
    Yorkshire dog3=new Yorkshire(min);
    double average=0;

   
  
   average=(dog1.avgBreedWeight+dog2.avgBreedWeight )/2;
   System.out.println("The average weight of this breed"+ average);
   System.out.println("The average weight of this breed"+ average);
   System.out.println(dog1.getName() + "says" + dog1.speak());
   System.out.println(dog2.getName() + "says" + dog2.speak());
   System.out.println(dog3.getName() + "says" + dog3.speak());
   }//end of main
}



In the Labrador class

1.I need to add super(name) in Labrador constructor to use getName in the dog class
public Labrador(String name)
{
super(name);
}

2.I also need to change the avgBreedWeight method
Specifically, get rid of the static because if the method is static, it shares the breedWeight on the field. 
We need several weights to calculate averages. 



In the main method, we need to add the formula to calculate the average of the weights