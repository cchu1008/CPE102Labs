public class SimpleLoop
{
   public static int sum(int low, int high)
   {
      /* TO DO:  Return the sum of the integers between
         low and high (inclusive).  Yes, this can be
         done without a loop, but the point is to
         practice the syntax for a loop.
      */
		int i = low;
		int sum = 0;
		while (i < (high + 1))
		{
			sum += i;
			i++;
		}
		return sum;

      return 0;
   }
}