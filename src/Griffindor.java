public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name,int powerOfMagic,int transgressForDistance,int nobility,int honor,int courage) {
        super(name,powerOfMagic,transgressForDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    int calculateSpecificScore() {
        return this.nobility+this.honor+this.courage;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Гриффиндорец, чем %s", best.getName(), worst.getName()));
    }


    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressForDistance=" + transgressForDistance +
                "} " + super.toString();
    }
}


