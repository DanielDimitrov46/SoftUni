using System;

namespace _05.TrainingLab
{
    class Program
    {
        static void Main(string[] args)
        {
            double w = double.Parse(Console.ReadLine());
            double h = double.Parse(Console.ReadLine());

            //izchisleniq2
            double wToCm = w * 100;
            double hToCm = h * 100;
            
            //deleniq za gotovo
            double minusCorridor = hToCm - 100;
            double residueDesks = minusCorridor % 70;
            double residueRows = wToCm % 120;
            //izchisleniq
            double desks = (minusCorridor-residueDesks) / 70;
            double rows = (wToCm - residueRows) / 120;
            //kraj
            double total = rows * desks - 3;

            Console.WriteLine(total);


        }
    }
}
