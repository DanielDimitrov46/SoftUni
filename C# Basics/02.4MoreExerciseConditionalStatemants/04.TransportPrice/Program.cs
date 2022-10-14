using System;

namespace _04.TransportPrice
{
    class Program
    {
        static void Main(string[] args)
        {
            int km = int.Parse(Console.ReadLine());
            string sideOfDay = Console.ReadLine();
            double price = 0.0;

            if (km < 20 && sideOfDay == "day")
            {
                price = 0.70 + 0.79 * km;
                Console.WriteLine($"{price:F2}");
            }
            else if (km < 20 && sideOfDay == "night")
            {
                price = 0.70 + 0.90 * km;
                Console.WriteLine($"{price:f2}");
            }
            else if (km >= 100 )
            {
                price = km * 0.06;
                Console.WriteLine($"{price:F2}");
            }
            else if (km >= 20 )
            {
                price = km * 0.09;
                Console.WriteLine($"{price:F2}");
            }
            

        }
    }
}
