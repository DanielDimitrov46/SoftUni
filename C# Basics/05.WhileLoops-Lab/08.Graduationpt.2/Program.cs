
using System;

namespace _08.Graduationpt._2
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            bool flagGetOut = false;
            int gradeCounter = 1;
            int badMarksCounter = 0;

            double total = 0;

            while (gradeCounter <= 12)
            {
                double mark = double.Parse(Console.ReadLine());

                total += mark;
                if (mark < 4)
                {
                    badMarksCounter++;
                }
                if (badMarksCounter == 2)
                {
                    Console.WriteLine($"{name} has been excluded at {gradeCounter - 1} grade");
                    flagGetOut = true;
                    break;
                }

                gradeCounter++;
            }
            if (!flagGetOut)
            {
                Console.WriteLine($"{name} graduated. Average grade: {(total / 12):F2}");
            }


        }
    }
}
