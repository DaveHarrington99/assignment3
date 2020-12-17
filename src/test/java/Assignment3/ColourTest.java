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
        Colour colour1 = new Colour(40,50,60, "CYMK");
        assertFalse(colour1.satisfiesRGBDefault(), "is a RGB model");
    }

    @Test
    public void acceptIfComparisonIsTrue(){
        Colour colour1 = new Colour(40, 50, -90, "CYMK");
        Colour colour2 = new Colour(20, 12, 30);
        colour1.comparison(colour2);
    }

    @Test
    public void acceptIfComparisonCanBeMade(){
        Colour colour1 = new Colour(40, 50, -90);
        Colour colour2 = new Colour(40, 50, -90, "CYMK");
        assertTrue(colour1.comparison(colour2), "not same model type");
    }
}