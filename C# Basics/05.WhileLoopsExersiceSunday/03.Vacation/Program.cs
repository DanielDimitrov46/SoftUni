using System;

namespace _03.Vacation
{
    class Program
    {
        static void Main(string[] args)
        {
            double neededMoney = double.Parse(Console.ReadLine());
            double avaiableMoney = double.Parse(Console.ReadLine());
            int daysSpendCounter = 0;
            int daysCounter = 0;

            while (avaiableMoney<neededMoney)
            {
                daysCounter++;
                string action = Console.ReadLine();
                double amount = double.Parse(Console.ReadLine());
                if (action=="spend")
                {
                    daysSpendCounter++;
                    avaiableMoney -= amount;
                    if (avaiableMoney<0)
                    {
                        avaiableMoney = 0;
                    }
                }
                else if (action=="save")
                {
                    daysSpendCounter = 0;
                    avaiableMoney += amount;
                }
                if (daysSpendCounter == 5)
                {
                    Console.WriteLine($"You can't save the money.");
                    Console.WriteLine($"{daysCounter}");
                    break;
                }
                

            }
            if (avaiableMoney>=neededMoney)
            {
                Console.WriteLine($"You saved the money for {daysCounter} days.");
            }
        }
    }
}
