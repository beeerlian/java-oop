public class Main {
    public static void main(String[] args) {
        
        MagicalHero player1 = new MagicalHero("Eudora");
        player1.display();
        Armor armor1 = new Armor("Vest", 50);
        Weapon weapon1 = new Weapon("Katana", 10);
        
        
        PhysicalHero player2 = new PhysicalHero("Alucard");
        player2.display();
        Armor armor2 = new Armor ("Zirah", 80);
        Weapon weapon2 = new Weapon("Sabit", 8);
        
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        for(int i = 0; i<8; i++){
            player2.Attacking(player1);
        }

        player1.display();
        player2.display();
        
    }
}
