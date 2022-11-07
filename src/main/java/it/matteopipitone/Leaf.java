package it.matteopipitone;

public class Leaf {
    private String type;
    private String parentType;

    public Leaf(String type, String parentType) {
        this.setType(type);
        this.setParentType(parentType);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "type='" + getType() + '\'' +
                ", parentType='" + getParentType() + '\'' +
                '}';
    }
}
