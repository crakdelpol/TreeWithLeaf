package it.matteopipitone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tree {

    private final String type;
    private final List<Tree> children = new ArrayList<>();

    public Tree(String type) {
        this.type = type;
    }

    public void addTree(Tree tree) {
        this.children.add(tree);
    }

    public String getType() {
        return type;
    }

    protected Tree buildTree(List<Leaf> leafs) {
        for (int i = 0; i < leafs.size(); i++) {
            String treeType = getType();
            Leaf leaf = leafs.get(i);
            String parentType = leaf.getParentType();
            if(parentType.equalsIgnoreCase(treeType)){
                Tree newTree = new Tree(leaf.getType());
                addTree(newTree);
                if(leafs.size()  != 0){
                    newTree.buildTree(leafs);
                }
            }
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return Objects.equals(type, tree.type) && Objects.equals(children, tree.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, children);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "type='" + type + '\'' +
                ", children=" + children +
                '}';
    }
}
