using System;

namespace _05.Time_15Minutes
{
    class Program
    {
        static void Main(string[] args)
        {
            int input1 = int.Parse(Console.ReadLine());
            int input2 = int.Parse(Console.ReadLine());

            int total = input1 * 60 + input2 + 15;
            int hours = total / 60;
            int minutes = total % 60;

            if (hours==24)
            {
                Console.WriteLine($"0:{minutes:d2}");
            }
            else
            {
                Console.WriteLine($"{hours}:{minutes:d2}");
            }
        }
    }
}
