public class Practice211 {
    public static void main(String args[]){
        int i = 0X80808080;
        System.out.println(Integer.toBinaryString(i));
        for (int j = 0;j<32;j++){
            i>>=1;
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
