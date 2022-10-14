using System;

namespace _08.OnTimeForTheExam
{
    class Program
    {
        static void Main(string[] args)
        {
            int hourOFExam = int.Parse(Console.ReadLine());
            int minutesOfExam = int.Parse(Console.ReadLine());
            int hourOfDeparture = int.Parse(Console.ReadLine());
            int minutesOfDeparture = int.Parse(Console.ReadLine());
            string time = "";

            int testTime = hourOFExam * 60 + minutesOfExam ;
            int departureTime = hourOfDeparture * 60 + minutesOfDeparture ;
            int difference = departureTime - testTime;
            int hours = Math.Abs((departureTime - testTime) / 60);
            int minutes = Math.Abs((departureTime - testTime) % 60);

            if (departureTime>testTime)
            {
                time = "late";
            }
            else if (departureTime==testTime||testTime>departureTime&&(testTime-departureTime)<=30)
            {
                time = "On time";
            }
            else if ((testTime-departureTime)>30)
            {
                time = "Early";
            }

            if (departureTime <= (testTime + 1) && departureTime < testTime) 
            {
                if (hours>=1)
                {
                    Console.WriteLine(time);
                    Console.WriteLine($"{hours}:{minutes:D2} hours before the start");
                }
                else if (hours == 0 && departureTime < testTime)
                {
                    Console.WriteLine(time);
                    Console.WriteLine($"{minutes} minutes before the start");
                }
            }else if (departureTime>=(testTime+1)&&departureTime>testTime)
            {
                if (hours>=1)
                {
                    Console.WriteLine(time);
                    Console.WriteLine($"{hours}:{minutes:D2} hours after the start");
                }
                else if (hours==0&&departureTime>testTime)
                {
                    Console.WriteLine(time);
                    Console.WriteLine($"{minutes} minutes after the start");
                }
            }
            else
            {
                Console.WriteLine("On Time");
            }
            

        }
    }
}
