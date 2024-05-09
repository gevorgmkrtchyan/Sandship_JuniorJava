import model.materials.*;
import model.player.Player;
import model.warehouse.Warehouse;
import services.WarehouseService;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WarehouseService warehouseService = new WarehouseService();
        //creating some materials with Singleton DP
        Material iron = Iron.getInstance();
        Material silicon = Silicon.getInstance();
        Material paper = Paper.getInstance();
        Material copper = Cooper.getInstance();
        //----------------------------------
        //creating a warehouse DATA with materials and their MAX_CAPACITIES
        Map<Material, Integer> materials1 = new HashMap<>();
        materials1.put(iron,300);
        materials1.put(silicon,150);
        Map<Material, Integer> materials2 = new HashMap<>();
        materials2.put(paper,100);
        materials2.put(copper,150);
        //----------------------------------
        //creating 2 warehouses
        Warehouse warehouse1 = new Warehouse(1,"WAREHOUSE_1", materials1);
        System.out.println(warehouse1);
        Warehouse warehouse2 = new Warehouse(2,"WAREHOUSE_2", materials2);
        System.out.println(warehouse2);

        //testing add, remove and move functionalities
//        System.out.println("--------------------------------------------------------------");
//        warehouseService.addMaterial(iron,50,warehouse2);
//        System.out.println(warehouse2);
//        warehouseService.removeMaterial(iron,10,warehouse2);
//        System.out.println("--------------------------------------------------------------");
//        System.out.println(warehouse2);


    }
}