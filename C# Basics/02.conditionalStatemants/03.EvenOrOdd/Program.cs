using System;

namespace _03.EvenOrOdd
{
    class Program
    {
        static void Main(string[] args)
        {
            int price = 10;
            double calculatePrice = 0;
            if (price > 50)
            {
                int testValue = 10;
                Console.WriteLine("I'm bigger than 50!" + testValue);
                calculatePrice = 2.0 + testValue;
            }
            else if (price == 10)
            {
                Console.WriteLine("Im equal to 10!");
            }
            else if (price >= 10)
            {
                Console.WriteLine("I'm greater or equal to 10!");
            }
            else
            {
                Console.WriteLine("I'm less than 50!");
            }
        }
    }
}
