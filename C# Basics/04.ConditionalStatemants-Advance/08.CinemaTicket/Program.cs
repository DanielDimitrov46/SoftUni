using System;

namespace _08.CinemaTicket
{
    class Program
    {
        static void Main(string[] args)
        {
            string dayOfTheWeek = Console.ReadLine();

            if (dayOfTheWeek=="Monday"||dayOfTheWeek=="Tuesday"||dayOfTheWeek=="Friday")
            {
                Console.WriteLine(12);
            }
            else if (dayOfTheWeek=="Wednesday"||dayOfTheWeek=="Thursday")
            {
                Console.WriteLine(14);
            }
            else if (dayOfTheWeek=="Saturday"||dayOfTheWeek=="Sunday")
            {
                Console.WriteLine(16);
            }
            else
            {
                Console.WriteLine("Invalid input");
            }

        }
    }
}
