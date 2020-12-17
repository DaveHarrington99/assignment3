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


}
