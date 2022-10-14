using System;

namespace _02._BonusScore
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());

            double bonus = 0;

            if (num <= 100)
            {
                bonus = bonus + 5;
            }
            else if (num > 1000)
            {
                bonus = 0.10 * num;
            }
            else if (num > 100)
            {
                bonus = 0.20 * num;
            }


            if (num % 2 == 0)
            {
                bonus = bonus + 1;
            }
            if (num % 10 == 5)
            {
                bonus = bonus + 2;
            }
            Console.WriteLine(bonus);
            Console.WriteLine(num + bonus);
        }
    }
}
