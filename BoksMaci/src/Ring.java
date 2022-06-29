import java.util.*;


public class Ring {
    Fighter firstFighter;
    Fighter secondFighter;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.firstFighter = f1;
        this.secondFighter = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    public void selectFighter() {
        Random rand = new Random();
        Fighter tempFighter;
        int ranNumber = rand.nextInt(2);
        if (ranNumber == 1) {
            tempFighter = this.secondFighter;
            this.secondFighter = this.firstFighter;
            this.firstFighter = tempFighter;
        }
    }
    public void run() {
        if (checkWeight()) {
            selectFighter();
            System.out.println(firstFighter.name + " dövüşe başlayacak !");
            while (firstFighter.health > 0 && secondFighter.health > 0) {
                printScore();
                firstFighter.hit(secondFighter);
                secondFighter.hit(firstFighter);
                if (isOver(firstFighter,secondFighter)) {
                    System.out.println("##############");
                    System.out.println(firstFighter.health > 0 ? firstFighter.name + " Maçı kazandı" : secondFighter.name + " Maçı Kazandı");
                    System.out.println("##############");
                }
            }
        }
        else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean isOver(Fighter f1, Fighter f2) {
        return f1.health <= 0 || f2.health<=0;
    }

    public boolean checkWeight() {
        return (firstFighter.weight >= minWeight && firstFighter.weight <= maxWeight) && (secondFighter.weight >= minWeight && secondFighter.weight <= maxWeight);
    }



    public void printScore() {
        System.out.println("------------");
        System.out.println(firstFighter.name + " Kalan Can \t:" + firstFighter.health);
        System.out.println(secondFighter.name + " Kalan Can \t:" + secondFighter.health);
        System.out.println("------------");
    }
}
