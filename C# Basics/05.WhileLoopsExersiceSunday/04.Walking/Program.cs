using System;

namespace _04.Walking
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            int totalSum = 0;
            

            while (input!="Going home")
            {
            int steps = int.Parse(input);
            totalSum += steps;
                if (totalSum>=10000)
                {
                    
                    break;
                }

                input = Console.ReadLine();
            }
            if (input=="Going home")
            {
                int goingHomeSteps = int.Parse(Console.ReadLine());
                totalSum += goingHomeSteps;
            }
            if (totalSum>=10000)
            {
                Console.WriteLine("Goal reached! Good job!");
                Console.WriteLine($"{totalSum - 10000} steps over the goal!");
            }
            else
            {
                Console.WriteLine($"{10000 - totalSum} more steps to reach goal.");
            }

        }
    }
}
