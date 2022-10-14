using System;

namespace _07.WorldSwimmingRecord
{
    class Program
    {
        static void Main(string[] args)
        {
            double worldRecord = double.Parse(Console.ReadLine());
            double meters = double.Parse(Console.ReadLine());
            double timeForOneMeter = double.Parse(Console.ReadLine());

            double timeForAll = meters * timeForOneMeter;
            double slowTime = Math.Floor(meters / 15) * 12.5;
            double totalTime = timeForAll + slowTime;
            
            if (totalTime<worldRecord)
            {
                Console.WriteLine($" Yes, he succeeded! The new world record is {totalTime:F2} seconds.");
            }
            else
            {
                Console.WriteLine($"No, he failed! He was {totalTime-worldRecord:F2} seconds slower.");
            }
        }
    }
}
