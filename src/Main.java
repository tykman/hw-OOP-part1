public class Main {

    public static void main(String[] args) {
        Griffindor griffindor = new Griffindor("Гарри Поттер",100,100,100,95,95);
        Griffindor griffindor1 = new Griffindor("Гермионе Грейнджер",90,90,100,90,95);
        Griffindor griffindor2 = new Griffindor("Рон Уизли",80,80,90,85,85);
        System.out.println(griffindor2);

        Puffendue puffendue = new Puffendue("Захария Смит",85,90,100,95,85);
        Puffendue puffendue1 = new Puffendue("Седрик Диггори",85,85,70,75,85);
        Puffendue puffendue2 = new Puffendue("Джастин Финч-Флетчли",80,80,75,70,85);
        System.out.println(puffendue);
        
        Kogtevran kogtevran = new Kogtevran("Чжоу Чанг",70,75,80,75,70,70);
        Kogtevran kogtevran1 = new Kogtevran("Падма Паттил",70,65,65,70,60,60);
        Kogtevran kogtevran2 = new Kogtevran("Маркус Белби",65,65,60,65,65,60);
        System.out.println(kogtevran1);
        
        Sleatherin sleatherin = new Sleatherin("Драко Малфой",60,60,60,55,55,60,55);
        Sleatherin sleatherin1 = new Sleatherin("Грэхэм Монтегю",55,55,60,50,50,45,60);
        Sleatherin sleatherin2 = new Sleatherin("Грегори Гойл",55,50,45,45,40,50,60);
        System.out.println(sleatherin2);
        
        System.out.println(griffindor1.calculateSpecificScore());
        System.out.println(sleatherin.calculateGeneralScore());
        sleatherin1.compareByGeneral(puffendue1);
        griffindor.compareBySpecific(griffindor1);
        puffendue2.compare(kogtevran);
        sleatherin.compare(sleatherin1);
    }
}