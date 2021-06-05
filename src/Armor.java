class Armor{
    private String name;
    private int defencePower;

    public Armor(String name, int defencePower){
        this.setName(name);
        this.defencePower = defencePower;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int addDefencePower(){
        return this.defencePower;
    }
}
