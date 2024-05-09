package model.materials;

public class Cooper extends Material{
    private static final Cooper instance = new Cooper(500);

    private Cooper(int maxCapacity) {
        super("COOPER", "COOPER_D", "COOPER_I",2,maxCapacity);
    }

    public static Cooper getInstance() {
        return instance;
    }


    @Override
    public String toString() {
        return "Cooper{" +
                "name='" + super.getName() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", icon='" + super.getIcon() + '\'' +
                ", maxCapacity=" + super.getMaxCapacity() +
                '}';
    }
}
