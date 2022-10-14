using System;

namespace _00.Demos
{
    class Program
    {
        static void Main(string[] args)
        {
            string weather = Console.ReadLine();
            int degrees = int.Parse(Console.ReadLine());

            if (!(weather=="cloudy")&& degrees>25)
            {
                Console.WriteLine("Go to the beach");
            }
          
        }
    }
}
