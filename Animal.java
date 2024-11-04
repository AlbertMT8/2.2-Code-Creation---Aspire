
 /**
     * Constructs an Animal with the specified species and habitat.
     *
     * @param species the species of the animal
     * @param habitat the habitat of the animal
     */
public class Animal  {
    private String species;
    private String habitat;
    
    public Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }


    public void eat() {
        System.out.println("I am a " + species + "eating food!");
    }

    

    public static void main(String[] args) {
        Eagle Jeffrey = new Eagle(5,10);
        Jeffrey.fly();
        
        PolarBear Eddie = new PolarBear("white", 2000);
        Eddie.catchSalmon();
    }
}



