public class Practice26 {
    static void compare(Dog dog1,Dog dog2){
        System.out.println("== on top reference:"+(dog1==dog2));
        System.out.println(".equals() on top reference:"+dog1.equals(dog2));
        System.out.println("== on name:"+(dog1.name==dog2.name));
        System.out.println(".equals() on name:"+dog1.name.equals(dog2.name));
        System.out.println("== on says:"+(dog1.says==dog2.says));
        System.out.println(".equales() on name:"+dog1.name.equals(dog2.says));
    }
    public static void main(String args[]){
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff";
        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf";
        Dog dog3 = dog1;
        System.out.println("Compare dog1 and dog2 objects");
        compare(dog1,dog2);
        System.out.println("Compare dog1 and dog3 objects");
        compare(dog1,dog3);
        System.out.println("Compare dog2 and dog3 objects");
        compare(dog2,dog3);
    }
}


