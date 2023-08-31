import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int personage= scanner.nextInt();
        Eligibility eligibility=new Eligibility();
        System.out.println(eligibility.func(personage));
    }
}
class Eligibility{
    String func(int a) {
        if (a >= 18)
            return ("The person is eligible for voting");
        else
            return ("The person is not eligible for voting");
    }
}
