package com.brogrammers.demo.todolist

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todo")
class TodoListController {

    @Autowired
    private TodoListService todoService

    @GetMapping("/list")
    public List<String> getAll() {
        todoService.getAll()
    }

    @GetMapping("/add")
    public void add(@RequestParam String item) {
        todoService.add(item)
    }

    @GetMapping("/delete")
    public void delete(@RequestParam String item) {
        todoService.remove(item)
    }

}
