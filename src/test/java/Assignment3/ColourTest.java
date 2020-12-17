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
        colour1.satisfiesRequirements();
    }

    @Test
    public void acceptIfDefaultModelIsRGB(){
        Colour colour1 = new Colour(40, 80,90);
        colour1.satisfiesRGBDefault();
    }

    @Test
    public void acceptIfModelNotRGB(){
        Colour colour1 = new Colour(40,50,60);
        assertFalse(colour1.satisfiesRGBDefault(), "is a RGB model");
    }
}