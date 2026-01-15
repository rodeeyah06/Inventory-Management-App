import java.util.HashMap;
import java.util.Map;

public class InventorySevice{
    private Map<String,Items> items = new HashMap<String,Items>();

    public void addItem(Items item){
        items.put(item.getId(), item);
        System.out.println("Item added Successfully");
    }

    public void updateQuantity(String id, int quantity){
        Items item = items.get(id);
        if(item != null){
            item.setQuantity(item.getQuantity()+quantity);
        }else{
            System.out.println("Item not found");
        }

    }
    public void deleteItem(String id){
        if(items.remove(id) != null){
            System.out.println("Item deleted successfully");
        }else{
            System.out.println("Item not found");
        }
    }
    public Items searchItem(String id){
        return items.get(id);
    }
    public void listItems(){
        if(items.isEmpty()){
            System.out.println("No items found");
            return;
        }
        System.out.println("=========== All Items ==========");
        for(Items item : items.values()){
            System.out.println(item);
        }

    }
}

