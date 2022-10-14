using System;

namespace _01.Cinema
{
    class Program
    {
        static void Main(string[] args)
        {
            string typeProjection = Console.ReadLine();
            int rows = int.Parse(Console.ReadLine());
            int cols = int.Parse(Console.ReadLine());
            
            int seats = rows * cols;
            double price = 0;

            switch (typeProjection)
            {
                case "Premiere":
                    price = 12;
                    break;
                case "Normal":
                    price = 7.50;
                    break;
                case "Discount":
                    price = 5;
                    break;

            }
            double result = seats * price;
            Console.WriteLine($"{result:f2} leva");
        }
    }
}
