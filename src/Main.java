public class Main {
    public static void visoGod(int god)
    {
        if(((god%4==0)&&((god%100!=0))||(god%400==0))&&god>=1584)
        {
            System.out.println(god+" год - високосный");
        }
        else{
            System.out.println(god+" год - не високосный");
        }

    }
    public static void main(String[] args)

    {
        visoGod(1600);

    }
}