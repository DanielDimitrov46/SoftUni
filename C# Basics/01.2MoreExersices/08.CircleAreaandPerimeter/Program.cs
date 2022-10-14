using System;

namespace _08.CircleAreaandPerimeter
{
    class Program
    {
        static void Main(string[] args)
        {
            double r = double.Parse(Console.ReadLine());
            double area = Math.PI * r * r;
            double perimeter = 2 * Math.PI * r;

            Console.WriteLine($"{area:F2}");
            Console.WriteLine($"{perimeter:F2}");
        }
    }
}
