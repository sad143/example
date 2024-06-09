import java.io.*;
import java.util.Scanner;

public class Open 
{
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Reader reader = new Reader();
        reader.hasNext();
        reader.read();
        Writer writer = new Writer(reader.FileName);
        writer.write();
        reader.read();
    }
}
class Reader implements IReader
{
    Scanner in = new Scanner(System.in);
    String FileName;
    public void hasNext()
    {
        System.out.println("Введите наименование файла:");
        FileName = in.nextLine();
    }
    public void read()
    {
        System.out.println("Содержание файла:");
            try(FileReader reader = new FileReader(FileName))
            {
                int c;
                while((c=reader.read())!=-1)
                {
                    System.out.print((char)c);
                }
                System.out.println("\n");
            }
            catch(IOException ex)
            {
                System.out.println(ex.getMessage());
            }   
    } 
}
class Writer implements IWriter
{
    Scanner in = new Scanner(System.in);
    Scanner in1 = new Scanner(System.in);
    String FileName;
    Writer(String FileName)
    {
        this.FileName = FileName;
    }
    public void write()
    {
        System.out.println("Выполнить перезапись файла?");
        int rez = in.nextInt();
        String text;
        System.out.println("Введите данные");
        text = in1.nextLine();
        if (rez == 0)
        {
            try(FileWriter writer = new FileWriter(FileName, true))
            {
                writer.append("\n");
                writer.append(text);
                writer.flush();
            }
        catch(IOException ex)
            {
                System.out.println(ex.getMessage());
            } 
        }
        if (rez == 1)
        {
            try(FileWriter writer = new FileWriter(FileName, false))
            {
                writer.append("\n");
                writer.append(text);
                writer.flush();
            }
        catch(IOException ex)
            {
                System.out.println(ex.getMessage());
            } 
        }
    }
}

