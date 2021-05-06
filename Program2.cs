using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static float input_len()
        {
            Console.WriteLine("enter the length ");
            float len = Convert.ToInt32(Console.ReadLine());
            return len;
        }
        static float input_wid()
        {
            Console.WriteLine("enter the width ");
            float wid = Convert.ToInt32(Console.ReadLine());
            return wid;
        }
        static float  cal(float len , float wid )
        {
            float area;
            area = len * wid;
            return area ;
        }
        static float calc(float len, float wid)
        {
            float peri;
            peri = (len + wid) * 2 ;
            return peri;
        }
       

        static void Main(string[] args)
        {
            float a = input_len();
            float b = input_wid();
            float c = cal(a , b);
            float d = calc(a , b);
            Console.WriteLine("your length is"+a);
            Console.WriteLine("your width is" + b);
            Console.WriteLine("your area is" + c);
            Console.WriteLine("your perimeter is" + d);
            


        }
    }
}
