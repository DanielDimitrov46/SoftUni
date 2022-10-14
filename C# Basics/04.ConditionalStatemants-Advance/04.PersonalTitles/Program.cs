using System;

namespace _04.PersonalTitles
{
    class Program
    {
        static void Main(string[] args)
        {
            double age = double.Parse(Console.ReadLine());
            string gender = Console.ReadLine();

            if (gender == "m")
            {
                if (age >= 16)
                {
                    Console.WriteLine("Mr.");
                }
                else
                {
                    Console.WriteLine("Master");
                }
            }
            else
            {
                if (age >= 16)
                {
                    Console.WriteLine("Ms.");
                }
                else
                {
                    Console.WriteLine("Miss");
                }
            }





            //double age = double.Parse(Console.ReadLine());
            //string gender = Console.ReadLine();
            //if (gender != "m" && gender != "f")
            //{
            //    Console.WriteLine("Invalid input");
            //}
            //if (gender == "m" || gender == "f")
            //{

            //}
            //else
            //{
            //    Console.WriteLine("Invalid input");
            //}


            //if (gender == "f")
            //{
            //    if (age >= 16)
            //    {
            //        Console.WriteLine("Ms.");
            //    }
            //    else
            //    {
            //        Console.WriteLine("Miss");
            //    }


            //}
            //else
            //{
            //    if (age >= 16)
            //    {
            //        Console.WriteLine("Mr.");
            //    }
            //    else
            //    {
            //        Console.WriteLine("Master");
            //    }

            //}
        }
    }
}
