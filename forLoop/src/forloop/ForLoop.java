package forloop;

public class ForLoop {

    public static void main(String[] args) {

        //Loop that prints numbers from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Loop is over.");

        //Loop that prints odd numbers from 1 to 10.
        for (int j = 1; j <= 10; j += 2) {
            System.out.println(j);
        }

        System.out.println("Loop is over.");

        //Loop that prints even numbers from 0 to 10.
        for (int j = 0; j <= 10; j += 2) {
            System.out.println(j);
        }

        System.out.println("Loop is over.");

    }

}
