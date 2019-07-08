import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Arrays;
public class ReadObject {
public static void main(String[] args){
    try{
        FileInputStream fis = new FileInputStream("figure");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Figures[] figure =(Figures[])ois.readObject();
        System.out.println(Arrays.toString(figure));
        ois.close();
    }catch (IOException e){
        e.printStackTrace();
    }catch (ClassNotFoundException e){
        e.printStackTrace();
    }
}
}
