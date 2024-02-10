public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        var staffWeight = 20;
        var capacityLeft = liftingCapacity - staffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

        var appleWeight = 2;
        var orangeWeight = 3;
        var fruitWeight = appleWeight + orangeWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");

        var leftWeight = liftingCapacity - staffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);

        leftWeight = liftingCapacity - staffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");

        //10:46

        var overload = (staffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");
    }
}