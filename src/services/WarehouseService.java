package services;

import model.materials.Material;
import model.warehouse.Warehouse;

public class WarehouseService {
    //Implementations are not finished
    MaterialService materialService = new MaterialService();
    //TODO add validations
    public void addMaterial(Material material, int quantity,  Warehouse warehouse){
        int currentQuantity = materialService.getMaterialQuantity(material,warehouse);
        if(quantity > material.getMaxCapacity() || quantity <= 0) {
            throw new RuntimeException("Check input quantity");
        }
        if ((warehouse.getMaterials().containsKey(material)) && (material.getMaxCapacity() - currentQuantity) > quantity ){
            warehouse.getMaterials().put(material,quantity + currentQuantity);
        }else if(!warehouse.getMaterials().containsKey(material)) {
            warehouse.getMaterials().put(material,quantity);
        }else {
            throw new RuntimeException("Check input quantity");
        }
    }
    //TODO add validations
    public void removeMaterial(Material material, int quantity,  Warehouse warehouse){
        int currentQuantity = materialService.getMaterialQuantity(material,warehouse);

        if(quantity < currentQuantity && quantity > 0){
            warehouse.getMaterials().put(material,currentQuantity - quantity);
        }else {
            throw new  RuntimeException("Check input quantity");
        }
    }
    //TODO finish implementation
    //Need to check some cases
    public void moveMaterial(Material material, int quantityToMove, Warehouse warehouseToPick, Warehouse warehouseToPlace) {
        int currentQuantityInWarehouseToPick = materialService.getMaterialQuantity(material, warehouseToPick);
        int currentQuantityInWarehouseToPlace = materialService.getMaterialQuantity(material, warehouseToPlace);
        boolean isWarehouseToPlaceContainsMovableMaterial = warehouseToPlace.getMaterials().containsKey(material);
        if (isWarehouseToPlaceContainsMovableMaterial){
            int maxCapacity = warehouseToPlace.getMaterials().get(material);
        }
        warehouseToPlace.getMaterials().put(material,quantityToMove);
        warehouseToPick.getMaterials().remove(material);
    }
}
