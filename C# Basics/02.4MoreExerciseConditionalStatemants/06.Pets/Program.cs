using System;

namespace _06.Pets
{
    class Program
    {
        static void Main(string[] args)
        {
            int days = int.Parse(Console.ReadLine());
            int foodKg = int.Parse(Console.ReadLine());
            double foodForDogKg = double.Parse(Console.ReadLine());
            double foodForCatKg = double.Parse(Console.ReadLine());
            double foodForTurtleGr = double.Parse(Console.ReadLine());

            double foodForDogNeed = days * foodForDogKg;
            double foodForCatNeed = days * foodForCatKg;
            double foodForTurtleNeed = (days * foodForTurtleGr) / 1000;
            double totalFood = foodForDogNeed + foodForCatNeed + foodForTurtleNeed;

            if (totalFood <= foodKg)
            {
                Console.WriteLine($"{Math.Floor(foodKg-totalFood)} kilos of food left.");
            }
            else
            {
                Console.WriteLine($"{Math.Ceiling(totalFood-foodKg)} more kilos of food are needed.");
            }


        }
    }
}
