public class Kogtevran extends Hogwarts {
    private int smart;
    private int allWise;
    private int snappy;
    private int creative;

    public Kogtevran(String name, int powerOfMagic, int transgressForDistance,int smart,int allWise,int snappy,int creative ) {
        super(name, powerOfMagic, transgressForDistance );
        this.smart = smart;
        this.allWise = allWise;
        this.snappy = snappy;
        this.creative = creative;
    }

    @Override
    int calculateSpecificScore() {
        return this.smart+this.allWise+this.snappy+this.creative;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Когтевранец, чем %s", best.getName(), worst.getName()));
    }


    @Override
    public String toString() {
        return "Kogtevran{" +
                "smart=" + smart +
                ", allWise=" + allWise +
                ", snappy=" + snappy +
                ", creative=" + creative +
                ", name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressForDistance=" + transgressForDistance +
                "} " + super.toString();
    }
}
