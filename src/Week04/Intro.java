package Week04;

public class Intro {

    public static void main(String[] args) {
        try{
            System.out.println(5/0);
        }catch (ArithmeticException e){
            System.out.println(e);
        }


    }
}
