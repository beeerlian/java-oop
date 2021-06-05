class Weapon{
    private String name;
    private int attackPower;

    public Weapon(String name, int attackPower){
        this.setName(name);
        this.attackPower = attackPower;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int addAttackPower(){
        return this.attackPower;
    }
}
