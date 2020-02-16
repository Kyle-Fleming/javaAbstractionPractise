public class ComputeSalary extends Employee2 {
   private double salary;   // Annual salary

   public double computePay()//original computePay method being overridden
    {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
   // Remainder of class definition
}
