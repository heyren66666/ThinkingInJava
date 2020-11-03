public class Practice512 {
    public static void main(String args[]){
        Tank tank = new Tank("tank");
        tank.clear();
        new Tank("tank1");
        new Tank("tank2",false);
        Tank tank3 = new Tank("tank3",false);
        tank3.clear();
        System.gc();
    }
}

class Tank{
    String name;
    boolean empyt;
    public Tank(String name){
        this.name = name;
        empyt = true;
    }
    public Tank(String name,boolean isEmpty){
        this.name = name;
        this.empyt = isEmpty;
    }
    void clear(){
        empyt = false;
    }
    protected void finalize() throws Throwable {
        super.finalize();
        if (empyt){
            System.out.println("tank"+name+" is empty");
        }
    }
}
