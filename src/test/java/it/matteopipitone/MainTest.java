package it.matteopipitone;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void acceptanceTest() {

        List<Leaf> leafs = Arrays.asList(
                new Leaf("FIRST_BRANCH", "ROOT"),
                new Leaf("SECOND_BRANCH", "ROOT"),
                new Leaf("LEAF_ONE_FIRST_BRANCH", "FIRST_BRANCH"),
                new Leaf("LEAF_TWO_FIRST_BRANCH", "FIRST_BRANCH"),
                new Leaf("LEAF_ONE_SECOND_BRANCH", "SECOND_BRANCH"),
                new Leaf("LEAF_TWO_SECOND_BRANCH", "SECOND_BRANCH"),
                new Leaf("LEAF_ONE_CHILD_OF_FIRST_BRANCH", "LEAF_ONE_FIRST_BRANCH"),
                new Leaf("LEAF_ONE_CHILD_OF_SECOND_BRANCH", "LEAF_ONE_SECOND_BRANCH")
                );

        Tree expected = new Tree("ROOT");

        Tree firstBranch = new Tree("FIRST_BRANCH");
        Tree secondBranch = new Tree("SECOND_BRANCH");

        Tree leaf_one_first_branch = new Tree("LEAF_ONE_FIRST_BRANCH");
        firstBranch.addTree(leaf_one_first_branch);
        firstBranch.addTree(new Tree("LEAF_TWO_FIRST_BRANCH"));

        Tree leaf_one_second_branch = new Tree("LEAF_ONE_SECOND_BRANCH");
        secondBranch.addTree(leaf_one_second_branch);
        secondBranch.addTree(new Tree("LEAF_TWO_SECOND_BRANCH"));

        leaf_one_first_branch.addTree(new Tree("LEAF_ONE_CHILD_OF_FIRST_BRANCH"));
        leaf_one_second_branch.addTree(new Tree("LEAF_ONE_CHILD_OF_SECOND_BRANCH"));

        expected.addTree(firstBranch);
        expected.addTree(secondBranch);
        Tree tree = new Tree("ROOT");

        Tree result = tree.buildTree(leafs);

        assertEquals(expected, result);
    }


}