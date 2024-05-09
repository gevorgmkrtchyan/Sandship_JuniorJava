package model.warehouse;

import model.BaseEntity;
import model.materials.Material;

import java.util.Map;

public class Warehouse extends BaseEntity {
    private String name;
    //Materials with their quantities
    private Map<Material,Integer> materials;

    public Warehouse(int id) {
        super(id);
    }
    public Warehouse(int id, String name, Map<Material, Integer> materials){
        super(id);
        this.name = name;
        this.materials = materials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Material, Integer> getMaterials() {
        return materials;
    }

    public void setMaterials(Map<Material, Integer> materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "name='" + name + '\'' +
                ", materials=" + materials +
                '}';
    }
}
