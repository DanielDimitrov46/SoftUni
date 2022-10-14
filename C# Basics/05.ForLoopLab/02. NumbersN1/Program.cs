
using System;

namespace _02._NumbersN1
{
    class Program
    {
        static void Main(string[] args)
        {
            int start = int.Parse(Console.ReadLine());
            for (int number = start; number >=1; number--)
            {
                Console.WriteLine(number);
            }
        }
    }
}
