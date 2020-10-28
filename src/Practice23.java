public class Practice23 {
    static void f(Interval y){
        y.f = 1.0f;
    }
    public static void main(String args[]){
        Interval x = new Interval();
        x.f = 2.0f;
        System.out.println("1:x.f="+x.f);
        f(x);
        System.out.println("2:x.f="+x.f);
    }
}

class Interval{
    float f;
}
