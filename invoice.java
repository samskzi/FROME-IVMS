package ivm;

public class Invoice{

    //Attributes
    private String nameQuantities;
    private double totalPrice;
    private static int count = 0;
    private int invoiceNumber;

    //Constructor
    public Invoice(String nameQuantities, double totalPrice){
        this.nameQuantities = nameQuantities;
        this.totalPrice = totalPrice;

        this.invoiceNumber = count++;
    }

    //Methods
    public String toString(){
        String message = "Invoice No: " + invoiceNumber + "\nItems Purchased and Quantities: " + nameQuantities + "\nTotal Price: " + totalPrice;
        return message;
    }

    public String getNameQuantities(){
        return nameQuantities;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public int getInvoiceNumber(){
        return invoiceNumber;
    }
}