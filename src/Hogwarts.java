public abstract class Hogwarts {
     String name;
     int powerOfMagic;
     int transgressForDistance;

    public   Hogwarts(String name, int powerOfMagic, int transgressForDistance) {

        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressForDistance = transgressForDistance;
    }

    public String getName() {
        return name;
    }

    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            this.compareBySpecific(hogwarts);
        } else {
            this.compareByGeneral(hogwarts);
        }
    }

    abstract int calculateSpecificScore();

    abstract void printCompareOfStudents(Hogwarts best, Hogwarts worst);

    public int calculateGeneralScore() {
        return this.powerOfMagic + this.transgressForDistance;
    }


    public void compareBySpecific(Hogwarts hogwarts) {
        int thisScore = this.calculateGeneralScore() + this.calculateSpecificScore();
        int otherScore = hogwarts.calculateGeneralScore() + this.calculateSpecificScore();

        if (thisScore > otherScore) {
            printCompareOfStudents(this,hogwarts);
        } else if (thisScore < otherScore) {
            printCompareOfStudents(hogwarts,this);
        } else {
            System.out.println("Ученики одного факультета равны по силе");
        }
    }

    public void compareByGeneral(Hogwarts hogwarts) {
        int thisScore = calculateGeneralScore();
        int otherScore = hogwarts.calculateGeneralScore();

        if (thisScore > otherScore) {
            System.out.println(String.format("Ученик %s сильнее ученика %s", this.name, hogwarts.name));
        } else if (otherScore > thisScore){
            System.out.println(String.format("Ученик %s сильнее ученика %s", hogwarts.name, this.name));
        } else {
            System.out.println("Ученики равны по силе");
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressForDistance=" + transgressForDistance +
                '}';
    }
}
