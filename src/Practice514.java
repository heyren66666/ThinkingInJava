public class Practice514 {
    public static void main(String args[]){
        StaticField.c();
    }
}

class StaticField{
    static String a = "a初始化";
    static String b;
    static {
        b = "b初始化";
    }
    static void c(){
        System.out.println(a);
        System.out.println(b);
    }
}


