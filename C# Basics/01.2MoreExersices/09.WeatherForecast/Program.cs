﻿using System;

namespace _09.WeatherForecast
{
    class Program
    {
        static void Main(string[] args)
        {
            string weather = Console.ReadLine();
            string sunny = "sunny";
            if (weather==sunny)
            {
                Console.WriteLine("It's warm outside!");
            }
            else
            {
                Console.WriteLine("It's cold outside!");
            }
        }
    }
}
