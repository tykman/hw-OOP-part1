public class Sleatherin extends Hogwarts {
    private int sly;
    private int strong;
    private int ambitious;
    private int quickWitted;
    private int greedForPower;

    public Sleatherin(String name, int powerOfMagic, int transgressForDistance,int sly,int strong,int ambitious,int quickWitted,int greedForPower) {
        super(name, powerOfMagic, transgressForDistance );
        this.sly = sly;
        this.strong = strong;
        this.ambitious = ambitious;
        this.quickWitted = quickWitted;
        this.greedForPower = greedForPower;
    }

    @Override
    int calculateSpecificScore() {
        return this.sly+this.strong+this.ambitious+this.quickWitted+this.greedForPower;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Слизеринец, чем %s", best.getName(),worst.getName()));
    }


    @Override
    public String toString() {
        return "Sleatherin{" +
                "sly=" + sly +
                ", strong=" + strong +
                ", ambitious=" + ambitious +
                ", quickWitted=" + quickWitted +
                ", greedForPower=" + greedForPower +
                ", name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressForDistance=" + transgressForDistance +
                "} " + super.toString();
    }
}