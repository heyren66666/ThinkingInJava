public class Practice210 {
    public static void main(String args[]){
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;
        System.out.println("i1 = "+Integer.toBinaryString(i1));
        System.out.println("i2 = "+Integer.toBinaryString(i2));
        System.out.println("~i1 = "+Long.toBinaryString(~i1));
        System.out.println("~i2 = "+Long.toBinaryString(~i2));
        System.out.println("i1&i1 ="+Long.toBinaryString(i1&i1));
        System.out.println("i1|i1 = "+Long.toBinaryString(i1|i1));
        System.out.println("i1^i1 = "+Long.toBinaryString(i1^i1));
        System.out.println("i1&i2 = "+Long.toBinaryString(i1&i2));
        System.out.println("i1|i2 ="+Long.toBinaryString(i1|i2));
        System.out.println("i1^i2 = "+Long.toBinaryString(i1^i2));
    }
}
