using System;

namespace _01.PipesInPool
{
    class Program
    {
        static void Main(string[] args)
        {
            int litres = int.Parse(Console.ReadLine());
            int debitFirstPipe = int.Parse(Console.ReadLine());
            int debitSecondPipe = int.Parse(Console.ReadLine());
            double hoursForWorkerLeft = double.Parse(Console.ReadLine());

            double firstPipeFill = debitFirstPipe * hoursForWorkerLeft;
            double secondPipeFill = debitSecondPipe * hoursForWorkerLeft;
            double totalLitres = firstPipeFill + secondPipeFill;

            if (totalLitres<=litres)
            {
                Console.WriteLine($"The pool is {totalLitres/litres*100:f2}% full. Pipe 1: {firstPipeFill/totalLitres*100:f2}%. Pipe 2: {secondPipeFill/totalLitres*100:F2}%.");
            }
            else
            {
                Console.WriteLine($"For {hoursForWorkerLeft:f2} hours the pool overflows with {totalLitres-litres:f2} liters.");
            }

        }
    }
}
