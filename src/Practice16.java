public class Practice16 {
    String s;
    int storage(String s){
        return s.length()*2;
    }
    public static void main(String args[]){
        Practice16 practice16 = new Practice16();
        int a = practice16.storage("string");
        System.out.println(a);
    }
}
