package excercise_06_1;

public class item
{
    //private data members
    private int Id;
    private String description;
    private int quantity;
    private double price;
    //setter method:
    public void setDescription(String description1)
    {
        description=description1;
    }
    //getter method:
public String getDescription()
{
    return description;
}
private double final_price;

 //Implementation for method discountedprice:
public void discountedprice()
{
    quantity=2;
    price=500;
    if (quantity==2)
    {
    final_price=(price-(price*10/100))*quantity;
    System.out.println("Discounted price is "+final_price);
    }
    else if (quantity>=3 && quantity<=5)
    {
        final_price=(price-(price*15/100))*quantity;
        System.out.println("Discounted price is "+final_price);
    }
    else if (quantity>5)
    {
        final_price=(price-(price*25/100))*quantity;
        System.out.println("Discounted price is "+final_price);
    }
}




}

