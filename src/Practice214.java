public class Practice214 {
    public static void main(String args[]){
        compare("hello", "hello");
        String s = new String("hello");
        compare("hello", s);
        compare("hello", "World");
    }
    static void compare(String s1,String s2){
        System.out.println("s1 = "+s1+",s2 ="+s2);
        p(s1+"=="+s2,s1==s2);
        p(s1+"!="+s2,s1!=s2);
        p(s1+".equals("+s2+")",s1.equals(s2));
    }
    static void p(String s,boolean b){
        System.out.println(s+" "+b);
    }
}
