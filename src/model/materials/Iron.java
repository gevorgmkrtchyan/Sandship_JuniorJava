package model.materials;

public class Iron extends Material{
    private static final Iron instance = new Iron(450);

    private Iron(int maxCapacity) {
        super("IRON", "IRON_D", "IRON_I",1,maxCapacity);
    }

    public static Iron getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Iron{" +
                "name='" + super.getName() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", icon='" + super.getIcon() + '\'' +
                ", maxCapacity=" + super.getMaxCapacity() +
                '}';
    }
}
