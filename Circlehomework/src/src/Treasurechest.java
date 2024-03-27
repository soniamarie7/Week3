 package src;

import java.util.Arrays;

public class Treasurechest {

    private String description = "";

    private boolean isLocked;

    private Treasure[]contents;
    

    public final int MAX_SIZE ; // # treasures it can hold

    private int numItems = 3;  

    // Constructors
    
    public Treasurechest (){
    // this.description = description;

    // this.isLocked = isLocked;
    this.MAX_SIZE = 10; 
    this.contents = new Treasure[MAX_SIZE];

}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = "This old wooden treasure chest is locked ";
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Treasure [] getContents() {
         if (isLocked == true){
            return null;
         }
        return contents;
    }

    public void setContents(Treasure[] treasure) {
        this.contents = treasure;
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    
    
    }

    @Override
    public String toString() {
        if (isLocked == true) {
            return "The chest is locked";
        }
        return "Treasurechest [description=" + description + ", isLocked=" + isLocked + ", contents="
                + Arrays.toString(contents) + ", MAX_SIZE=" + MAX_SIZE + ", numItems=" + numItems + "]";
    }

  
    }



  
    