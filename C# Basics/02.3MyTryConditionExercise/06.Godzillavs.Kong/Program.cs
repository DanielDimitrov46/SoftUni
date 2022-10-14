using System;

namespace _06.Godzillavs.Kong
{
    class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            int scenarists = int.Parse(Console.ReadLine());
            double pricePerCloth = double.Parse(Console.ReadLine());

            double decor = budget * 0.10;
            double allClothPrice = scenarists * pricePerCloth;
            if (scenarists>150)
            {
                allClothPrice = allClothPrice - 0.10 * allClothPrice;

            }
            if (decor+allClothPrice>budget)
            {
                Console.WriteLine("Not enough money!");
                Console.WriteLine($"Wingard needs {(decor+allClothPrice)-budget:F2} leva more.");

            }
            else
            {
                Console.WriteLine("Action!");
                Console.WriteLine($"Wingard starts filming with {budget-(decor+allClothPrice):F2} leva left.");
            }

        }
    }
}
