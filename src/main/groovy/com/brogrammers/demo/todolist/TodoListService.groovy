package com.brogrammers.demo.todolist

import com.brogrammers.demo.data.Item
import com.brogrammers.demo.data.ItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoListService {

    @Autowired
    private ItemRepository itemRepository

    public void add(String value) {
        itemRepository.save(new Item(value))
    }

    public void remove(String item) {
        Item foundItem = itemRepository.findByValue(item)
        itemRepository.delete(foundItem)
    }

    public List<String> getAll() {
        return itemRepository.findAll()*.getValue()
    }

}
