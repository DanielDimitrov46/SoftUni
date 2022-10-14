using System;

namespace _04.Vacationbookslist
{
    class Program
    {
        static void Main(string[] args)
        {
            int totalPages = int.Parse(Console.ReadLine());
            double pagesForHour = double.Parse(Console.ReadLine());
            int days = int.Parse(Console.ReadLine());


            double totalTime = totalPages / pagesForHour;
            double totalTimeForDay = totalTime / days;
            Console.WriteLine(totalTimeForDay);
        }
    }
}
