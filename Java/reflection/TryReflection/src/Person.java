/**
 * Created by xiaohe on 14-11-24.
 */
public class Person {
    public String name;

    public Person(String name){
        this.name=name;
    }

    public String getName(){
        System.out.println("Name is "+this.name);
        return this.name;
    }

    public void print(){
        System.out.println("Hi, I'm "+this.name);
    }

    public void speak(String words){
        System.out.println(this.name+" is saying: "+words);
    }

    public int calc(int a, int b, String op){
        System.out.println(this.name+" is calculating for you:");

        switch (op){
            case "+" :
                return a+b;

            case "minus":
                return a-b;

            default:
                return a*b;
        }
    }

    public static void compute(int n, float f, String s){
        System.out.println("simply print all the data out:"+n+","+f+","+s);
    }
}
