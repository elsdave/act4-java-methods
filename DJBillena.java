import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;

class DJBillena{
    Calendar cal = new GregorianCalendar();
    private String name = "Dhominick John S. Billena";
    private int age = 19;
    private int motivation = 20;
    private int energy = 0;
    private int hunger = 80;
    private int thirst = 100;
    private int happiness = 20;
    private int health = 100;
    private int money = 800;
    private int social = 20;
    private int intelligence = 30;
    private int looks = 20;
    private int strength = 20;
    private int sleepiness = 0;
    private int stress = 50;
    private int time = java.util.TimeZone.getTimeZone("GMT+8").getRawOffset() / 3600000 + cal.get(Calendar.HOUR_OF_DAY); // Got from Java Documentation
    private String day = "Saturday";

    public static void showStatus(DJBillena stats){
        System.out.printf("=================================\n");
        System.out.println("| Name: " + stats.name);
        System.out.printf("=================================\n");
        System.out.println("| Age: " + stats.age);
        System.out.printf("=================================\n");
        System.out.printf("========== LIFE STATUS ==========\n");
        System.out.println("| Motivation: " + stats.motivation);
        System.out.println("| Energy: " + stats.energy);
        System.out.println("| Hunger: " + stats.hunger);
        System.out.println("| Thirst: " + stats.thirst);
        System.out.println("| Happiness: " + stats.happiness);
        System.out.println("| Health: " + stats.health);
        System.out.println("| Money: " + stats.money);
        System.out.println("| Social: " + stats.social);
        System.out.println("| Intelligence: " + stats.intelligence);
        System.out.println("| Looks: " + stats.looks);
        System.out.println("| Strength: " + stats.strength);
        System.out.println("| Sleepiness: " + stats.sleepiness);
        System.out.println("| Stress: " + stats.stress);
        System.out.println("| Time: " + stats.time);
        System.out.printf("=================================\n");
    }
    public static int wakingUp(DJBillena stats){
        System.out.printf(" %s woke up!\n", stats.name);
        System.out.printf("Today is %s!", stats.day);
        return stats.energy += 20;
    }
    public static void sleeping(DJBillena stats){
        stats.energy += 20;
        stats.hunger += 10;
        stats.thirst += 20;
        stats.happiness += 50;
        stats.health += 20;
        stats.social -= 10; // Because late, hehe.
        stats.intelligence += 10; // Good for the brain sleep
        stats.strength -= 50; // Natamad mag exercise
        stats.sleepiness -= 100;
        stats.stress += 50; // Of course, late na nga eh.
        stats.time -= 3; // Nothing done 
        System.out.printf("Today is %s! anyways so, it's fine.\n", stats.day);
    } 
    public static void panic(DJBillena stats){
        System.out.printf("Oh no! %s had something bad happened!\n", stats.name);
        stats.motivation -= 10;
        stats.energy -= 30;
        stats.happiness -= 20;
        stats.health -= 10;
    }
    public static void breakfast(DJBillena stats){
        System.out.printf(" %s ate breakfast together with family!\n", stats.name);
        stats.hunger -= 40;
        stats.thirst -= 40;
        stats.happiness += 10;
        stats.health += 10;
        stats.money -= 50;
        System.out.printf("Yummy!\n");
        System.out.printf("%s cleaned the table and dishes.\n", stats.name);
        stats.social += 10;
    }
    public static void exercise(DJBillena stats){
        System.out.printf(" %s exercised!\n", stats.name);
        stats.energy -= 20;
        stats.hunger += 30;
        stats.thirst += 20;
        stats.happiness += 10;
        stats.health += 20;
        stats.looks += 10;
        stats.strength += 20;
        stats.sleepiness += 10;
        stats.stress -= 20;
    }
    public static void bikingLongDistance(DJBillena stats, int choice){
        System.out.printf(" %s biked long distance!\n", stats.name);
        stats.energy -= 20;
        stats.hunger += 30;
        stats.thirst += 20;
        stats.happiness += 10;
        stats.health += 20;
        stats.looks += 10;
        stats.strength += 20;
        stats.sleepiness += 10;
        stats.stress -= 20;
    }
    public static void checkingTime(DJBillena stats, int choice){
        if(stats.time >= 8){
            panic(stats);
            System.out.printf("Oh no! %s is late for school!\n", stats.name);
            System.out.printf(" %s is running to school!\n", stats.name);
            System.out.printf(" %s arrived at school!\n", stats.name);
            System.out.printf(" %s thought that it was just a dream.\n", stats.name);
            stats.energy += 20;
        }
        else if(choice == 0){
            sleeping(stats);
            System.out.printf(" %s is sleeping again!\n", stats.name);
        }
        else{
            breakfast(stats);
        }
    }
    public static void sideactivities(DJBillena stats, int indecisive_choice, Random random){
        if (indecisive_choice == random.nextInt(7)){
                    // Creating two different random numbers to test if I will do that thing waste of memory but it's fun.
                    bikingLongDistance(stats, indecisive_choice);
                }
                else if(indecisive_choice <= 3){
                    // Maybe I'll just code this instead or work on a server problem or check for something interesting to do in the mean time.
                    System.out.printf(" %s decided to do something else!\n", stats.name);
                    switch (indecisive_choice){

                    case 0:
                        System.out.printf(" %s decided to play games!\n", stats.name);
                        stats.motivation -= 10;
                        stats.energy -= 20;
                        stats.hunger += 10;
                        stats.thirst += 10;
                        stats.happiness += 20;
                        stats.health -= 10;
                        stats.money -= 10;
                        stats.social += 10;
                        stats.intelligence -= 10;
                        stats.looks -= 10;
                        stats.strength -= 10;
                        stats.sleepiness += 10;
                        stats.stress += 10;
                    case 1:
                        System.out.printf(" %s decided to watch anime!\n", stats.name);
                        stats.motivation -= 10;
                        stats.energy -= 20;
                        stats.hunger += 10;
                        stats.thirst += 10;
                        stats.happiness += 20;
                        stats.health -= 10;
                        stats.social -= 40;
                        stats.intelligence += 10;
                        stats.looks -= 10;
                        stats.strength -= 10;
                        stats.sleepiness += 10;
                        stats.stress += 10; // From overthinking about the deadlines
                    case 2:
                        System.out.printf(" %s decided to watch youtube!\n", stats.name);
                        stats.motivation -= 10;
                        stats.energy -= 20;
                        stats.hunger += 10;
                        stats.thirst += 10;
                        stats.happiness += 20;
                        stats.health -= 30;
                        stats.social += 10;
                        stats.intelligence -= 10;
                        stats.looks -= 10;
                        stats.strength -= 10;
                        stats.sleepiness += 10;
                        stats.stress += 10;
                        stats.time += 1;

                    case 3:
                        System.out.printf(" %s decided to read a book!\n", stats.name);
                        stats.motivation += 10;
                        stats.energy -= 20;
                        stats.hunger += 10;
                        stats.thirst += 10;
                        stats.happiness += 20;
                        stats.health += 10;
                        stats.intelligence += 30;
                    default:
                        System.out.printf(" %s decided to do nothing and sleep!\n", stats.name);
                    }
                }
                else if(indecisive_choice >= 4){
                    //  user decided to do nothing and sleep like every weekend.
                    System.out.printf(" %s decided to do nothing and sleep!\n", stats.name);
                    sleeping(stats);
                }
    }

    public static void resetPlayerStats(DJBillena stats){
        stats.motivation = 20;
        stats.energy = 0;
        stats.hunger = 80;
        stats.thirst = 100;
        stats.happiness = 20;
        stats.health = 100;
        stats.money = 800;
        stats.social = 20;
        stats.intelligence = 30;
        stats.looks = 20;
        stats.strength = 20;
        stats.sleepiness = 0;
        stats.stress = 50;
        stats.time = java.util.TimeZone.getTimeZone("GMT+8").getRawOffset() / 3600000 + stats.cal.get(Calendar.HOUR_OF_DAY); // Got from Java Documentation and StackOverflow https://docs.oracle.com/javase/8/docs/api/java/util/TimeZone.html
        stats.day = "Saturday";
    }

    public static void main(String[] args){
        DJBillena player = new DJBillena();
        Random random = new Random();
        int choice = random.nextInt(2);
        int indecisive_choice = random.nextInt(7); // I'm always indecisive so I made this
        Scanner input = new Scanner(System.in);
        int menu_choices = 0;
       
    while(player.health >= 1 && menu_choices != 4){
        System.out.printf("=================================\n");
        System.out.printf("|What will %s do?\n", player.name);
        System.out.printf("|1. Check Status\n");
        System.out.printf("|2. Start Life Simulation\n");
        System.out.printf("|3. Reset Stats and Simulation\n");
        System.out.printf("|4. Exit\n");
        System.out.printf("=================================\n");
        System.out.printf("|Enter your choice: ");
        menu_choices = input.nextInt();
        System.out.printf("=================================\n");
       switch(menu_choices){
            case 1:
                showStatus(player);
                break;
            case 2:
                System.out.printf("=================================\n");
                if(choice == 0){
                    //  user decided to wake up
                    System.out.printf("Wild %s decided to wake up!\n", player.name);
                    wakingUp(player);
                    checkingTime(player, choice);
                    breakfast(player);
                    exercise(player);
                    sideactivities(player, indecisive_choice, random);
                    sleeping(player);
                    System.out.printf("Good night! %s. Sweet Dreams!\n", player.name);
                }
                else if(choice == 1){
                    //  user decided to sleep
                    System.out.printf(" Lazy %s decided to sleep!\n", player.name);
                    sleeping(player);
                    checkingTime(player, menu_choices);
                }
                else{
                    //  user decided to panic cause bad dream
                    System.out.printf(" %s decided to panic!\n", player.name);
                    panic(player);
                }
                break;
            case 3:
                System.out.printf("=================================\n");
                System.out.printf("Resetting %s Stats!\n", player.name);
                resetPlayerStats(player);
                System.out.printf("=================================\n");
                break;
            case 4:
                System.out.printf("=================================\n");
                System.out.printf("Exiting!\n");
                input.close();
                System.out.printf("=================================\n");
            break;
        }
        }
    }
}