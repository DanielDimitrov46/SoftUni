using System;

namespace _09._Yard_Greening
{
    class Program
    {
        static void Main(string[] args)
        {
            double yardSqMeter = double.Parse(Console.ReadLine());

            //ceni
            double pricePerSqMeter = 7.61;
            double discount = 0.18;

            //izchisleniq
            double totalYardPrice = yardSqMeter * pricePerSqMeter;
            double totalDiscount = totalYardPrice * discount;
            double totalPrice = totalYardPrice - totalDiscount;

            //izhod
            Console.WriteLine($"The final price is: {totalPrice} lv.");
            Console.WriteLine($"The discount is: {totalDiscount}");
        }
    }
}
