using System;

namespace _07.HousePainting
{
    class Program
    {
        static void Main(string[] args)
        {
            //vuveshdane
            double sideX = double.Parse(Console.ReadLine());
            double sideY = double.Parse(Console.ReadLine());
            double sideH = double.Parse(Console.ReadLine());

            //izchisleniq
            double walls = sideX * sideY;
            double window = 1.5 * 1.5;
            double allWalls = 2 * walls - 2 * window;
            double backWall = sideX * sideX;
            double entrance = 1.2 * 2;
            double totalBackAndFront = 2 * backWall - entrance;
            double totalAreaForGreen = allWalls + totalBackAndFront;
            double greenPaint = totalAreaForGreen / 3.4;

            //za pokriw
            double squaresOnRoof = 2 * (sideX * sideY);
            double triangles = 2 * (sideX * sideH / 2);
            double totalAreaForRoof = squaresOnRoof + triangles;
            double totalPaintForRoof = totalAreaForRoof / 4.3;

            Console.WriteLine($"{greenPaint:F2}");
            Console.WriteLine($"{totalPaintForRoof:F2}");

        }
    }
}
