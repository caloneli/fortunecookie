import java.util.Random;

public class FortuneCookie{
    public static void main(String[] args) {
        


        String[] fortunes = {"Today it's up to you to create the peacefulness you long for.","A friend asks only for your time not your money.","Enjoy the good luck a companion brings you.","Change can hurt, but it leads a path to something better.","Hard work pays off in the future, laziness pays off now."};
        Random indeks = new Random();
        System.out.println(fortunes[indeks.nextInt(fortunes.length)]);


    }
}