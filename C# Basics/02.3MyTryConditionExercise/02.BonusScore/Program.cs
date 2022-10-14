using System;

namespace _02.BonusScore
{
    class Program
    {
        static void Main(string[] args)
        {
            int starterPoints = int.Parse(Console.ReadLine());
            double bonus = 0;

            if (starterPoints <= 100)
            {
                bonus = bonus + 5;
            }
            else if (starterPoints > 1000)
            {
                bonus = starterPoints * 0.10;
            }
            else
            {
                bonus = starterPoints * 0.20;
            }

            if (starterPoints % 2 == 0)
            {
                bonus = bonus + 1;
            }
            else if (starterPoints % 10 == 5)
            {
                bonus += 2;
            }

            Console.WriteLine(bonus);
            Console.WriteLine(starterPoints + bonus);
        }
    }
}
