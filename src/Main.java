public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var boxer1weight = 78.2;
        System.out.println("Вес боксера №1 " + boxer1weight + "кг." );
        var boxer2weight = 82.7;
        System.out.println("Вес боксера №2 " + boxer2weight + "кг." );
        var totalWeight = boxer1weight + boxer2weight;
        System.out.println("Общий вес боксеров " + totalWeight + "кг.");
        var weightDifference = boxer2weight - boxer1weight;
        System.out.println("Разница в весе составляет " + weightDifference + "кг.");
        var preponderance = totalWeight % boxer1weight;
        System.out.println("Разница в весе составляет " + preponderance + "кг.");

        var totalTime = 640;
        var workTime = 8;
        var workers = totalTime / workTime;
        System.out.println("Всего работников в компании - " + workers + " человек.");
        workers = workers + 94;
        totalTime = workers * workTime;
        System.out.println("Если в компании работает - " + workers + " человек, то всего " + totalTime + " часов работы может быть поделенно между сотрудниками.");

    }


}