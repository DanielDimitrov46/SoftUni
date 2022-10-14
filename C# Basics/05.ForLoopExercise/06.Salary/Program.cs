
using System;

namespace _06.Salary
{
    class Program
    {
        static void Main(string[] args)
        {
            int numOfTabs = int.Parse(Console.ReadLine());
            double salary = double.Parse(Console.ReadLine());
            double fees = 0;


            for (int i = 0; i < numOfTabs; i++)
            {
                string website = Console.ReadLine();

                switch (website)
                {
                    case"Facebook":
                        fees += 150;
                        break;
                    case "Instagram":
                        fees += 100;
                        break;
                    case "Reddit":
                        fees += 50;
                        break;
                }

                if (fees>=salary)
                {
                    Console.WriteLine("You have lost your salary.");
                    break;
                }

            }

            if (fees<salary)
            {
                Console.WriteLine(salary-fees);
            }

        }
    }
}
