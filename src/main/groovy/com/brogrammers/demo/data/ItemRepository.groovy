package com.brogrammers.demo.data

import org.springframework.data.mongodb.repository.MongoRepository

interface ItemRepository extends MongoRepository<Item, String> {

    public Item findByValue(String value)

}