package com.daythree;

class Item {
    int itemId;
    String name;
    double price;

    Item(int itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return "Item Id: " + itemId + ", Name: " + name + ", Price: " + price;
    }
}

