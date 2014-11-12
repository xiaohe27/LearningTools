package serial;

/**
 * Created by xiaohe on 11/11/14.
 */
public class GenAST {
    public static AST genAST(){
        AST leaf1=new AST(2,"leftChild");
        AST leaf2=new AST(5,"rightChild");

        AST root=new AST(7,"root", leaf1, leaf2);

        return root;
    }

}
