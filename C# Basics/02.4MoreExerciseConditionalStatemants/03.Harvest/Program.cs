using System;

namespace _03.Harvest
{
    class Program
    {
        static void Main(string[] args)
        {
            int area = int.Parse(Console.ReadLine());
            double grape = double.Parse(Console.ReadLine());
            int litresNeedForWine = int.Parse(Console.ReadLine());
            int workers = int.Parse(Console.ReadLine());

            double totalGrape = area * grape;
            double wine = totalGrape * 0.40 / 2.5;

            if (wine > litresNeedForWine)
            {
                Console.WriteLine($"Good harvest this year! Total wine: {Math.Floor(wine)} liters.");
                Console.WriteLine($"{Math.Ceiling(wine - litresNeedForWine)} liters left -> {Math.Ceiling(wine - litresNeedForWine) / workers} liters per person.");
            }
            else
            {
                Console.WriteLine($"It will be a tough winter! More {Math.Floor(litresNeedForWine - wine)} liters wine needed.");
            }
        }
    }
}
