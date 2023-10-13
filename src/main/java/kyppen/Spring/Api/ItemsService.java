package kyppen.Spring.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemsService {


    @Autowired
    private ItemsRepository itemsRepository;

    public List<Item> getItems(){
        return itemsRepository.getItems();
    }
    public void AddItems(Item item){
        itemsRepository.addItems(item);
    }
    public void deleteItems(Item item){
        itemsRepository.deleteItem(item);
    }
    public void putitems(Item item){
        itemsRepository.putItems(item);
    }
}
