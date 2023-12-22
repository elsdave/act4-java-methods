import java.util.Scanner;

public class EDConstantino {
    Scanner myscanner;
    String name;
    int choice;

    public static void main(String[] args) {
        EDConstantino routine;
        routine = new EDConstantino();
        routine.userSetUp();
        routine.AM();
    }

    public void userSetUp() {
        System.out.println("\n---------------------------------\n");
        System.out.println("Hey there! Welcome to my daily routine program.");
        System.out.println("Join me as I try get my life together by following my ideal daily routine!");
        System.out.println("What is your name?");
        myscanner = new Scanner(System.in);
        name = myscanner.nextLine();
        System.out.println("Hi, " + name + ".");

    }

    public void AM() {
        System.out.println("\n---------------------------------\n");
        System.out.println("I usually start my day at 6 am. It has become quite normal for me to wake up at this time nowadays.");
        System.out.println("So, what do you want to do first?\n");
        System.out.println("1: Get some coffee");
        System.out.println("2: Take a bath");
        System.out.println("3: Eat breakfast");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();

        if (choice == 1) {
            System.out.println("Great! Having a cup of coffee is surely a great way to start the day.");
            Coffee1();
        }
        if (choice == 2) {
            System.out.println("A day that starts with a fresh body and mind sure is awesome!");
            Bath1();
        }
        if (choice == 3) {
            System.out.println("Nothing's better than filling up the belly first thing in the morning.");
            Eat1();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }

    }
    public void Coffee1() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Take a bath");
        System.out.println("2: Eat breakfast");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            System.out.println("Energized and fresh!");
            Bath21();
        }
        if (choice == 2) {
            System.out.println("Now we're energized and ready for the day!");
            Eat21();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Bath1() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Drink coffee");
        System.out.println("2: Eat breakfast");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            System.out.println("Energized and fresh!");
            Coffee21();
        }
        if (choice == 2) {
            System.out.println("Now we're energized and ready for the day!");
            Eat22();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Eat1() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Drink coffee");
        System.out.println("2: Take a bath");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            System.out.println("Now we're energized and ready for the day!");
            Coffee22();
        }
        if (choice == 2) {
            System.out.println("Fresh body and a full tummy!");
            Bath22();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Bath21() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Eat breakfast");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            AMEnd();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Coffee21() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Eat breakfast");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            AMEnd();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Coffee22() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Take a bath");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            AMEnd();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Bath22() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Drink coffee");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            AMEnd();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Eat22() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Drink coffee");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            AMEnd();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Eat21() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Take a bath");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            AMEnd();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void AMEnd() {
        System.out.println("\n---------------------------------\n");
        System.out.println("We're all good for our morning routine/tasks!");
        System.out.println("Let's take a quick nap and have some lunch.");
            PM();
        }
    public void PM() {
        System.out.println("\n*time skip sound effects*");
        System.out.println("\n---------------------------------\n");
        System.out.println("Time flies so fast, it's already afternoon.\n");
        System.out.println("Let's do some more tasks for the day.");
        System.out.println("1: Do school works/study");
        System.out.println("2: Go to the gym");
        System.out.println("3: Finish part-time work tasks");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            System.out.println("Good job! Doing school works and studying first before other things really shows that you care for your acads.");
            Study1();
        }
        if (choice == 2) {
            System.out.println("Let's get that pump before we dive in to other tasks for the day!");
            Gym1();
        }
        if (choice == 3) {
            System.out.println("Alexa play Work by Rihanna ft. Drake- because we're gonna work for that bread. (or crumbs lang kay gamay sweldo hehe)");
            Work1();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Study1() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Go to the gym");
        System.out.println("2: Finish part-time work tasks");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            System.out.println("Doing some physical work before doing the next task? I'm in!");
            Gym21();
        }
        if (choice == 2) {
            System.out.println("Now we're finally done with all the mentally taxing work. Nice job!");
           Work21();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Gym1() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Do school works/study");
        System.out.println("2: Finish part-time work tasks");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            System.out.println("Good job finishing that assignment/studying that lecture!");
            Study21();
        }
        if (choice == 2) {
            System.out.println("I feel so much like an adult with having to go the gym and working on my daily task. lol");
            Work22();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Work1() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Do school works/study");
        System.out.println("2: Go to the gym");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            System.out.println("Now we're finally done with all the mentally taxing work. Nice job!");
            Study22();
        }
        if (choice == 2) {
            System.out.println("I feel so much like an adult with having to go the gym and working on my daily task. lol");
            Gym22();
        }
        else {
            System.out.println("C'mon continue the day with mee");
        }
    }
    public void Gym21() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Finish part-time work tasks");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
        PMEnd();
        }
        else {
            System.out.println("We're almost there, let's end the day strong");
        }
    }
    public void Study21() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Finish part-time work tasks");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            PMEnd();
        }
        else {
            System.out.println("We're almost there, let's end the day strong");
        }
    }
    public void Work21() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Go to the gym");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            PMEnd();
        }
        else {
            System.out.println("We're almost there, let's end the day strong");
        }
    }
    public void Work22() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Do school works/study");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            PMEnd();
        }
        else {
            System.out.println("We're almost there, let's end the day strong");
        }
    }
    public void Study22() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Go to the gym");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            PMEnd();
        }
        else {
            System.out.println("We're almost there, let's end the day strong");
        }
    }
    public void Gym22() {
        System.out.println("\n---------------------------------\n");
        System.out.println("What do you want to do next?\n");
        System.out.println("1: Do school works/study");

        myscanner = new Scanner(System.in);
        choice = myscanner.nextInt();
        if (choice == 1) {
            PMEnd();
        }
        else {
            System.out.println("We're almost there, let's end the day strong");
        }
    }
    public void PMEnd() {
        System.out.println("\n---------------------------------\n");
        System.out.println("We've finished all our daily tasks for the day!");
        System.out.println("Great job!");
        System.out.println("Thanks for taking the time to join me today.");
        System.out.println("Until next time!");
        System.out.println("\n---------------------------------\n");
    }
}