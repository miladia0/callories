import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Id id= new Id();Calculetor calculetor=new Calculetor();
        Scanner input =new Scanner(System.in);
        System.out.println("lotfan jesiat khod ra vared konin ");
        id.setJensiat(input.nextBoolean());
        System.out.println("lotfan sen khod ra ared konin");
        id.setSen(input.nextInt());
        System.out.println("lotfan vazn khod ra vred konin");
        id.setVazn(input.nextInt());
        System.out.println("lotfan ghad khod ra vared konin");
        id.setGhad(input.nextInt());
      calculetor.getreport(id);


    }
}
