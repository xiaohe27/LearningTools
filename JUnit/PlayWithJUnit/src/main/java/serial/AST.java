package serial;

import java.io.Serializable;

/**
 * Created by xiaohe on 11/11/14.
 */
public class AST implements Serializable {
    private int intData;
    private String strData;

    private AST leftChild;
    private AST rightChild;

    public AST(){
        this.setStrData("defaultSTR");
    }

    public AST(int intData, String strData) {
        this(intData, strData, new AST(), new AST());
    }

    public AST(int intData, String strData, AST leftChild, AST rightChild) {
        this.setIntData(intData);
        this.setStrData(strData);
        this.setLeftChild(leftChild);
        this.setRightChild(rightChild);
    }


    public String print(){
        String output="";

        output+=("The node is: "+this.getStrData()+"--"+intData)+"\n";
        String lc= leftChild==null ? "NULL" : leftChild.print();
        String rc= rightChild==null ? "NULL" : rightChild.print();

        output+="{//here comes the left child: \n"+lc+"\n}\n{//here comes the right child: \n"+rc+"\n}\n";

        return output;
    }

//    @Override
    public boolean equals(AST other){
        if (other==null)
            return false;

        if (!this.getStrData().equals(other.getStrData()))
            return false;

        if (this.getIntData() != other.getIntData())
            return false;

        if(this.leftChild!=null){
            boolean leftOK=this.leftChild.equals(other.leftChild);

            if(!leftOK)
                return false;
        } else{
            if(other.leftChild !=null)
                return false;
        }

        if(this.rightChild!=null){
            boolean rightOK=this.rightChild.equals(other.rightChild);

            if(!rightOK)
                return false;
        } else{
            if(other.rightChild !=null)
                return false;
        }

        return true;
    }

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public String getStrData() {
        return strData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }

    public AST getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(AST leftChild) {
        this.leftChild = leftChild;
    }

    public AST getRightChild() {
        return rightChild;
    }

    public void setRightChild(AST rightChild) {
        this.rightChild = rightChild;
    }
}
