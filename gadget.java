
public class gadget
{
    public String model;
    public double price;
    public int weight;
    public String size;
    
   
    public  gadget(String theModel, double thePrice, int theWeight, 
    String theSize)
    {
        model = theModel;
        price = thePrice;
        weight = theWeight;
        size = theSize;
      
    }


    public String getModel()
    {
        return model;
    }
    public Double getPrice()
    {
        return price;
    }
    public int theWeight()
    {
        return weight;
    }
    public String theSize()
    {
        return size;
    }
    public void print()
    {//this function allows me to print out the outcome of the program
        System.out.println("*********************************");
        System.out.println("Model: " + model  );
        System.out.println("price: " + price +  "  $" );
        System.out.println("Weight: " + weight  + " grams" );
        System.out.println("Size: " + size +  "mm" );
    }
}
