using System;

namespace _12._1TradeCommissions
{
    class Program
    {
        static void Main(string[] args)
        {
            string city = Console.ReadLine();
            double sales = double.Parse(Console.ReadLine());
            double commissison = 0;

            switch (city)
            {
                case "Sofia":
                    if (sales >= 0 && sales <= 500)
                    {
                        commissison = sales * 0.05;
                    }
                    else if (sales > 500 && sales <= 1000)
                    {
                        commissison = sales * 0.07;
                    }
                    else if (sales > 1000 && sales <= 10000)
                    {
                        commissison = sales * 0.08;
                    }
                    else if(sales>10000)
                    {
                        commissison = sales * 0.12;
                    }
                    else
                    {
                        Console.WriteLine("error");
                    }
                    break;
                case "Varna":
                    if (sales >= 0 && sales <= 500)
                    {
                        commissison = sales * 0.045;
                    }
                    else if (sales > 500 && sales <= 1000)
                    {
                        commissison = sales * 0.075;
                    }
                    else if (sales > 1000 && sales <= 10000)
                    {
                        commissison = sales * 0.10;
                    }
                    else if(sales>10000)
                    {
                        commissison = sales * 0.13;
                    }
                    else
                    {
                        Console.WriteLine("error");
                    }
                    break;
                case "Plovdiv":
                    if (sales >= 0 && sales <= 500)
                    {
                        commissison = sales * 0.055;
                    }
                    else if (sales > 500 && sales <= 1000)
                    {
                        commissison = sales * 0.08;
                    }
                    else if (sales > 1000 && sales <= 10000)
                    {
                        commissison = sales * 0.12;
                    }
                    else if(sales>10000)
                    {
                        commissison = sales * 0.145;
                    }
                    else
                    {
                        Console.WriteLine("error");
                    }
                    break;
                default:
                    Console.WriteLine("error");
                    break;
            }
            if (commissison>0)
            {
                Console.WriteLine($"{commissison:F2}");
            }
            
        }
    }
}
