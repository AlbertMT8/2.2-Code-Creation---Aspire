/**
     * Constructs an Eagle with the specified species, habitat, wingspan, and talon size.
     *
     * @param species    the species of the eagle
     * @param habitat    the habitat of the eagle
     * @param wingspan   the wingspan of the eagle in meters
     * @param talonSize  the size of the eagle's talons in centimeters
     */

public class Eagle extends Bird {
    private int talonSize;
    public Eagle(float wingspan, int talonSize)
    {
        super("Eagle", "Forest", wingspan);
        this.talonSize = talonSize;
    }
            
    
    public void fly() {
        System.out.println("I am an eagle flying with a talon size of " + talonSize + " feet!");
    }
}