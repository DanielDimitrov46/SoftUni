using System;

namespace _08._Pet_Shop
{
    class Program
    {
        static void Main(string[] args)
        {
            int dogCount = int.Parse(Console.ReadLine());
            int otherAnimalsCount = int.Parse(Console.ReadLine());

            double totalDogfoodPrice = dogCount*2.5;
            double totalOtherAnimalFoodPrice = otherAnimalsCount * 4.0;

            double totalFoodPrice=totalDogfoodPrice +totalOtherAnimalFoodPrice;

            Console.WriteLine($"{totalFoodPrice} lv.");

        }
    }
}
