using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
            static void Main(string[] args)
            {
                Console.WriteLine("Введите неотформатированный код: ");
                string unformattedCode = Console.ReadLine() ;

                StringBuilder formattedCode = new StringBuilder();
                int indentLevel = 0;
                bool isInString = false;

                foreach (char c in unformattedCode)
                {
                    if (c == '"')
                    {
                        isInString = !isInString;
                    }

                    if (!isInString)
                    {
                        if (c == '{')
                        {
                            formattedCode.AppendLine("{");
                            indentLevel++;
                            formattedCode.Append(new string(' ', indentLevel * 4));
                        }
                        else if (c == '}')
                        {
                            indentLevel--;
                            formattedCode.AppendLine();
                            formattedCode.Append(new string(' ', indentLevel * 4));
                            formattedCode.Append("}");
                        }
                        else if (c == ';')
                        {
                            formattedCode.Append(";");
                            formattedCode.AppendLine();
                            formattedCode.Append(new string(' ', indentLevel * 4));
                        }
                        else
                        {
                            formattedCode.Append(c);
                        }
                    }
                    else
                    {
                        formattedCode.Append(c);
                    }
                }
                Console.WriteLine(formattedCode);
                Console.Read();
            }
        }
    }
