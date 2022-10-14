using System;

namespace _05.Firm
{
    class Program
    {
        static void Main(string[] args)
        {
            int hours = int.Parse(Console.ReadLine());
            int days = int.Parse(Console.ReadLine());
            int workersWorkingOutOfTime = int.Parse(Console.ReadLine());

            double daysAfterTraining =days - days * 0.10;
            double workingTime = daysAfterTraining * 8;
            double workingOutOfTime = workersWorkingOutOfTime * (2 * days);
            double totalHours = Math.Floor(workingTime + workingOutOfTime);

            if (totalHours>=hours)
            {
                Console.WriteLine($"Yes!{totalHours-hours} hours left.");
            }
            else
            {
                Console.WriteLine($"Not enough time!{hours-totalHours} hours needed.");
            }


        }
    }
}
