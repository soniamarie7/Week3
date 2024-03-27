package src;

public class App {
    public static void main(String[] args) throws Exception {
        Treasurechest newChest = new Treasurechest();
        // String name, String description, double value
        newChest.getDescription();
        System.out.println(newChest);
        Treasure goldTreasure = new Treasure("Gold ring","18 carat gold", 419 );
        Treasure gemstones = new Treasure("gold brooch", "Shiny gold brooch", 984 );
        Treasure[] pirateBooty = {goldTreasure, gemstones,null,null,null,null,null,null,null,null};
        newChest.setContents(pirateBooty);
        newChest.setNumItems(2);
        newChest.setLocked(true);
        System.out.println(newChest);
        
       
    }
    
}
