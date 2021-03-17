package Flyweight.ForestExercise;

public class Oak implements Tree{
    @Override
    public String getBarkColor() {
        return "Brown";
    }

    @Override
    public String getLeafColor() {
        return "Light green";
    }

    @Override
    public boolean hasLeafs() {
        return true;
    }

    @Override
    public String[] commonlyFoundInAreas() {
        return new String[]{"Europe","North America","Asia"};
    }
}
