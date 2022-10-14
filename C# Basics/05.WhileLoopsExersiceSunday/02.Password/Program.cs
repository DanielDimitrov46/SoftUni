
using System;

namespace _02.Password
{
    class Program
    {
        static void Main(string[] args)
        {
            int numberOfBadGrades = int.Parse(Console.ReadLine());
            string input = Console.ReadLine();
            int badGradesCounter = 0;
            int numberOfProblemsCounter = 0;
            bool breakFlag = false;
            string lastproblem = "";
            int gradesCounter = 0;
            double totalGrades = 0;

            while (input!="Enough")
            {
                double grade = int.Parse(Console.ReadLine());
                gradesCounter++;
                lastproblem = input;
                numberOfProblemsCounter++;
                totalGrades += grade;
                if (grade<=4)
                {
                    badGradesCounter++;

                }
                if (badGradesCounter>=numberOfBadGrades)
                {
                    breakFlag = true;
                    break;
                }


                input = Console.ReadLine();
            }
            if (breakFlag)
            {
                Console.WriteLine($"You need a break, {badGradesCounter} poor grades.");

            }
            else
            {
                Console.WriteLine($"Average score: {(totalGrades/gradesCounter):F2}");
                Console.WriteLine($"Number of problems: {numberOfProblemsCounter}");
                Console.WriteLine($"Last problem: {lastproblem}");
            }
        }
    }
}
