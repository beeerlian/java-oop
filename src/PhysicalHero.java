public class PhysicalHero extends Player{

    public PhysicalHero(){
        this.setName("PhysicalHero");
        this.setLevel(1);
        this.setBaseHealth(100);
        this.setBaseAttack(10);
    }
    public PhysicalHero(String name){
        this.setName(name);
        this.setLevel(1);
        this.setBaseHealth(100);
        this.setBaseAttack(10);
    }

    @Override
    public int Attacking(Player targetPlayer){
        this.targetPlayer = targetPlayer;
        if(this.targetPlayer.checkAlive() == true){
            System.out.println(this.getName() + " Menyerang " + this.targetPlayer.getName() + " with " + this.powerAttack() + " physical damage" );
            this.targetPlayer.actualHealth = this.targetPlayer.maxHealth() - this.powerAttack();
            this.levelUp();
        }
        else
            System.out.println(this.targetPlayer.getName() + " has died");
        return this.targetPlayer.damage += this.powerAttack();
    }

}