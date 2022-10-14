using System;

namespace _02.TriangleArea
{
    class Program
    {
        static void Main(string[] args)
        {
            double wall = double.Parse(Console.ReadLine());
            double height = double.Parse(Console.ReadLine());

            //aritmetics
            double area = wall * height / 2;

            Console.WriteLine($"{area:F2}");
        }
    }
}
