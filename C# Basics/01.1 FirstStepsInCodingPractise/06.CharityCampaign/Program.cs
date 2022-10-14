using System;

namespace _06.CharityCampaign
{
    class Program
    {
        static void Main(string[] args)
        {
            int daysOfCompany = int.Parse(Console.ReadLine());
            int participants = int.Parse(Console.ReadLine());
            int cakes = int.Parse(Console.ReadLine());
            int waffles = int.Parse(Console.ReadLine());
            int pancakes = int.Parse(Console.ReadLine());

            //Ceni za produkti
            double cakePrice = cakes * 45;
            double wafflesPrice = waffles * 5.80;
            double pancakesPrice = pancakes * 3.20;

            //drugi izchisleniq
            double sumForDay = (cakePrice + wafflesPrice + pancakesPrice) * participants;
            double sumForAllCampaign = sumForDay * daysOfCompany;
            double sumAfterCampaign = sumForAllCampaign - sumForAllCampaign / 8;
            Console.WriteLine(sumAfterCampaign);

        }
    }
}
