public class main {
    public static void main(String[] args) {
        int counter = 0;
        for(int n=2;n<=100;n++)
        {
            int control = 0;
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    control = 1;
                    break;
                }
            }

            if(control==0)
            {
                System.out.print(n+"\n");
                counter++;
            }
        }
    }
}