public class Practice212 {
    public static void main(String args[]){
        int i = -1<<1;
        System.out.println(Integer.toBinaryString(i));
        for (int j = 0;j<32;j++){
            i>>>=1;
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
