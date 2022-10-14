using System;

namespace _08.FishTank
{
    class Program
    {
        static void Main(string[] args)
        {
           int longCm = int.Parse(Console.ReadLine());
            int widthCm = int.Parse(Console.ReadLine());
            int heightCm = int.Parse(Console.ReadLine());
            double percent = double.Parse(Console.ReadLine());


            //izchisleniq za obem
            double area = longCm * widthCm * heightCm;
            double litresTotal = area * 0.001;
            double percentConv = percent / 100;
            double litesNeed = litresTotal * (1 - percentConv);

            Console.WriteLine(litesNeed);
        }
    }
}
