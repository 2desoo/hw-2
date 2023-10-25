public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов = " + totalWeight + " кг!");
        var difference1 = secondBoxer - firstBoxer;
        System.out.println("Разница массы бойцов = " + difference1 + " кг!" + " 1 способ");
        var difference2 = secondBoxer % firstBoxer;
        System.out.println("Разница массы бойцов = " + difference2 + " кг!" + " 2 способ");
        var totalTime = 640;
        var timeOneWorker = 8;
        System.out.println("Обшее время работы = " + totalTime + " часов");
        System.out.println("Время одного работника = " + timeOneWorker + " часов");
        var allWorker = 640 / 8;
        System.out.println("Всего работнитков в компании = " + allWorker + " человек");
        allWorker = allWorker + 94;
        System.out.println("Если в компании работает = " + allWorker + " человека");
        totalTime = allWorker * 8;
        System.out.println("Если в компании работает = " + allWorker + " человека," + " то всего " + totalTime + " часов работы может быть поделено между сотрудниками");

    }
}