using System;

namespace exercise_5
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Въведете наема на залата: ");
            double hprice = double.Parse(Console.ReadLine());
            double a = hprice * 20 / 100;
            double b = 45 ;
            double drinks = a - b;
            
            Console.WriteLine(drinks);

        }
    }
}
