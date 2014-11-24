import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by xiaohe on 14-11-24.
 */
public class ReflectionDemo {

    public static void main(String[] args) throws Exception {
//        Person h = new Person("Yuwen");
//        System.out.println("before changing field:");
//        h.print();
//
//        Class cls1 = Person.class;
//        Class cls2 = h.getClass();
//        Class cls3 = Class.forName("Person");
//
//        System.out.println("Class name from cls1:" + cls1.getName());
//        System.out.println("Class name from cls2:" + cls2.getName());
//        System.out.println("Class name from cls3:" + cls3.getName());
//
//        testFieldAccess(cls2, h);
//        testMethodInvocation(cls2, h);
//        testMethodWithMultipleArgs();

        testStatic();
    }

    private static void testStatic() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class cls=Person.class;
        Class[] args=new Class[]{int.class, float.class, String.class};

        Method method=cls.getDeclaredMethod("compute", args);
        Object fstObj=2;
        Object sndObj=2.2f;
        Object thirdObj="test";

        method.invoke(null, fstObj, sndObj, thirdObj);


    }

    private static void testMethodWithMultipleArgs() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person pupu = new Person("Pupu");

        Class personCls = pupu.getClass();
        String calcMethName = "calc";
        Class[] params = new Class[]{int.class, int.class, String.class};
        Method calcMeth = personCls.getDeclaredMethod(calcMethName, params);
        System.out.println(calcMeth.invoke(pupu, 1, 2, "+"));

    }

    private static void testFieldAccess(Class cls, Person h) throws NoSuchFieldException, IllegalAccessException {
        Field name = cls.getDeclaredField("name");
        name.set(h, "pupu");

        h.print();
    }

    private static void testMethodInvocation(Class cls2, Person h) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class[] argTypes = new Class[]{String.class};
        Method speakM = cls2.getDeclaredMethod("speak", argTypes);
        speakM.invoke(h, "some words to say");

        speakM.invoke(new Person("Baicai"), "I love pupu");

    }
}
