using System;

namespace _06.AreaofFigures
{
    class Program
    {
        static void Main(string[] args)
        {
            string figureType = Console.ReadLine();


            if (figureType == "square")
            {
                double sideA = double.Parse(Console.ReadLine());
                double area = (sideA * sideA);
                Console.WriteLine("{0:F3}",area);

            }
            else if (figureType == "rectangle")
            {
                double sideA = double.Parse(Console.ReadLine());
                double sideB = double.Parse(Console.ReadLine());
                double area = sideA * sideB;
                Console.WriteLine("{0:F3}",area);
            }
            else if (figureType == "circle")
            {
                double radius = double.Parse(Console.ReadLine());
                double area = Math.PI * (radius * radius);
                Console.WriteLine("{0:F3}",area);
            }
            else if (figureType == "triangle")
            {
                double side = double.Parse(Console.ReadLine());
                double height = double.Parse(Console.ReadLine());
                double area = (side * height) / 2;
                Console.WriteLine("{0:F3}",area);
            }


        }
    }
}
