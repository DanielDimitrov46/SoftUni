using System;

namespace _07.WorkingHours
{
    class Program
    {
        static void Main(string[] args)
        {
            int hourOfTheDay = int.Parse(Console.ReadLine());
            string dayOfTheWeek = Console.ReadLine();
            if ((dayOfTheWeek == "Monday" || dayOfTheWeek == "Tuesday" || dayOfTheWeek == "Wednesday" || dayOfTheWeek == "Thursday" || dayOfTheWeek == "Friday" || dayOfTheWeek == "Saturday") && (hourOfTheDay >= 10 && hourOfTheDay <= 18))
            {
                Console.WriteLine("open");
            }
            else
            {
                Console.WriteLine("closed");
            }

        }
    }
}
