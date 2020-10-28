import java.util.Random;

public class Practice27 {
    public static void main(String args[]){
        Random random = new Random(47);
        boolean flip = random.nextBoolean();
        System.out.println(flip);
        System.out.println(flip==true?"Head":"Tail");
    }
}
