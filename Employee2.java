public abstract class Employee2
 {
   private String name; //declare the variables
   private String address;
   private int number;

   public abstract double computePay(); // declare the abstract methods we want to use
   // Remainder of class definition
   //class has to be abstract to do this
   //if this class is inhereted the class inheriting it must either override the abstract method or it must be abstract itself
}
