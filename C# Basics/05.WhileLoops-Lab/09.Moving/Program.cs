

using System;

namespace _09.Moving
{
    class Program
    {
        static void Main(string[] args)
        {
            int width = int.Parse(Console.ReadLine());
            int lenght = int.Parse(Console.ReadLine());
            int height = int.Parse(Console.ReadLine());
            string input = Console.ReadLine();
            int sizeOfApartment = width * lenght * height;
            int totalPackets = 0;

            while (input!="Done")
            {
                int numberOfPackets = int.Parse(input);
                totalPackets += numberOfPackets;
                if (totalPackets>=sizeOfApartment)
                {
                    Console.WriteLine($"No more free space! You need {totalPackets-sizeOfApartment} Cubic meters more.");
                    break;
                }



                input = Console.ReadLine();
            }
            if (sizeOfApartment>=totalPackets)
            {
            Console.WriteLine($"{sizeOfApartment-totalPackets} Cubic meters left.");

            }
            
        }
    }
}
