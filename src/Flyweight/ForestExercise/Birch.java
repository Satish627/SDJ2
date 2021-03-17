package Flyweight.ForestExercise;

public class Birch implements  Tree{
    @Override
    public String getBarkColor() {
        return "White";
    }

    @Override
    public String getLeafColor() {
        return "Yellow";
    }

    @Override
    public boolean hasLeafs() {
        return true;
    }

    @Override
    public String[] commonlyFoundInAreas() {
        return new String[]{"North America","Eurasian"};
    }
}
