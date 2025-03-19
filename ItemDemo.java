// Item class with instance variables, static variables, methods, and a constructor
class Item {
    // Static variable to track the number of Item objects created
    static int objectCount = 0;
    
    // Instance variable to hold the name of the item
    String itemName;

    // Constructor to initialize the itemName and increment the objectCount
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;  // Increment the static variable each time an object is created
    }

    // Instance method to display the item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }

    // Static method to display the total number of objects created
    public
