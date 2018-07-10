public class container
{
    Double [] storage = new Double[7];
    private int cap = 7; 
      
    public  container()
   {
      
   }
   //adds one double to a given slot in the arrey
     public void addoneDouble(Double newDub,int slot)
     {
      if(slot>=0 && slot<cap)
      {
        storage [slot] = newDub;
      }
      else
      {
         System.out.println("not a valid storage slot");
      }
        
        
      
     
     }
     // returns the smallest double in the arrey
     public Double smallest(int cont)
     {
      Double small = storage[cont];
      Double temp = 0.0;
      if(cont>0)
      {
         
         cont--;
         temp = smallest(cont);
         if(small>temp)
         {
             small = temp;
            return small;
         }
         
      }
      
      
         return small;
      
     }
     //displays all doubles in the arrey
     public void display(int limit)
     {
      
      
         if( 0<=limit)
         {
             
             System.out.print(storage[limit]+", ");
             limit--;
             display(limit);
             
         }
     }
     private Double max(int limit)
     {
      
      
         Double total = 0.0;
         if( 0<=limit)
         {
             
            total = total + storage[limit];
             limit--;
             total = total + max(limit);
             return total;
             
         }
         return total;
     }
     
     public Double avrg()
     {
      Double avrg = 0.0;
      avrg = max(6)/cap;
      return avrg;
     }
}