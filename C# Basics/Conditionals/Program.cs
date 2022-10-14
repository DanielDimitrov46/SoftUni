using System;

namespace Conditionals
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("enter expected mark:");
            double mark = double.Parse(Console.ReadLine());
            if (mark >= 5.50)
            {
                Console.WriteLine("Excellent!");
            }
            else
            { 
                Console.WriteLine("Poor mark!");
            }
        }
    }
}
