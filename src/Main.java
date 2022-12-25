public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        System.out.println("Задача 2");
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println("dog+4="+dog);
        System.out.println("cat+4="+cat);
        System.out.println("paper+4="+paper);

        System.out.println("Задача 3");
        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println("(dog+4)-3.5="+dog);
        System.out.println("(cat+4)-1.6="+cat);
        System.out.println("(paper+4)-7639="+paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend="+friend);
        friend = friend + 2;
        System.out.println("friend+2="+friend);
        friend=friend/7;
        System.out.println("(friend+2)/7="+friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog="+frog);
        frog=frog*10;
        System.out.println("frog*10="+frog);
        frog=frog/3.5;
        System.out.println("frog*10/3.5="+frog);
        frog=frog+4;
        System.out.println("(frog*10/3)+4="+frog);

        System.out.println("Задача 6");
        var boxerWeigt1=78.2;
        var boxerWeigt2=82.7;
        var totalWeight= boxerWeigt1+boxerWeigt2;
        System.out.println("Общий вес боксеров "+totalWeight+" кг");
        var differenceWeight=boxerWeigt2 - boxerWeigt1;
        System.out.println("Разница в весе "+differenceWeight+" кг");

        System.out.println("Задача 7");
        differenceWeight = boxerWeigt2 - boxerWeigt1;
        System.out.println("Разница в весе при вычитании из большего веса меньшего "+differenceWeight+" кг");
        differenceWeight=boxerWeigt2 % boxerWeigt1;
        System.out.println("Разница в весе с помощью функции остаток от деления "+differenceWeight+" кг");

        System.out.println("Задача 8");
        var totalHours=680;
        var workingHours=8;
        var amountOfWorkers=totalHours/workingHours;
        System.out.println("Всего работников в компании "+amountOfWorkers+" человвек");
        var increaseInWorkers = amountOfWorkers + 94;
        var newHours = increaseInWorkers*workingHours;
        System.out.println("Если в компании работает "+increaseInWorkers+" человвек, то всего " + newHours + " часов работы может быть поделено между сотрудниками");













    }
}