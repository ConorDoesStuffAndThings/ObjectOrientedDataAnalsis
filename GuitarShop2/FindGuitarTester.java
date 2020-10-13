import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = GuitarSpec(Builder.GIBSON, "Stratocastor", Type.ELECTRIC, Wood.ALDER,Wood.ALDER));

        List matchingGuitars = inventory.search(whatLookingFor);
        if (!matchingGuitars.isEmpty()){
            System.out.println("You might like these: ");

            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ){
                Guitar guitar = (Guitar)i.next();
                System.out.println("We have a " + guitar.getSpec() + " guitar: " +
                        guitar.getPrice());
            }
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }

    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        inventory.addGuitar("V00001",
                1499.99,
                spec);

        inventory.addGuitar("V00002",
                1199.99,
                spec);

        inventory.addGuitar("V00003",
                1699.99,
                spec);

        inventory.addGuitar("V00004",
                9.99,
                spec);

    }

}
