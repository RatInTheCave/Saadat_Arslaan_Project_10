package Part2_Hobby_Collection;

public class Miniature_Class {


    public Miniature_Class() {
        color = "grey";
        name = "plastic soldier";
        amount = 0;
    }
    public Miniature_Class(String newName, String newColor, int newAmount) {
        color = newColor;
        name = newName;
        amount = newAmount;
    }
    public void PrintDescription() {
        System.out.print("I have " + amount + " " + color + " " + name + "s");
        System.out.println(" ");
    }

    private String color;
    private String name;
    private int amount;

    public String getColor() {
        return color;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    public void setName(String newName) {
        this.name = newName;
    }

}