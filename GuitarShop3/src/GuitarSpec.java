import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder Builder, String Model, Type Type, Wood BackWood, Wood TopWood, int numStrings){
        builder = Builder;
        model = Model;
        type = Type;
        backWood = BackWood;
        topWood = TopWood;
        this.numStrings = numStrings;
    }

    public GuitarSpec(){

    }

    public Builder getBuilder(){
        return builder;
    }

    public String getModel(){
        return model;
    }

    public Type getType(){
        return type;
    }

    public Wood getBackWood(){
        return backWood;
    }

    public Wood getTopWood(){
        return topWood;
    }

    public int getNumStrings(){
        return numStrings;
    }

    public boolean isMatch(GuitarSpec guitarspec){
        List matchingGuitars = new LinkedList();

        for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = guitar.getSpec();

            Builder builder = getBuilder();
            if (getBuilder() != guitarSpec.getBuilder())
                return false;

            String model = getModel().toLowerCase();

            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitarSpec.getModel().toLowerCase())))
                return false;
            if (getType() != guitarSpec.getType())
                return false;
            if (getBackWood() != guitarSpec.getBackWood())
                return false;
            if (getTopWood() != guitarSpec.getTopWood())
                return false;
            matchingGuitars.add(guitar);
        }
        return true;
    }
}
