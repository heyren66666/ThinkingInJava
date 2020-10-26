public class Practice15 {
    public static void main(String args[]){
        class DataOnly{
            int i;
            double d;
            boolean b;
        }
        DataOnly a = new DataOnly();
        a.i = 1;
        a.d = 2.718;
        a.b = false;
        System.out.println("a.i="+a.i);
        System.out.println("a.d="+a.d);
        System.out.println("a.b="+a.b);
    }
}
