

class Player{
    private String name;
    private int level;
    private int baseHealth;
    private int baseAttack;
    private String tipe;
    protected int actualHealth;
    protected int damage = 0;
    private boolean Alive = true;
    // class member
    Armor armor;
    Weapon weapon;
    Player targetPlayer;

    public String getTipe(){
        this.tipe = "Umum";
        return this.tipe;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setBaseHealth(int baseHealth){
        this.baseHealth = baseHealth;
    }
    public void setBaseAttack(int baseAttack){
        this.baseAttack = baseAttack;
    }
    public boolean checkAlive(){
        if(this.getActualHealth() <= 0)
            this.Alive = false;
        return this.Alive;
    }
    public int getActualHealth() {
        actualHealth = maxHealth()-totalDamage();
        if(actualHealth <= 0)
            actualHealth = 0;    
        return actualHealth;
    }
    public void setActualHealth(int actualhealth){
        this.actualHealth = actualhealth;
    }
    public String getName(){
        return this.name;
    }
    public void setArmor(Armor armor){
        this.armor = armor;
        System.out.println(this.getName()+" wearing " + armor.getName());
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
        System.out.println(this.getName()+" taking " + weapon.getName());
    }
    public int maxHealth(){
        int checking = (armor!=null)?this.armor.addDefencePower() : 0;
        if(this.level > 1)
            return this.baseHealth + checking + this.level*3;
        else
            return this.baseHealth + checking;
    }
    public int powerAttack(){
        int checking = (weapon!=null)?this.weapon.addAttackPower():0;
        if(this.level > 1 )
            return this.baseAttack + checking + this.level*2;
        else
            return this.baseAttack + checking;
    }
    public int totalDamage(){
        return this.damage;
    }
    public int Attacking(Player targetPlayer){
        this.targetPlayer = targetPlayer;
        if(this.targetPlayer.checkAlive() == true){
            System.out.println(this.getName() + " Menyerang " + this.targetPlayer.getName() + " with " + this.powerAttack() + " damage" );
            this.targetPlayer.actualHealth = this.targetPlayer.maxHealth() - this.powerAttack();
            this.levelUp();
        }
        else
            System.out.println(this.targetPlayer.getName() + " has died");
        return this.targetPlayer.damage += this.powerAttack();
    }
    public int getLevel() {
        return level;
    }
    public void levelUp(){
        this.level++;
    }
    public void display(){
        System.out.println("\nName\t: " + getName());
        System.out.println("Level\t: " + getLevel());
        System.out.println("Attack\t: " + powerAttack());
        String weapCheck = (weapon!=null)?this.weapon.getName():"None";
        System.out.println("Weapon\t: " + weapCheck);
        String armCheck = (armor!=null)?this.armor.getName():"None";
        System.out.println("Armor\t: " + armCheck);    
        System.out.println("Health\t: " + getActualHealth() + "/" + maxHealth());

    }
}
