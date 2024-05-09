package model.materials;

import model.BaseEntity;

public abstract class Material extends BaseEntity {
    private String name;
    private String description;
    private String icon;
    private int maxCapacity;

    public Material(String name, String description, String icon,int id,int maxCapacity) {
        super(id);
        this.maxCapacity = maxCapacity;
        this.name = name;
        this.description = description;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
