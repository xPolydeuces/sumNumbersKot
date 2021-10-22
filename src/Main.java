public class Main {

    public static void main(String[] args) {
	    // App sums up numbers from 1 to 100
        int sum = 0;
        for (int i = 0; i <= 100; i++)
        {
            if (i % 2 == 0)
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
