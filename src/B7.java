public class B7 {
    public static void main(String[] args)
    {
        for(int row = 1; row <=5; row += 1)
        {
            for (int col = 1; col <= 5; col += 1)
            {
                System.out.printf("|", row + col);
            }
            System.out.println();
        }
    }
}
