import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.util.SimpleTimeZone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерности чисел");
        int temp = in.nextInt();
        System.out.println("Включить повторяющиеся числа? (true/false)");
        boolean flag = in.nextBoolean();
        if(temp>9 && !flag)
        { System.out.println("Размерность не может быть больше 10");}
        else {
            Scanner in1 = new Scanner(System.in);
            Game g = new Game(temp, flag);
            Bot bot = new Bot(g);
            bot.generate();
            System.out.println(bot.getChislo());
            System.out.println("Введите число");
            String vvod = in1.nextLine();
            while (!bot.playwithme(vvod).equals("win"))
            {
                Scanner in3 = new Scanner(System.in);
                System.out.println(bot.playwithme(vvod));
                vvod= in3.nextLine();
            }
            System.out.println("Ты победил!");
        }
    }
    public static class Game
    {
        public int razmernost;
        public boolean povtor;
        public Game(int razm,boolean pov)
        {
        this.razmernost=razm;
        this.povtor=pov;
        }
    }
    public static class Bot
    {
        Random r = new Random();
        public Game game;
        public String chislo;
        public void generate ()
        {
            int [] temp = new int [game.razmernost];
            if(game.povtor)
            {
            for(int i =0;i<game.razmernost;i++)
            {
                temp[i]= r.nextInt(10);
            }
            }
            else {
                int i=0;
                while(i!= game.razmernost)
                {
                    int rand = r.nextInt(10);
                    boolean flag =false;
                    for(int j =0;j< game.razmernost;j++)
                    {
                        if (rand == temp[j]) {
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){temp[i]=rand;i++;}
                }
            }
            String ch="";
            for (int j : temp) {
                String chsl = String.valueOf(j);
                ch = ch.concat(chsl);
            }
            chislo=ch;
        }
        public String playwithme(String console)
        {
            int c=0;
            int b=0;
            if(console.length()== game.razmernost) {
                char[] vvod = console.toCharArray();
                char[] tmpch = chislo.toCharArray();
                for (int i = 0; i < vvod.length; i++) {
                    for (int j = 0; j < vvod.length; j++) {

                        if (vvod[i] == tmpch[i]) {
                            b++;
                            break;
                        } else
                        if(vvod[j]==tmpch[i]){
                            c++;
                            break;
                        }
                    }
                }
                if (b == game.razmernost) return "win";

                else return "быков:" + b + "\nкоров:" + c;
            }
            else return "Ошибка";
        }

        public String getChislo() {
            return chislo;
        }

        public Bot(Game game1) {
            this.game =game1;
        }
    }
}