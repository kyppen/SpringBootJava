package kyppen.Spring.Api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Autowired
    private ItemsService itemsService;

    @GetMapping("/items")
    public List<Item> getItems(){
        return itemsService.getItems();
    }

    @PostMapping("/items")
    public void addItems(@RequestBody Item item){
        itemsService.AddItems(item);
    }
    @DeleteMapping("/items")
    public void deleteItems(@RequestBody Item item){
        itemsService.deleteItems(item);
    }

    @PutMapping("/items")
    public void setItems(@RequestBody Item item){
        itemsService.putitems(item);
    }
}
