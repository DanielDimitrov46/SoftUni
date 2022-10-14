using System;

namespace _02.SleepyTomCat
{
    class Program
    {
        static void Main(string[] args)
        {
            int restDays = int.Parse(Console.ReadLine());

            int workDays = 365 - restDays;
            int playingOnRestDays = restDays * 127;
            int playingOnWorkDays = workDays * 63;

            int realPlayTime = playingOnRestDays + playingOnWorkDays;
            if (realPlayTime < 30000)
            {
                int excessTime = 30000 - realPlayTime;
                Console.WriteLine("Tom sleeps well");
                Console.WriteLine($"{excessTime / 60} hours and {excessTime % 60} minutes less for play");
            }
            else
            {
                int excessTime = realPlayTime - 30000;
                Console.WriteLine("Tom will run away");
                Console.WriteLine($"{excessTime / 60} hours and {excessTime % 60} minutes more for play");
            }

        }
    }
}
