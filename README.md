# TreeWithLeaf problem

given a plain list of leaf build a tree.

Example:

Leafs:  
```
[ 
    {
        "type" : "FIRST_BRANCH",
        "parentType" : "ROOT"
    },
    {
        "type" : "SECOND_BRANCH",
        "parentType" : "ROOT"
    }, 
    {
        "type" : "LEAF_ONE_FIRST_BRANCH",
        "parentType" : "FIRST_BRANCH"
    }, 
    {
        "type" : "LEAF_TWO_FIRST_BRANCH",
        "parentType" : "FIRST_BRANCH"
    }, 
    {
        "type" : "LEAF_ONE_SECOND_BRANCH",
        "parentType" : "SECOND_BRANCH"
    }, 
    {
        "type" : "LEAF_TWO_SECOND_BRANCH",
        "parentType" : "SECOND_BRANCH"
    }, 
    {
        "type" : "LEAF_ONE_CHILD_OF_FIRST_BRANCH",
        "parentType" : "LEAF_ONE_FIRST_BRANCH"
    }, 
    {
        "type" : "LEAF_ONE_CHILD_OF_SECOND_BRANCH",
        "parentType" : "LEAF_ONE_SECOND_BRANCH"
    } 
]
```
Must Become: 
```
{
  "type" : "ROOT",
  "children" : [ {
    "type" : "FIRST_BRANCH",
    "children" : [ {
      "type" : "LEAF_ONE_FIRST_BRANCH",
      "children" : [ {
        "type" : "LEAF_ONE_CHILD_OF_FIRST_BRANCH",
        "children" : [ ]
      } ]
    }, {
      "type" : "LEAF_TWO_FIRST_BRANCH",
      "children" : [ ]
    } ]
  }, {
    "type" : "SECOND_BRANCH",
    "children" : [ {
      "type" : "LEAF_ONE_SECOND_BRANCH",
      "children" : [ {
        "type" : "LEAF_ONE_CHILD_OF_SECOND_BRANCH",
        "children" : [ ]
      } ]
    }, {
      "type" : "LEAF_TWO_SECOND_BRANCH",
      "children" : [ ]
    } ]
  } ]
}

```