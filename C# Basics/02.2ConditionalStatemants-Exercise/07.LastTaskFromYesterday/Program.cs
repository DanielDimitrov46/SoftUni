using System;

namespace _07.LastTaskFromYesterday
{
    class Program
    {
        static void Main(string[] args)
        {
            int time1 = int.Parse(Console.ReadLine());
            int time2 = int.Parse(Console.ReadLine());
            int time3 = int.Parse(Console.ReadLine());

            int totalSeconds = time1 + time2 + time3;

            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;


            Console.WriteLine($"{minutes}:{seconds:D2}");



        }
    }
}
