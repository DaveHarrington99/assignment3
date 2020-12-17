package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    @Test
    public void acceptColourIfObjectCreatesSuccessfully(){
        Colour colour1 = new Colour(40,80,-90);
        colour1.satisfiesRequirements();
    }

    @Test
    public void acceptIfObjectMeetsBoundaryRequirements(){
        Colour colour1 = new Colour(40, 80, -90);
        assertTrue(colour1.satisfiesRequirements(), "parameter values outside range");
    }
}