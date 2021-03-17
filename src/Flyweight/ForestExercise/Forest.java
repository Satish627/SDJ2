package Flyweight.ForestExercise;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    List<Tree> trees;

    public Forest (int numOfOak,int numOfBirch,int numOfSpruce){
        trees= new ArrayList<>();
        for (int i=0;i<numOfOak; i ++){
            Tree oakTree = TreeFactory.getTree("Oak");
            trees.add(oakTree);
        }
        for (int i=0;i<numOfBirch;i++){
            Tree birchTree = TreeFactory.getTree("birch");
            trees.add(birchTree);
        }
        for (int i=0;i<numOfSpruce;i++){
            Tree spruceTree= TreeFactory.getTree("spruce");
            trees.add(spruceTree);
        }
        Tree o1= TreeFactory.getTree("spruce");
        Tree o2= TreeFactory.getTree("oak");
        System.out.println(o1==o2);//compare memory location
        System.out.println(o1.equals(o2));
    }
    public static void main(String[] args){
        new Forest(5,8,9);
    }
}
