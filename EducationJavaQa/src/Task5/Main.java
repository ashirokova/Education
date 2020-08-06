package Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<? extends Animal>> animals = new HashMap<>();
        ArrayList<Cat> listCats = new ArrayList<>();
        listCats.add(new Cat("Behemoth", 5, "Black"));
        listCats.add(new Cat("Tom", 7, "Grey"));
        listCats.add(new Cat("Garfield", 2, "Ginger"));
        ArrayList<Dog> listADogs = new ArrayList<>();
        listADogs.add(new Dog("Lassy", 13, "White"));
        listADogs.add(new Dog("Lady", 2, "Brown"));
        listADogs.add(new Dog("Jake", 6, "Yellow"));
        ArrayList<Ducks> listDucks = new ArrayList<>();
        listDucks.add(new Ducks("Huey", 1, "male"));
        listDucks.add(new Ducks("Dewey", 2, "male"));
        listDucks.add(new Ducks("Louie", 3, "male"));
        animals.put("cats", listCats);
        animals.put("dogs", listADogs);
        animals.put("ducks", listDucks);
        showResult(animals);
        removeIfOlder(animals,2);
        showResult(animals);

    }

    static private void removeIfOlder(HashMap<String, List<? extends Animal>> animals, int age) {
        animals.values().forEach(listAnimals->listAnimals.removeIf(animal->animal.getAge()>age));
    }

    static private void showResult(HashMap<String, List<? extends Animal>> animals) {
        animals.forEach((s, a) -> {
            System.out.println(s);
            a.forEach(it -> {
                System.out.printf("\t %s \n", it);
            });
        });
    }
}