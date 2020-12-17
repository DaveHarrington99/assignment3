package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    @Test
    public void acceptColourIfMeetsRequirements(){
        Colour colour1 = new Colour(40,80,-90);
        assertTrue(colour1.satisfiesRequirements(), "Parameters");
    }
}