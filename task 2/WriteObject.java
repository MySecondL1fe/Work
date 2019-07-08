import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class WriteObject {
    public static void main(String[] args) {
        Figures[] figure = {new Figures(15, 13, "Triangle"), new Figures(12, 13, "Rectangle"), new Figures(28, 16, "Circle")};


        try {
            FileOutputStream fos = new FileOutputStream("figure");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(figure);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
