package Assignment3;

public class Colour {
    private int red;
    private int green;
    private int blue;
    private String model;

    public Colour(int r, int g, int b){
        if(r > 255){
            this.red = 255;}
        else if(r < 0){
            this.red = 0;
        }else{this.red = r;}


        if(g > 255){
            this.green = 255;
        }else if(g < 0){
            this.green = 0;
        }else{this.green = g;}

        if(b > 255){
            this.blue = 255;
        }else if(b < 0){
            this.blue = 0;
        }else{this.blue = b;}

        this.model = "RGB";
    }
    public Colour(int r, int g, int b, String type){
        this.model = type;
        if(r > 255){
            this.red = 255;}
        else if(r < 0){
            this.red = 0;
        }else{this.red = r;}


        if(g > 255){
            this.green = 255;
        }else if(g < 0){
            this.green = 0;
        }else{this.green = g;}

        if(b > 255){
            this.blue = 255;
        }else if(b < 0){
            this.blue = 0;
        }else{this.blue = b;}
    }
    /**
     *
     * @return model type of the colour
     */
    public String getModel(){
        return this.model;
    }

    /**
     *
     * @return red value of the colour
     */
    public int getRed(){
        return this.red;
    }

    /**
     *
     * @return green value of the colour
     */
    public int getGreen(){
        return this.green;
    }

    /**
     *
     * @return blue value of the colour
     */
    public int getBlue(){
        return this.blue;
    }


    /**
     * see whether or not created colour satisfies boundary conditions
     *
     * @return true if satisfies boundary conditions; false otherwise
     */
    public boolean satisfiesRequirements() {
        if(this.getRed()>255 || this.getRed() < 0){
            return false;
        }else if(this.getGreen() > 255 || this.getGreen() < 0){
            return false;
        }else if(this.getBlue() > 255 || this.getBlue() < 0){
            return false;
        }else{
            return true;
        }

    }

    /**
     *
     * @return boolean whether or not default model type is RGB
     */
    public boolean satisfiesRGBDefault() {
        if(this.getModel().toUpperCase() == "RGB"){
         return true;
        }else{
        return false;}
    }
    /**
     * compares whether two colour objects are exactly the same or not
     *
     * @param colour2 another colour object to compare it to
     * @return boolean as to whether two colour objects are the same
     */
    public boolean comparison(Colour colour2) {
        boolean comparison = true;
        if (this.getModel().toUpperCase() != colour2.getModel().toUpperCase()){
            comparison = false;
            return comparison;
        }else if (this.getRed() != colour2.getRed()){
            comparison = false;
            return comparison;
        }else if(this.getGreen() != colour2.getGreen()){
            comparison = false;
            return comparison;}
        else if (this.getBlue() != colour2.getBlue()){
            comparison=false;
            return comparison;
        }else{
            return comparison;
        }
    }
    /**
     * add colour parameters of two different colours of the same type
     *
     * @param colour2 another colour object
     * @return new colour object which is a result of the addition of the two other colour objects
     */
    public Colour add(Colour colour2) {
        if (this.model.toUpperCase() != colour2.model.toUpperCase()){
            throw new AssertionError("Can't add two different Colour types");
        }else{
            model = this.model;
            return new Colour(this.getRed() + colour2.getRed(), this.getGreen() + colour2.getGreen(),
                    this.getBlue() + colour2.getBlue());}
    }
    /**
     *
     * @return string format of a colour object split up into its individual parameters
     */
    @Override
    public String toString() {
        return "Red: " + this.getRed() +"\n"+
                "Green: " + this.getGreen() + "\n"+
                "Blue: " + this.getBlue() + "\n" +
                "Type: " + this.getModel() + "\n";
    }
}
