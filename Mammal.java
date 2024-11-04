/**
     * Constructs a Mammal with the specified species, habitat, and hair color.
     *
     * @param species    the species of the mammal
     * @param habitat    the habitat of the mammal
     * @param hairColor  the color of the mammal's hair
     */

public class Mammal extends Animal {
    private String hairColor;
    public Mammal (String species, String habitat, String hairColor)
    {
        super(species, habitat);
        this.hairColor = hairColor;
    }
        
    public void birth() {}
}