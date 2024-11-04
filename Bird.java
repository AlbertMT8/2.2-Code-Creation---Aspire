/**
     * Constructs a Bird with the specified species, habitat, and wingspan.
     *
     * @param species   the species of the bird
     * @param habitat   the habitat of the bird
     * @param wingspan  the wingspan of the bird in meters
     */

public class Bird extends Animal {
    private float wingspan; 
    public Bird (String species, String habitat, float wingspan)
    {
        super(species, habitat);
        this.wingspan = wingspan;
    }
    
        public void layEggs() {}
    }