package model.materials;

public class Silicon extends Material{
    private static final Silicon instance = new Silicon(200);

    private Silicon(int maxCapacity) {
        super("SILICON", "SILICON_D", "SILICON_I",3,maxCapacity);
    }

    public static Silicon getInstance() {
        return instance;
    }
    @Override
    public String toString() {
        return "Silicon{" +
                "name='" + super.getName() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", icon='" + super.getIcon() + '\'' +
                ", maxCapacity=" + super.getMaxCapacity() +
                '}';
    }
}
