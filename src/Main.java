public class Main {
    public static void main(String[] args) {

        //task 1

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 3

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 4

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        //task 5

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        //task 6

        var fighterOneWeight = 78.2;
        var fighterTwoWeight = 82.7;
        var commonFightersWeight = fighterOneWeight + fighterTwoWeight;
        System.out.println(commonFightersWeight);

        var weightDifference = fighterTwoWeight - fighterOneWeight;
        System.out.println(weightDifference);

        //task 7

        weightDifference = fighterTwoWeight % fighterOneWeight;
        System.out.println(weightDifference);

        //task 8

        var totalWorkHours = 640;
        var everyEmployeeWorkHours = 8;
        var totalEmployees = totalWorkHours / everyEmployeeWorkHours;
        System.out.println("Всего в компании - " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        totalWorkHours = totalEmployees * 8;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalWorkHours + " часа работы может быть поделено между сотрудниками");

    }
}