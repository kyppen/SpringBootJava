package kyppen.Spring.Api;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ItemsRepository {

    ArrayList<Item> listOfItems = new ArrayList<>();

    public ItemsRepository(){
        listOfItems.add(new Item("Shark", 440));
        listOfItems.add(new Item("Mithril Dart", 3));
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public void addItems(Item item) {
        listOfItems.add(item);
    }

    public void deleteItem(Item inputItem){
        String itemName = inputItem.getName();
        Item toBeDeleted = listOfItems.stream().filter(item -> itemName.equalsIgnoreCase(item.getName())).findAny().orElse(null);
        listOfItems.remove(toBeDeleted);
    }
    public void putItems(Item putItem){
        Boolean containsItem = false;
        for (Item listItem : listOfItems) {
            if(listItem.getName().equalsIgnoreCase(putItem.getName())){
                containsItem = true;
            }
        }
        if(!containsItem){
            listOfItems.add(putItem);
        }
    }
}

