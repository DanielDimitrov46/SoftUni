using System;

namespace _07.FromToday
{
    class Program
    {
        static void Main(string[] args)
        {
            //read input
            double worldRecord = double.Parse(Console.ReadLine());
            double meters = double.Parse(Console.ReadLine());
            double timePerMeter = double.Parse(Console.ReadLine());

            //2.Calculate Ivan's time
            double totalTime = meters * timePerMeter;
            double delay = Math.Floor(meters / 15) * 12.5;
            totalTime += delay;

            //3. Check whether Ivan did better than the world record.
            if (totalTime < worldRecord)
            {
                Console.WriteLine($"Yes, he succeeded! The new world record is {totalTime:f2} seconds.");
            }
            else
            {
                Console.WriteLine($"No, he failed! He was {totalTime - worldRecord:f2} seconds slower.");
            }

        }
    }
}
