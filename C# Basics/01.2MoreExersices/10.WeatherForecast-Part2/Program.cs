using System;

namespace _10.WeatherForecast_Part2
{
    class Program
    {
        static void Main(string[] args)
        {
            double temp = double.Parse(Console.ReadLine());

            if (temp>=5 && temp<11.9)
            {
                Console.WriteLine("Cold");
            }else if (temp>=12 && temp<=14.9)
            {
                Console.WriteLine("Cool");
            }else if (temp>=15.00 && temp<=20.00)
            {
                Console.WriteLine("Mild");
            }else if (temp>=20.1 && temp<=25.9) 
            {
                Console.WriteLine("Warm");
            }else if (temp>=26.00 && temp<=35.00)
            {
                Console.WriteLine("Hot");
            }
            else
            {
                Console.WriteLine("unknown");
            }

        }
    }
}
