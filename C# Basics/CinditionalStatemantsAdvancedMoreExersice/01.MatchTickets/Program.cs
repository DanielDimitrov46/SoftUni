using System;

namespace _01.MatchTickets
{
    class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            string type = Console.ReadLine();
            int people = int.Parse(Console.ReadLine());
            double discount = 0;
            
            

            if (people >= 1 && people <= 4)
            {
                discount = 0.75 * budget;
            }
            else if (people >= 5 && people <= 9)
            {
                discount = budget * 0.60;
            }
            else if (people >= 10 && people <= 24)
            {
                discount = budget * 0.50;
            }
            else if (people >= 25 && people <= 49)
            {
                discount = budget * 0.40;
            }
            else 
            {
                discount = budget * 0.25;
            }
            double total = budget - discount;
            if (type=="VIP")
            {
                total += total + 499.99;
            }
            else
            {
                total += total + 249.99;
            }
            Console.WriteLine($"Yes! You have {budget-total:F2} leva left.");
            Console.WriteLine($"Not enough money! You need {total-budget:F2} leva.");
        }
    }
}
