public class ShirtTest
{
    public static void main(String args[])
    {
        Shirt myShirt = new Shirt();

        myShirt.shirtID = 1;
        myShirt.description = "Легка червона сорочка з дихаючої тканини.";
        myShirt.color = "red";
        myShirt.price = 5.80;
        myShirt.quantityInStock = 14;

        myShirt.displayShirtInformation();
    }
}