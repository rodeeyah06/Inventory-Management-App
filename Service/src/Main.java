import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        InventorySevice inv = new InventorySevice();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("=== Inventory Management System===");
            System.out.println("1. Add Item");
            System.out.println("2. Update Item Quantity");
            System.out.println("3. Delete Item");
            System.out.println("4. Search Item");
            System.out.println("5. View All Items");
            System.out.println("6.Save data permanently");
            System.out.println("7. Load data");
            System.out.println("8. Exit");

            System.out.println("Choose an option: ");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter Item ID: ");
                    String id = sc.next();
                    System.out.println("Enter Item Name: ");
                    String name = sc.next();
                    System.out.println("Enter Item Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.println("Enter Item Price: ");
                    double price = sc.nextDouble();
                    Items item = new Items(id, name, quantity, price);
                    inv.addItem(item);
                    break;
                    case 2:
                        System.out.println("Enter Item ID: ");
                        String id2 = sc.next();
                        System.out.println("Enter Item Quantity: ");
                        int quantity2 = sc.nextInt();
                       inv.updateQuantity(id2,quantity2);
                       break;
                       case 3:
                           System.out.println("Enter Item ID to delete: ");
                           String id3 = sc.next();
                           inv.deleteItem(id3);
                           break;

                           case 4:
                               System.out.println("Enter Item ID to search: ");
                               String id4 = sc.next();
                               Items found = inv.searchItem(id4);
                               if(found != null){
                                   System.out.println("Found Item: " + found);
                               }else{
                                   System.out.println("Item not found");
                               }
                               break;
                               case 5:
                                   inv.listItems();
                                   break;
                                   case 6:
                                       System.out.println("Not Available yet");
                                       break;
                                       case 7:
                                           System.out.println("Not Available yet");
                                           break;
                                           case 8:
                                               System.out.println("Thank you for using our service");
                                              sc.close();
                default:
                    System.out.println("Invalid option, try again");
            }

        }

        }
    }
