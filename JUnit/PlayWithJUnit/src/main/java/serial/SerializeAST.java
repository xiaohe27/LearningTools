package serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by xiaohe on 11/11/14.
 */
public class SerializeAST {
    public static void serializeAST(){
        AST ast=GenAST.genAST();

        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream("./MyAST.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ast);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in ./MyAST.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }

    public static void main(String[] args){
        serializeAST();
    }
}
