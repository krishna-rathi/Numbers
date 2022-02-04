//The first few Catalan numbers for n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …  
class CatalnNumber {
 
    // A recursive function to find nth catalan number
    int catalan(int n)
    {
        int res = 0;
 
        // Base case
        if (n <= 1)
        {
            return 1;
        }
        for (int i = 0; i < n; i++)
        {
            res += catalan(i)
                * catalan(n - i - 1);
        }
        return res;
    }
 
    public static void main(String[] args)
    {
        CatalnNumber cn = new CatalnNumber();
        for (int i = 0; i < 10; i++)
        {
            System.out.print(cn.catalan(i) + " ");
        }
    }
}
