using System;

namespace Practise_on_25._04._2021
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter deposit sum: ");
           double deposit = double.Parse(Console.ReadLine());
            Console.Write("Enter period of time you want: ");
            int period = int.Parse(Console.ReadLine());
            Console.Write("Enter the interest rate: ");
            double percent = double.Parse(Console.ReadLine());
            double rpercent = percent / 100;
            double final = deposit + period * ((deposit * rpercent) / 12);
            Console.WriteLine(final);
        }
    }
}
