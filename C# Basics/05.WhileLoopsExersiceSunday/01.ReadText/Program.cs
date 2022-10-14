using System;

namespace _01.ReadText
{
    class Program
    {
        static void Main(string[] args)
        {
            string favouriteBook = Console.ReadLine();
            string book = Console.ReadLine();
            int counter = 0;
            bool bookFlag = false;

            while (book!="No More Books")
            {
                
                if (favouriteBook==book)
                {
                    bookFlag = true;
                    break;
                }
                counter++;
                book = Console.ReadLine();
            }
            if (bookFlag)
            {
                Console.WriteLine($"You checked {counter} books and found it.");
            }
            else
            {
                Console.WriteLine($"The book you search is not here!");
                Console.WriteLine($"You checked {counter} books.");
            }

        }
    }
}
