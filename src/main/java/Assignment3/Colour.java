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
    public String getModel(){
        return this.model;
    }
    public int getRed(){
        return this.red;
    }
    public int getGreen(){
        return this.green;
    }
    public int getBlue(){
        return this.blue;
    }
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


    public boolean satisfiesRGBDefault() {
        if(this.getModel().toUpperCase() == "RGB"){
         return true;
        }else{
        return false;}
    }

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

    public Colour add(Colour colour2) {
        if (this.model.toUpperCase() != colour2.model.toUpperCase()){
            throw new AssertionError("Can't add two different Colour types");
        }else{
            model = this.model;
            red = this.red + colour2.red;
            green = this.green + colour2.green;
            blue = this.blue + colour2.blue;}
        return new Colour(red, green, blue, model);

    }
}
