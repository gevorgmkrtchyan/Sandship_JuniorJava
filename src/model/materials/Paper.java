package model.materials;

public class Paper extends Material{
    private static final Paper instance = new Paper(400);

    private Paper(int maxCapacity) {
        super("PAPER", "PAPER_D", "PAPER_I",4,maxCapacity);
    }

    public static Paper getInstance() {
        return instance;
    }
    @Override
    public String toString() {
        return "Paper{" +
                "name='" + super.getName() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", icon='" + super.getIcon() + '\'' +
                ", maxCapacity=" + super.getMaxCapacity() +
                '}';
    }
}
