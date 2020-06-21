public class mobile extends gadget
{
    private int credit;
    
    public mobile(String theModel, double thePrice, int theWeight, 
    String theSize, int theCredit)
     { //this super function is used so that the code can reference the parent class
         super(theModel, thePrice, theWeight, theSize);
         credit = theCredit;
     }
    
     private int theCredit()
     {
       return credit; 
       }
       
       public void moreCredit (int moreCredit) {
         //this IF statement allows me to ensure that there is enough credit
        if (credit > 0){ 
         
            credit = credit + moreCredit;
        } 
        
        else {
            System.out.println("Enter Credit Positive Credit.");
        } }
        
        public void phoneLength(int phoneNo,int callTime)
        {
            credit = credit - callTime;
            
            if (credit <= callTime)
                {
                System.out.println("Not Enough Call Minutes.");
        }
        else {
            System.out.println("Insuffcient Minutes.");
        }
    }
    
 
    public void print(){
    super.print();
    System.out.println("Credit Remaining: " + credit );
    }
    
    
  
    
    
    
    
    
    
     
    
    
    
    
    
    
}

   
        
    