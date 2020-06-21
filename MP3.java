public class MP3 extends gadget
{
    private int Memory;

public MP3 (String theModel, double thePrice, int theWeight, 
    String theSize, int theMemory)
     { 
         super(theModel, thePrice, theWeight, theSize);
         Memory = theMemory;
     }
       //this method allows the user to enter the amount of memory they have
   private int theMemory()
     {
       return Memory; 
       }
    
public void moreDownload (int moreDownload) {
        
        if (moreDownload <= Memory){ 
         
            Memory = Memory - moreDownload;
        } 
        
        else {
            System.out.println("Add more Download");
        } }    
    
public void delete (int delete) {
        
        if (delete > 0 && delete <= Memory){ 
         
            Memory = Memory + delete;
        System.out.println("Music Deleted."+ delete);
    }
    else { 
        System.out.println("Too Much Space Deleted");
         }     
   
        }
        
    public void print(){
    super.print();
    System.out.println("Space Remaining."+ Memory +    " GB ");
    }
    
    
    
    }
        
   