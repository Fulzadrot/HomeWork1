package HomeWork2.LessonOne;

public class Main {
    public static void main(String[] args) {
       Jumpable[] jumpables = {
         new Human("Jorge",150,10),
         new Cat("barsik",200,250),
         new Robot("Gleb", 500,500)
       };
       for ( Jumpable r : jumpables){
           r.jump(200);
       }
        Runnable[] runnables = {
                new Human("Hew",200,10),
                new Cat("Murzik",400,250),
                new Robot("Bob", 500,500)
        };
        for ( Runnable r : runnables){
            r.run(150);
        }
    }
}