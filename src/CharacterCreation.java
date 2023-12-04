public class CharacterCreation{
    //Info
    String name;
    int currentLevel;
    int xpGainLevel;
    int currentXP;
    int xpFromEnemy;
    public CharacterCreation(String name, int currentLevel){
        this.name = name;
        this.currentLevel = currentLevel;
        calcLevel();
    }
    void openCharacterWindow(){

    }
    void calcLevel(){
        maxSpirit = 2 * currentLevel;
        maxEnergy = 2 * currentLevel;
        maxHp = (5 * currentLevel) + 50;
        magAtk = currentLevel;
        magDef = currentLevel;
        physAtk = currentLevel;
        charSpeed = currentLevel;
        chakraPoints = currentLevel * 3;
        moralityPoints = currentLevel;
        xpGainLevel = currentLevel * 200;
        currentHP = maxHp;

    }
    void gainLevel(){
        currentLevel++;
        maxEnergy += 2;
        maxSpirit += 2;
        maxHp += 6;
        currentHP = maxHp;
        magAtk++;
        physAtk++;
        magDef++;
        physDef++;
        charSpeed++;
        chakraPoints += 3;
        moralityPoints++;
        xpGainLevel = currentLevel * 200;
        currentXP = 0;
    }
    int gainXp(int xpGained){
        this.currentXP += xpGained;
        int leftOverXP;
        int levelsGained = 0;
        while (currentXP > xpGainLevel){
            leftOverXP = currentXP - xpGainLevel;
            gainLevel();
            levelsGained++;
            currentXP = leftOverXP;
        }
        return levelsGained;
    }
    //allocation Points
    int chakraPoints;
    int moralityPoints;
    // Morality
    int goodMoral;
    int neutralMoral;
    int badMoral;
    //attributes
    int crownChakra;
    void calcCrown(){

    }
    int thirdEyeChakra;
    void calcThird(){

    }
    int throatChakra;
    void calcThroat(){

    }
    int heartChakra;
    void calcHeart(){

    }
    int solarPlexusChakra;
    void calcSolar(){

    }
    int sacralChakra;
    void calcSacral(){

    }
    int rootChakra;
    void calcRoot(){

    }
    //basic stats
    //refill bars
    int maxHp;
    int currentHP;
    void checkHP(){
        if (currentHP < 1){
            System.out.println("Character " + this.name + " has died.");
        }
    }
    int maxEnergy;
    int currentEnergy;
    int maxSpirit;
    int currentSpirit;
    //damage + modifiers
    int physAtk;
    int magAtk;
    float critChance = (float) .01;
    float critMult = (float) 1.5;
    //defence + modifiers
    int magDef;
    int physDef;
    float blockChance = (float) .01;
    float evasion = (float) .01;
    //resistances
    float holyDef = (float) .1;
    float darkDef = (float) .1;
    float fireDef = (float) .1;
    float airDef = (float) .1;
    float earthDef = (float) .1;
    float waterDef = (float) .1;
    float chaosDef = (float) .1;
    //speed and movement
    int charSpeed = 15;
    int movement = charSpeed/5;
    //basic actions
    void attack(int baseDmg , CharacterCreation name){
        System.out.println(name.name + " has taken " + baseDmg + " damage.");
        name.currentHP -= baseDmg;
        name.checkHP();
    }

}
