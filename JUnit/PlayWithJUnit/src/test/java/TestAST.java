import deserialize.ReadAST;
import org.junit.Assert;
import org.junit.Test;
import serial.AST;
import serial.GenAST;

/**
 * Created by xiaohe on 11/11/14.
 */
public class TestAST {
@Test
 public void testGenAST(){
    AST curAST= GenAST.genAST();

    AST stdAST= ReadAST.readAST();

    AST newAST=GenAST.genAST2();

    Assert.assertEquals("curAST should equal to stdAST", stdAST, curAST);

//    Assert.assertEquals("newAST should equal to stdAST", stdAST, newAST);
}

}
