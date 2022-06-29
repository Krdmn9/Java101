public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    void hit(Fighter rival) {
        System.out.println(this.name + " "  + rival.name + "'e " +  this.damage + " kadar hasar vurdu.");
        if (rival.isDodge()) {
            System.out.println("FAKATTTT " + rival.name + " hasarı savurdu!");
        }
        else {
            rival.health = rival.health - this.damage;
        }
    }

    boolean isDodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
