using System;

namespace _07.Projects_Creation
{
    class Program
    {
        static void Main(string[] args)
        {
            string architectName = Console.ReadLine();
            int projectsCount = int.Parse(Console.ReadLine());

            
            int totalProjecthours = projectsCount * 3;

            Console.WriteLine($"The architect {architectName} will need {totalProjecthours} hours to complete {projectsCount} project/s.");
        }
    }
}
