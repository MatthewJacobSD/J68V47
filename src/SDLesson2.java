import java.util.*;
public class SDLesson2 {
    public static void main(String[] args) {
        //Exercise 1
        /*
        String name = "Sarah";
        System.out.println(name);
        String hobby = "geocaches,";
        System.out.println(hobby);
        System.out.println("Once upon a time in a quiet, picturesque town nestled in the mountains, lived a woman named " + name + ". "+name + " was an adventurer at heart, always seeking excitement in the great outdoors. One day, while browsing the internet for a new hobby, she stumbled upon geocaching.");
        System.out.println("Intrigued by the concept of modern-day treasure hunting, "+name+ " decided to give it a try. She purchased a GPS device and downloaded the geocaching app on her phone. The idea was simple: people hide containers, known as " +hobby+" in various locations around the world, and then share the GPS coordinates for others to find.");
        System.out.println(name+ "'s first geocaching adventure took her to a beautiful forested area just outside her town. Armed with her GPS device and a sense of excitement, she ventured deep into the woods. The coordinates led her to a large, moss-covered rock. After a bit of searching, she discovered a cleverly disguised container tucked away behind the rock.");
        System.out.println("Opening the container, she found a logbook and a collection of small trinkets. The geocaching etiquette dictated that she should sign the logbook and, if she wished, take an item from the cache as long as she left something of equal or greater value in return.");
        System.out.println(name + " signed her name in the logbook and decided to trade a small keychain she had brought with her for a shiny marble she found in the cache. She carefully resealed the container, hid it back in its original spot, and logged her find on the app.");
        System.out.println("As the months passed, geocaching became Sarah's favorite pastime. She discovered caches in the most unexpected places – under bridges, in city parks, and even on mountain peaks. Each find was like a mini-adventure, and she relished the thrill of the hunt and the sense of accomplishment that came with discovering hidden treasures.");
        System.out.println("But geocaching was more than just a hobby; it also introduced " +name+ " to a community of like-minded adventurers. She joined local geocaching events and met fellow treasure hunters who shared stories of their own discoveries. They became friends who shared their passion for the outdoors and their love for exploration.");
        System.out.println(name +"'s geocaching journey continued, taking her to new places and connecting her with people she would have never met otherwise. It was a hobby that not only satisfied her adventurous spirit but also enriched her life in unexpected ways, making her appreciate the beauty of both the world around her and the friendships she had formed along the way.");

        //Exercise 2
        int num1 = 9;
        int num2 = 2;
        int ans1 = num1 + num2;
        System.out.println(ans1);
        int ans2 = num1 - num2;
        System.out.println(ans2);
        int ans3 = num1 * num2;
        System.out.println(ans3);
        int ans4 = num1 / num2;
        System.out.println(ans4);
        int ans5 = num1 % num2;
        System.out.println(ans5);
        //int ans6 = Math.pow(9,2);*/

        //Exercise 3
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of item 1: ");
        String item1 = input.nextLine();

        System.out.print("Price of item 1 £");
        double price1 = input.nextDouble();

        System.out.print("Enter name of item 2: ");
        String item2 = input.nextLine();
        item2 = input.nextLine();

        System.out.print("Price of item 2 £");
        double price2 = input.nextDouble();

        System.out.print("Enter name of item 3: ");
        String item3 = input.nextLine();
        item3 = input.nextLine();

        System.out.print("Price of item 3 £");
        double price3 = input.nextDouble();

        System.out.format("%s.......... £%.2f %n", item1, price1);
        System.out.format("%s.......... £%.2f %n", item2, price2);
        System.out.format("%s.......... £%.2f %n", item3, price3);
        double totmoney = price1 + price2 + price3;
        System.out.println(totmoney);
    }
}