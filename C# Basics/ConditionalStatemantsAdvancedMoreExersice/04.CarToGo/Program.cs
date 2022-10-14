
using System;

namespace _04.CarToGo
{
    class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            string season = Console.ReadLine();
            string typeClass = "";
            double cabrio = 0;
            double jeep = 0;
            string car = "";

            if (budget<=100)
            {
                typeClass = "Economy class";
                if (season=="Summer")
                {
                    car = "Cabrio";
                    cabrio = budget * 0.35;
                    Console.WriteLine($"{typeClass}");
                    Console.WriteLine($"{car} - {cabrio:F2}");
                }
                else
                {
                    car = "Jeep";
                    jeep = budget * 0.65;
                    Console.WriteLine($"{typeClass}");
                    Console.WriteLine($"{car} - {jeep:F2}");
                }
            }
            else if (budget>100&&budget<=500)
            {
                typeClass = "Compact class";
                if (season == "Summer")
                {
                    car = "Cabrio";
                    cabrio = budget * 0.45;
                    Console.WriteLine($"{typeClass}");
                    Console.WriteLine($"{car} - {cabrio:F2}");
                }
                else
                {
                    car = "Jeep";
                    jeep = budget * 0.80;
                    Console.WriteLine($"{typeClass}");
                    Console.WriteLine($"{car} - {jeep:F2}");
                }
            }
            else if (budget>500)
            {
                typeClass = "Luxury class";
                car = "Jeep";
                jeep = budget * 0.90;
            Console.WriteLine($"{typeClass}");
            Console.WriteLine($"{car} - {jeep:F2}");
            }

            

        }
    }
}
