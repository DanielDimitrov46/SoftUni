using System;

namespace MatchTickets
{
    class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            string type = Console.ReadLine();
            int people = int.Parse(Console.ReadLine());
            double travelCommisison = 0;
            double ticketPrice = 0;


            if (people >= 1 && people <= 4)
            {
                travelCommisison = 0.75 * budget;
            }
            else if (people >= 5 && people <= 9)
            {
                travelCommisison = budget * 0.60;
            }
            else if (people >= 10 && people <= 24)
            {
                travelCommisison = budget * 0.50;
            }
            else if (people >= 25 && people <= 49)
            {
                travelCommisison = budget * 0.40;
            }
            else
            {
                travelCommisison = budget * 0.25;
            }
            if (type=="VIP")
            {
                ticketPrice = 499.99;
            }
            else if (type=="Normal")
            {
                ticketPrice = 249.99;
            }
            double totalAfterTransport = budget-travelCommisison;
            double totalTickets = ticketPrice * people;

            if (totalTickets>totalAfterTransport)
            {
                Console.WriteLine($"Not enough money! You need {totalTickets-totalAfterTransport:F2} leva.");
            }
            else
            {
                Console.WriteLine($"Yes! You have {totalAfterTransport-totalTickets:F2} leva left.");
            }
        }
    }
}
