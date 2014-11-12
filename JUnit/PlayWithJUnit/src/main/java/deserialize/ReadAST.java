package deserialize;

import serial.AST;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by xiaohe on 11/11/14.
 */
public class ReadAST {
    public static AST readAST(){
        AST root=null;

        try
        {
            FileInputStream fileIn = new FileInputStream("./MyAST.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            root = (AST) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();
            return null;
        }catch(ClassNotFoundException c)
        {
            System.out.println("AST class not found");
            c.printStackTrace();
            return null;
        }

        return root;
    }

    public static void printASTFromFile(){
        AST root=readAST();

        System.out.println(root.print());
    }

    public static void main(String[] args){
        printASTFromFile();
    }
}
