public class Practice18 {
    static int i = 21;
    public static void main(String args[]){
        Practice18 practiceA = new Practice18();
        Practice18 practiceB = new Practice18();
        System.out.println("practiceA.i="+practiceA.i+"practiceB.i="+practiceB.i);
        practiceA.i++;
        System.out.println("practiceA.i="+practiceA.i+"practiceB.i="+practiceB.i);
    }
}
