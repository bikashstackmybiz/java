class Leaf{
     String colour;
     int size;

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColour() {
        return this.colour;
    }
    
    

}
class Plant{
    String colour;
    String name;
    int size;
    private Leaf leaf;

    public Plant() {
        this.leaf = new Leaf();
        leaf.setColour("yellow");
        System.out.println(leaf.getColour());
        

    }
    public String getColour() {
        return this.colour;
    }

    


}

public class CompositionExample {


    public static void main(String[] args) {
        Plant plant = new Plant();     // when we make object of plant class then also leaf class get created in heap memory
        
        plant.colour = "blue";
        plant.name = "mango";
        plant.size = 50;

        // plant = null;      // If plant object is to put in garbage collection then also leaf object will be also move on garbage collection.
    }
}
