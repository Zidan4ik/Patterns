package task5.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Dish{
    private int count;
    private List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish){
        dishes.add(dish);
    }
    public void removeDish(Dish dish){
        dishes.remove(dish);
    }
    @Override
    public int count(){
        int i=0;
        for(Dish dish: dishes){
            i+=dish.count();
        }
       return i;
    }
    @Override
    public void showInfo() {
        for(Dish dish : dishes){
            dish.showInfo();
        }
    }
}
