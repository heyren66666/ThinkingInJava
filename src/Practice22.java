class People{
    float height;
}
public class Practice22 {
    public static void main(String args[]){
        People xiaoming = new People();
        People xiaohong = new People();
        xiaoming.height = 2.1f;
        xiaohong.height = 1.68f;
        System.out.println("xiaoming.height="+xiaoming.height+"xiaohong.height="+xiaohong.height);
        xiaoming = xiaohong;
        System.out.println("xiaoming.height="+xiaoming.height+"xiaohong.height="+xiaohong.height);
        xiaoming.height = 1.96f;
        System.out.println("xiaoming.height="+xiaoming.height+"xiaohong.height="+xiaohong.height);
    }
}
