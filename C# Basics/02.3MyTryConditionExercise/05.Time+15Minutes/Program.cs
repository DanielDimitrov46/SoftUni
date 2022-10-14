using System;

namespace _05.Time_15Minutes
{
    class Program
    {
        static void Main(string[] args)
        {
            int hours = int.Parse(Console.ReadLine());
            int minutes = int.Parse(Console.ReadLine());

            int totalMinutes = hours * 60 + minutes + 15;

            int hours2 = totalMinutes / 60;
            int minutes2 = totalMinutes % 60;

            if (hours2>23)
            {
                hours2 = 0;
            }
            if (minutes2 < 10)
            {
                Console.WriteLine($"{hours2}:0{minutes2}");
            }
            else
            {
                Console.WriteLine($"{hours2}:{minutes2}");
            }

        }
    }
}
