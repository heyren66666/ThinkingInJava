class StaticTest{
    static int i = 47;
}
class Incrementable{
    static void increment(){
        StaticTest.i++;
    }
}
public class Practice17 {
    public static void main(String args[]){
//        Incrementable incrementable = new Incrementable();
        Incrementable.increment();
    }
}
