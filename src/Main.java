import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Id id= new Id();Calculetor calculetor=new Calculetor();
        Scanner input =new Scanner(System.in);
        System.out.println("please enter your gender ");
        id.setJensiat(input.nextBoolean());
        System.out.println("please enter your age");
        id.setSen(input.nextInt());
        System.out.println("please enter your weigh");
        id.setVazn(input.nextInt());
        System.out.println("please enter your height");
        id.setGhad(input.nextInt());
      calculetor.getreport(id);


    }
}
