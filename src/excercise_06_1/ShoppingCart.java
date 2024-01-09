package excercise_06_1;

public class ShoppingCart
{
    public static void main(String[] args)
    {
        item i1=new item();
        item i2=new item();
        //Print description for first object:
        i1.setDescription("Description for first object");
        System.out.println(i1.getDescription());

        //print description for second object:
        i2.setDescription("Description for second object");
        System.out.println(i2.getDescription());

        //Assigning item1 value to item2:
        i1=i2;
        i1.setDescription("Description for first object after assigning i1 to i2");
        System.out.println(i1.getDescription());


        //Discounted price based on items' quantity:
        i1.discountedprice();

    }

}
