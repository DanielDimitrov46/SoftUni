using System;

namespace _03.CelsiusToFahrenheit
{
    class Program
    {
        static void Main(string[] args)
        {
            double celsi = double.Parse(Console.ReadLine());
            double far = celsi * 1.8 + 32;

            Console.WriteLine($"{far:F2}");
        }
    }
}
