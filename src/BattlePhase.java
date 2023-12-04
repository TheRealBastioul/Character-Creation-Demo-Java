public class BattlePhase {
    RandomGenerators randomGenerators;

    public BattlePhase() {
        randomGenerators = new RandomGenerators();
        generateBattle();
    }

    public static void generateBattle(){
        CharacterCreation enemy1 = new CharacterCreation(RandomGenerators.getNameRandom(), 4);
        CharacterCreation enemy2 = new CharacterCreation(RandomGenerators.getNameRandom(), 4);
        CharacterCreation enemy3 = new CharacterCreation(RandomGenerators.getNameRandom(), 4);
        CharacterCreation enemy4 = new CharacterCreation(RandomGenerators.getNameRandom(), 4);
    }
}
