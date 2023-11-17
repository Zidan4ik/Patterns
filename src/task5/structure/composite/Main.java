package task5.structure.composite;

public class Main {
    public static void main(String[] args) {
        Dish meat1 = new Meat("М'ясо куряче",250,30);
        Dish meat2 = new Meat("М'ясо теляче",260,30);
        Dish soupRead = new Soup(TypeOfSoup.red,125,25);
        Dish soupGreen = new Soup(TypeOfSoup.green,100,22);
        Dish salad = new Salad("Салат цезарь",80,15);

        Menu menuMeat = new Menu();
        Menu menuSoup = new Menu();
        Menu menuSalad = new Menu();

        menuMeat.addDish(meat1);
        menuMeat.addDish(meat2);

        menuSoup.addDish(soupRead);
        menuSoup.addDish(soupGreen);

        menuSalad.addDish(salad);

        Menu menu = new Menu();
        menu.addDish(menuMeat);
        menu.addDish(menuSalad);
        menu.addDish(menuSoup);


        menu.showInfo();
        System.out.println(menu.count());
    }
}
