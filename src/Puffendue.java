public class Puffendue extends Hogwarts {
    private int diligence;
    private int allegiance;
    private int honestly;


    public Puffendue(String name,int powerOfMagic, int transgressForDistance, int diligence, int allegiance, int honestly) {
        super(name, powerOfMagic, transgressForDistance );
        this.diligence = diligence;
        this.allegiance = allegiance;
        this.honestly = honestly;
    }

    @Override
    int calculateSpecificScore() {
        return this.diligence+this.allegiance+this.honestly;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Пуффендуец, чем %s", best.getName(), worst.getName()));
    }


    @Override
    public String toString() {
        return "Puffendue{" +
                "diligence=" + diligence +
                ", allegiance=" + allegiance +
                ", honestly=" + honestly +
                ", name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressForDistance=" + transgressForDistance +
                "} " + super.toString();
    }
}
