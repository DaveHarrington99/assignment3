package Assignment3;

public class Colour {
    private int red;
    private int green;
    private int blue;
    private String model;

    public Colour(int r, int g, int b){
        this.red = r;
        this.green = g;
        this.blue = b;
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
