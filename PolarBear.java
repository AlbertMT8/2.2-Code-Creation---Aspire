/**
     * Constructs a PolarBear with the specified species, habitat, hair color, and weight.
     *
     * @param species    the species of the polar bear
     * @param habitat    the habitat of the polar bear
     * @param hairColor  the color of the polar bear's hair
     * @param weight     the weight of the polar bear in kilograms
     */
    
public class PolarBear extends Mammal {
    private int weight;
    public PolarBear(String hairColor, int weight)
    {
        super("Polar Bear", "Arctic", hairColor);
        this.weight = weight;
    }

    public void catchSalmon() {
        System.out.println("I am a polar bear that weighs " + weight + " pounds that is chomping down on some delicious salmon!");
    }
}