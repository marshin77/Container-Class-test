public class A07Main
{
   
   public static void main(String[]args)
   {
      container Dub = new container();
      fill(Dub);
      System.out.println("the smallest double is " +Dub.smallest(6));
      Dub.display(6);
      System.out.println("\n");
      System.out.println("the avearge double is " +Dub.avrg());

      
   }
   //fills the arrey with Double objects
   public static void fill(container store)
   {
      
      
      
         store.addoneDouble(3.0,0);
         store.addoneDouble(9.0,1);
         store.addoneDouble(11.0,2);
         store.addoneDouble(5.0,3);
         store.addoneDouble(7.0,4);
         store.addoneDouble(33.0,5);
         store.addoneDouble(9.9,6);
         
   }
}