public class B6 {
    public static void main(String[] args)
    {
        for(int row = 1; row <=5; row ++)
        {
            for (int col = 1; col <= 5; col += 1)
            {
                System.out.printf("|");
            }
            System.out.println();
            for (int col = 1; col <= 5; col += 2)
            {
                System.out.printf("|");
            }
            System.out.println();
            for (int col = 1; col <= 5; col += 3)
            {
                System.out.printf("|");
            }
            System.out.println();
            for (int col = 1; col <= 5; col += 4)
            {
                System.out.printf("|");
            }
            System.out.println();
            for (int col = 1; col <= 5; col += 5)
            {
                System.out.printf("|");
            }
            System.out.println();
        }
    }
}
