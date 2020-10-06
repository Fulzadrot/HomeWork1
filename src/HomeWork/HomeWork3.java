package HomeWork;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        GameTheGuess();
        }
        public static void GameTheGuess(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Добро пожаловать в игру 'Угадай число'");
            int maxRange = 9;
            int count = 3;
            int number = (int) (Math.random() * maxRange);
            while (count != 0){
                System.out.println("Угадайте число от 0 до " + maxRange + " У вас " + count + " Попытки");
                int userNumber = scanner.nextInt();
                if (userNumber == number){
                    System.out.println("Вы угадали! Если хотите продолжить введите '1'");
                    int a = scanner.nextInt();
                if(a == 1){
                    GameTheGuess();
                } else {
                    break;
                }
                } else if ( userNumber > number){
                    System.out.println("Вы не угадали! Ваше число больше загаданного");
                    count--;
                } else {
                    System.out.println("Вы не угадали! Ваше число меньше загаданного");
                    count--;
                }
                if (count == 0){
                    System.out.println("Вы использовали все попытки! Если хотите начать заново введите '1', если хотите выйти введите '0'");
                    int a = scanner.nextInt();
                    if(a == 1){
                        GameTheGuess();
                    } else {
                        break;
                    }
                }
            }
        }
    }
