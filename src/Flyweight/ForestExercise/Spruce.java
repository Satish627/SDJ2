package Flyweight.ForestExercise;

public class Spruce implements Tree{
    @Override
    public String getBarkColor() {
        return "Dark brown";
    }

    @Override
    public String getLeafColor() {
        return "Green";
    }

    @Override
    public boolean hasLeafs() {
        return false;
    }

    @Override
    public String[] commonlyFoundInAreas() {
        return new String[]{"Norway","Canada"};
    }
}
