package ivm;

import java.util.arrayList;
import java.util.List;

public class ItemList {

    //Attributes
    private ArrayList<Item> items = new ArrayList<Item>();

    //Methods
    public void addItem(Item i){
        items.add(i);
    }

    public Object[] getItems(){
        Object[] array = items.toArray();
        return array;
    }

    public Item search(int barcodeNumber){
        int index = 0;
        for(Item element: items){
            if(element.getBarcode() == barcodeNumber){
                return element;
            }
        }
        return "Item not found...";
    }

    public void removeItem(int barcodeNumber){
        int index = 0;
        for(Item element: items){
            if(element.getBarcode() == barcodeNumber){
                items.remove(index);
            } 
            else {
            ++index;
            }
         }
    }

    public String printItemList(){
        String message;
        for(Item element: items){
            message = message + element.toString();
        }
        return message;
    }
}