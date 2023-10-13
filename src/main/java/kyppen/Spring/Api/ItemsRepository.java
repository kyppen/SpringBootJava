package kyppen.Spring.Api;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ItemsRepository {

    ArrayList<Item> items = new ArrayList<>();

    public ItemsRepository(){
        items.add(new Item("Shark", 440));
        items.add(new Item("Mithril Dart", 3));
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItems(Item item) {
        items.add(item);
    }

    public void deleteItem(Item inputItem){
        String itemName = inputItem.getName();
        Item toBeDeleted = items.stream().filter(item -> itemName.equalsIgnoreCase(item.getName())).findAny().orElse(null);
        items.remove(toBeDeleted);
    }
    public void putItems(Item putItem){
        Boolean containsItem = false;
        for (Item listItem : items) {
            if(listItem.getName().equalsIgnoreCase(putItem.getName())){
                containsItem = true;
            }
        }
        if(!containsItem){
            items.add(putItem);
        }
    }
}

