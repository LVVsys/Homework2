public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var firstBoxer=78.2;
        var secondBoxer=82.7;
        var totalWeight=firstBoxer+secondBoxer;
        var differenceWeigh=secondBoxer%firstBoxer;
        System.out.println("масса первого боксёра "+firstBoxer+" кг");
        System.out.println("масса второго боксёра "+secondBoxer+" кг");
        System.out.println("общий вес бойцов "+totalWeight+" кг");
        System.out.println("разница в весе "+differenceWeigh+" кг");

        differenceWeigh=secondBoxer-firstBoxer;
        System.out.println(differenceWeigh);
        differenceWeigh=secondBoxer%firstBoxer;
        System.out.println(differenceWeigh);

        var totalHours=640;
        var vorkingDay=8;
        var staff=totalHours/vorkingDay;
        System.out.println("Всего работников в компании — "+staff+" человек");
        staff=staff+94;
        var quantityHours=640/staff;
        System.out.println("Если в компании работает "+staff+" человек, то всего "+quantityHours+" часов работы может быть поделено между сотрудниками");
    }
}