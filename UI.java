package ivm;
import java.util.Scanner;

import ivm.InvoiceList;

public class UI {
    public static void menu(Item cp, Item bp, Item bd, Item cr, Item d, Item s, ItemList il, InvoiceList list){
        Scanner scan = new Scanner(System.in);
        int selection = 0;

        System.out.println("\nWhat would you like to do?");
        System.out.println("\nPress 1 to generate invoice");
        System.out.println("\nPress 2 to see previously generated invoices");
        System.out.println("\nPress 3 to see/edit item list");
        System.out.println("\nPress 4 to search for an item");
        System.out.println("\nPress 5 to exit program.");

        selection = scan.nextInt();
        if(selection == 1){
            generateInvoice(cp, bp, bd, cr, d, s, il, list);
        }

        if(selection == 2){
            listInvoices(cp, bp, bd, cr, d, s, il, list);
        }

        if(selection == 3){
            itemList(cp, bp, bd, cr, d, s, il, list);
        }

        if(selection == 4){
            itemSearch(cp, bp, bd, cr, d, s, il, list);
        }

        if(selection == 5){
            System.exit(0);
        }
    }

    public static void generateInvoice(Item cp, Item bp, Item bd, Item cr, Item d, Item s, ItemList il, InvoiceList list){
        Scanner scan = new Scanner(System.in);
        int num;
        int bc;
        double total;
        int n;
        String in;

        System.out.println("\nPlease enter the number of items being purchased.");
        num = scan.nextInt();

        for(int i = 0;  i <= num; i++){
            System.out.println("\nEnter barcode: ");
            bc = scan.nextInt();
            System.out.println("\nHow many of this item?");
            n = scan.nextInt();

            Item purchase = il.search(bc);
            purchase.minusStock(n);
            in = in + "Item: " + purchase.getName() + "Quantity: " + n + "\n"; 
            total = total + purchase.getPrice();
        }

        Invoice inv = new Invoice(in, total);
        list.addInvoice(inv);
        System.out.println(inv.toString());
        menu(cp, bp,  bd, cr,  d,  s,  il, list);
    }

    public static void listInvoices(Item cp, Item bp, Item bd, Item cr, Item d, Item s, ItemList il, InvoiceList list){
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPreviously Generated Invoices...");
        String message = list.printInvoiceList();
        System.out.println("\n" + message);
        menu(cp, bp,  bd, cr,  d,  s,  il, list);
    }

    public static void itemList(Item cp, Item bp, Item bd, Item cr, Item d, Item s, ItemList il, InvoiceList list){
        Scanner scan = new Scanner(system.in);
        int selection = 0;
        int bc;
        int choice = 0;

        System.out.println("\nWhat would you like to do? ");
        System.out.println("\nPress 1 to see item list");
        System.out.println("\nPress 2 to edit item list");
        System.out.println("\nPress 3 to return to menu");
        selection = scan.nextInt();

        if(selection == 1){
            System.out.println(il.printItemList());
        }

        if(selection == 2){
            System.out.println("\nEnter barcode number of item you wish to edit. ");
            bc = scan.nextInt();
            Item i = il.search(bc);
            System.out.println("\n" + i.toString());
            System.out.println("\nWhat would you like to do? ");
            System.out.println("\n1. Update Name");
            System.out.println("\n2. Update Price");
            System.out.println("\n3. Update Arrival Date");
            System.out.println("\n4. Update Expiry");
            System.out.println("\n5. Update Barcode");
            System.out.println("\n6. Update Quantity");
            System.out.println("\nChoose an option: ");
            choice = scan.nextInt();

            if(choice == 1){
                System.out.println("Enter the new name for the item");
                String name = scan.nextLine();
                i.updateName(name);
                System.out.println("\nName updated...");
            }

            if(choice == 2){
                System.out.println("\nEnter the new price");
                double price = scan.nextDouble();
                i.updatePrice(price);
                System.out.println("\nPrice updated...");
            }

            if(choice == 3){
                System.out.println("\nEnter new arrival date");
                int date = scan.nextInt();
                i.updateArrival(date);
                System.out.println("\nArrival date updated...");
            }

            if(choice == 4){
                System.out.println("\nEnter new expiry date");
                int edate = scan.nextInt();
                i.updateExpiry(edate);
                System.out.println("\nExpiry date updated...");
            }

            if(choice == 5){
                System.out.println("\nEnter new barcode");
                int b = scan.nextInt();
                i.updateBarcode(b);
                System.out.println("\nBarcode updated...");
            }

            if(choice == 6){
                System.out.println("\nEnter new quantity");
                int q = scan.nextInt();
                i.updateQuantity(q);
                System.out.println("\nQuantity updated...");
            }
        
        if(selection == 3){
            menu(cp, bp,  bd, cr,  d,  s,  il, list);
        }
        
        }
        itemList(cp, bp, bd, cr, d, s, il, list);
    }

    public static void itemSearch(Item cp, Item bp, Item bd, Item cr, Item d, Item s, ItemList il, InvoiceList list){
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter the barcode number of the item you wish to search for.");
        int b = scan.nextInt();

        Item i = il.search(b);
            if (i != null){
                System.out.println("Item found...");
                System.out.println(i.toString());
            }

            else {
                System.out.println("Item not found...");
            }
        menu(cp, bp, bd, cr, d, s, il, list);
    }

    public static void main(String[] args){
        Item cp = new Item("Cheese Patty", 170.00, 02122020, 05122020, 1, 5 );
        Item bp = new Item("Beef Patty", 150.00, 02122020, 05122020, 2, 5);
        Item bd = new Item("Box Drink", 100.00, 02122020, 07012021, 3, 10);
        Item cr = new Item("Cinnamon Roll", 125.00, 02122020, 03052021, 4, 20);
        Item d = new Item("Donut", 75.00, 02122020, 02122021, 5, 20);
        Item s = new Item("100ml Soda", 100.00, 02122020, 06052021, 6, 15);

        InvoiceList list = new InvoiceList();

        ItemList il = new ItemList();
        il.addItem(cp);
        il.addItem(bp);
        il.addItem(bd);
        i.addItem(cr);
        il.addItem(d);
        il.addItem(s);

        Scanner scan = new Scanner(System.in);

        System.out.println("Frome Inventory Management System.");
        menu(cp, bp, bd, cr, d, s, il, list);
    }
}