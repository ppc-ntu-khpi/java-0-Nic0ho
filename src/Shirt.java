public class Shirt
{
    public int shirtID = 0;
    public String description = "-description required-";

    public String color = "unset";
    public double price = 0.0;
    public int quantityInStock = 0;

    public void displayShirtInformation()
    {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color: " + color);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}