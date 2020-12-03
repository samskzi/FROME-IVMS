package ivm;

import java.util.arrayList;
import java.util.List; 

public class InvoiceList {

    //Attributes
    private ArrayList<Invoice> invoices = new ArrayList<Invoice>();

    //Methods
    public void addInvoice(invoice i){
        invoices.add(i);
    }

    public Object[] getInvoices(){
        Object[] array = invoices.toArray();
        return array;
    }

    public String printInvoiceList(){
        String message;
        for(Invoice element: invoices){
            message = message + element.toString();
        }
        return message;
    }
}