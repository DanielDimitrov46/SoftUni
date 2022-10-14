using System;

namespace _03.NewHouse
{
    class Program
    {
        static void Main(string[] args)
        {
            //            цвете Роза    Далия Лале    Нарцис Гладиола
            //Цена на брой в лева 5   3.80    2.80    3   2.50

            string flower = Console.ReadLine();
            int numFlowers = int.Parse(Console.ReadLine());
            int budget = int.Parse(Console.ReadLine());

            double pricePerFlower = 0;
            double discount = 0;

            switch (flower)
            {
                case "Roses":
                    pricePerFlower = 5;
                    if (numFlowers>80)
                    {
                        discount = 0.90;
                    }
                    break;
                case "Dahlias":
                    pricePerFlower = 3.80;
                    if (numFlowers>90)
                    {
                        discount=0.85;
                    }
                    break;
                case "Tulips":
                    pricePerFlower = 2.80;
                    if (numFlowers>80)
                    {
                        discount = 0.85;
                    }
                    break;
                case "Narcissus":
                    pricePerFlower = 3;
                    if (numFlowers<120)
                    {
                        discount = 1.15;
                    }
                    break;
                case "Gladiolus":
                    pricePerFlower = 2.50;
                    if (numFlowers<80)
                    {
                        discount = 1.20;
                    }
                    break;

            }
            
            double totalPrice = pricePerFlower * numFlowers;

            if (discount>0)
            {
                totalPrice = totalPrice * discount;
            }
            

            if (totalPrice>budget)
            {
                Console.WriteLine($"Not enough money, you need {totalPrice-budget:f2} leva more.");
            }
            else
            {
                Console.WriteLine($"Hey, you have a great garden with {numFlowers} {flower} and {(budget-totalPrice):f2} leva left.");
            }
        }
    }
}
