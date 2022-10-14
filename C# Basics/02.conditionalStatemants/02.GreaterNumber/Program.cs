using System;

namespace _02.GreaterNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            double number1 = double.Parse(Console.ReadLine());
            double number2 = double.Parse(Console.ReadLine());

            double biggerNumber = Math.Max(number1, number2);

            Console.WriteLine(biggerNumber);
        }
    }
}
