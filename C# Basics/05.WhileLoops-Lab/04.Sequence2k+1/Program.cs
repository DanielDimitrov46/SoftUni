
using System;

namespace _04.Sequence2k_1
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            int currentNumber = 1;
            while (currentNumber<=number)
            {
                Console.WriteLine(currentNumber);
                currentNumber = currentNumber * 2 + 1;
            }
        }
    }
}
