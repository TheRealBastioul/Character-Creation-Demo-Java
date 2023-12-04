import java.lang.Math;
public class RandomGenerators {
    static String[][] nameScheme = {{"Demonic", "Angelic", "Terror", "Cryptic", "Flame", "Man-Eater", "Ugly"}, {" Frog", " Lion", " Zombie", " Dragon", " Bear", " Imp", " Hacker"}};
    static int generateNameIndex(){
        return (int) (Math.random() * 7);
    }
    static int generateNumEnemies(){
        return (int) (Math.random() * 5);
    }
    static String getNameRandom(){
        return nameScheme[0][generateNameIndex()] + nameScheme[1][generateNameIndex()];
    }
    public RandomGenerators(){
    }
}

