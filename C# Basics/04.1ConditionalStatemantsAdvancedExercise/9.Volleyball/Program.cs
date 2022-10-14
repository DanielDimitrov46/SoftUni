using System;

namespace _9.Volleyball
{
    class Program
    {
        static void Main(string[] args)
        {
            string typeOFTheYear = Console.ReadLine();
            double numberOfHolidays = double.Parse(Console.ReadLine());
            double numberOfWeekendsTravel = double.Parse(Console.ReadLine());


            double timeOfWeekendsInSofia = 48 - numberOfWeekendsTravel;
            double timeOfSaturdayGames = timeOfWeekendsInSofia * 3 / 4;
            double timeOfGamesInHisTown = numberOfWeekendsTravel;

            double gamesOnLeapYear = 0;
            //Holidays games
            double gamesOnHoliday = numberOfHolidays * 2 / 3;
            double totalGames = timeOfSaturdayGames + timeOfGamesInHisTown + gamesOnHoliday;
            if (typeOFTheYear == "leap")
            {
                gamesOnLeapYear = totalGames * 0.15;
            }
            double allGamesFromYear = totalGames + gamesOnLeapYear;
            Console.WriteLine(Math.Floor(allGamesFromYear));




        }
    }
}
