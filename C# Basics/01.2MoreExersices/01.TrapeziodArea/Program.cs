using System;

namespace _01.TrapeziodArea
{
    class Program
    {
        static void Main(string[] args)
        {
            double b1 = double.Parse(Console.ReadLine());
            double b2 = double.Parse(Console.ReadLine());
            double h1 = double.Parse(Console.ReadLine());

            double area = (b1 + b2) * h1 / 2;
            Console.WriteLine($"{area:F2}");
        }
    }
}
