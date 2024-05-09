package model.player;

import model.BaseEntity;
import model.warehouse.Warehouse;

import java.util.List;

public class Player extends BaseEntity {
    private String name;
    private List<Warehouse> warehouses;

    public Player(int id, String name) {
        super(id);
        this.name = name;
    }
    public Player(int id, String name,List<Warehouse> warehouses) {
        super(id);
        this.name = name;
        this.warehouses = warehouses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + super.getId() + '\''+
                "name='" + name + '\'' +
                '}';
    }
}
