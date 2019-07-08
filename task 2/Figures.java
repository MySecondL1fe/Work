import java.io.Serializable;

public class Figures implements Serializable {
    private int x,y;
    private String tipe;

    public Figures(int x, int y, String tipe){
        this.x = x;
        this.y = y;
        this.tipe = tipe;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public  String getTipe(){
        return tipe;
    }
    public String toString(){
        return tipe + ":" + x +"," + y;
    }
}
