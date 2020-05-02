package com.brogrammers.demo.data

import org.springframework.data.annotation.Id

class Item {

    @Id
    String id

    String value

    Item(String value) {
        this.value = value
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("id='").append(id).append('\'');
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
