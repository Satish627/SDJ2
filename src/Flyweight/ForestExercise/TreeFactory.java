package Flyweight.ForestExercise;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String,Tree> trees = new HashMap<>();


    public static Tree getTree(String treeType){
                Tree tree= trees.get(treeType);
                if(tree== null){
                    switch (treeType){
                        case "oak":{
                            tree = new Oak();
                            break;
                        }
                        case "birch": {
                            tree= new Birch();
                            break;
                        }
                        case "spruce": {
                            tree= new Spruce();
                            break;
                        }
                    }
                    trees.put(treeType,tree);
                }
                return tree;
    }
}
