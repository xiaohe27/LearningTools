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

    public static AST genAST2(){
        AST leaf1=new AST(22,"leftChild");
        AST leaf2=new AST(55,"rightChild");

        AST root=new AST(77,"root2", leaf1, leaf2);

        return root;
    }

}
