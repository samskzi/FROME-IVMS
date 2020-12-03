package ivm;

public class Item{
    //Attributes
    private String name;
    private double price;
    private int arrival;
    private int expiry;
    private int barcode;
    private int quantity;

    //Constructor
    public Item(String name, double price, int arrival, int expiry, int barcode, int quantity){
        this.name = name;
        this.price = price;
        this.arrival = arrival;
        this.expiry = expiry;
        this.barcode = barcode;
        this.quantity = quantity;
    }

    //Methods
    public addStock(){
        quantity += 1;
    }

    public addStock(int s){
        quantity += s;
    }

    public minusStock(){
        if(quantity < 1){
            return("Quantity of item invalid.");
        }
        quantity -= 1;
    }

    public minusStock(int s){
        if(quantity < s){
            return("Quantity of item invalid.");
        }
        quantity -= s;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getArrival(){
        return arrival;
    }

    public int getExpiry(){
        return expiry;
    }

    public int getBarcode(){
        return barcode;
    }

    public int getQuantity(){
        return quantity;
    }

    public void updateName(String n){
        name = n;
    }

    public void updatePrice(double p){
        price = p;
    }

    public void updateArrival(int a){
        arrival = a;
    }

    public void updateExpiry(int e){
        expiry = e;
    }

    public void updateBarcode(int b){
        barcode = b;
    }

    public void updateQuantity(int q){
        quantity = q;
    }

    public String toString(){
        String message = "Name " + name + "\nPrice " + price + "\nArrival Date DDMMYY " + arrival + "\nExpiry Date DDMMYY " + expiry + "\nBarcode " + barcode + "\nQuantity " + quantity;
        return message;
    }

}
