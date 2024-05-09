package services;

import model.materials.Material;
import model.warehouse.Warehouse;

public class MaterialService {
    public int getMaterialQuantity(Material material, Warehouse warehouse){
        int quantity = 0;
        for (Material m : warehouse.getMaterials().keySet()){
            if (m.equals(material)){
                quantity = warehouse.getMaterials().get(material);
            }
        }
        return quantity;
    }
}
