using System;

namespace _05.Birthdayparty
{
    class Program
    {
        static void Main(string[] args)
        {
            double hallRent = double.Parse(Console.ReadLine());
            double cakePrice = 0.2* hallRent;
            double drinks = cakePrice*(1 - 0.45); 
            double animator = hallRent / 3;

            double totalSum = hallRent + cakePrice + drinks + animator;
            Console.WriteLine(totalSum);

        }
    }
}
