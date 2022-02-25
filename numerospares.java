
public class numerospares {

    public static void main(String[] args) {
        int par = 0;
        int mul = 10;
        for (int i = 0; i <= 50; i++) {
            if (i == par) {
                System.out.println(i);
                par += 2;
                if (i == mul) {
                    System.out.println("Angie");
                    mul += 10;
                }

            }

        }
    }

}
