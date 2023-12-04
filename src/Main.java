import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CharacterCreation Bast = new CharacterCreation(RandomGenerators.getNameRandom(),100);
        Bast.gainXp(333);
        CharacterWindow opened = new CharacterWindow(Bast);




    }
}