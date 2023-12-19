package ss4.exer;

public class Frog {
    static byte count = 0;

    Frog(){
        count++;
    }

    public static byte getCount() {
        return count;
    }


    public static void main(String[] args) {
        Frog frog1=new Frog();
        Frog frog2=new Frog();
        Frog frog3=new Frog();
        System.out.println(Frog.getCount());
    }
}
