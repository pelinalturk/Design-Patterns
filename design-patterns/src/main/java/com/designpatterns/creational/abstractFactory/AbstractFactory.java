package com.designpatterns.creational.abstractFactory;


import java.util.ArrayList;
import java.util.List;

interface Ingredient{
    String name();
}

interface Cheese extends Ingredient{}

class GoatCheese implements Cheese{
    @Override
    public String name() {
        return "Goat Cheese";
    }
}

class FetaCheese implements Cheese{

    @Override
    public String name() {
        return "Feta Cheese";
    }
}

interface Sauce extends Ingredient{}

class MexicanSauce implements Sauce{
    @Override
    public String name() {
        return "Mexican Sauce";
    }
}

class TurkishSauce implements Sauce{
    @Override
    public String name() {
        return "Turkish Sauce";
    }
}

abstract class ToppingFactory{
    abstract Cheese getCheese();
    abstract Sauce getSauce();
    List<Ingredient>getIngredients(){
        List<Ingredient> ingredients  = new ArrayList<>();
        ingredients.add(getCheese());
        ingredients.add(getSauce());
        return ingredients;
    }


}

class StandardToppingFactory extends ToppingFactory{

    @Override
    Cheese getCheese() {
        return null;
    }

    @Override
    Sauce getSauce() {
        return null;
    }

    @Override
    List<Ingredient> getIngredients() {
        return null;
    }
}

class MexicanToppingFactory extends ToppingFactory{

    @Override
    Cheese getCheese() {
        return new GoatCheese();
    }

    @Override
    Sauce getSauce() {
        return new MexicanSauce();
    }
}

class TurkishToppingFactory extends ToppingFactory{

    @Override
    Cheese getCheese() {
        return new FetaCheese();
    }

    @Override
    Sauce getSauce() {
        return new TurkishSauce();
    }
}

abstract class Pizza{
    List<Ingredient> extraIngredients;

    public Pizza(List<Ingredient> extraIngredients) {
        this.extraIngredients = extraIngredients;
    }

    public Pizza(){
        this.extraIngredients = null;
    }

    abstract void bake();
}

class CheesePizza extends Pizza{

    public CheesePizza(List<Ingredient> extraIngredient){
        super(extraIngredient);
    }

    public CheesePizza(){
    }

    @Override
    void bake() {
        if(extraIngredients != null){
            extraIngredients.stream().map(Ingredient::name).forEach(System.out::println);
        }
        System.out.println("I am a cheese pizza");
    }
}

class VegetarianPizza extends Pizza{

    public VegetarianPizza(List<Ingredient> extraIngredient){
        super(extraIngredient);
    }

    public VegetarianPizza(){
    }

    @Override
    void bake() {
        if(extraIngredients != null){
            extraIngredients.stream().map(Ingredient::name).forEach(System.out::println);
        }
        System.out.println("I am a vegetarian pizza");
    }
}

class PepperoniPizza extends Pizza{

    public PepperoniPizza(List<Ingredient> extraIngredient){
        super(extraIngredient);
    }

    public PepperoniPizza(){
    }

    @Override
    void bake() {
        if(extraIngredients != null){
            extraIngredients.stream().map(Ingredient::name).forEach(System.out::println);
        }
        System.out.println("I am a pepperoni pizza");
    }
}

class PizzaFactory{
    Pizza getPizza(String type, ToppingFactory toppingFactory){
        List<Ingredient>ingredients = toppingFactory.getIngredients();
        Pizza pizza;
        switch (type.toLowerCase()){
            case "cheese":
                pizza = new CheesePizza(ingredients);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredients);
                break;
            case "veggie":
                pizza = new VegetarianPizza(ingredients);
                break;
            default: throw new IllegalArgumentException("No such pizza");
        }
        pizza.bake();
        return pizza;
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        ToppingFactory standardToppingFactory = new StandardToppingFactory();
        ToppingFactory mexicanToppingFactory = new MexicanToppingFactory();
        ToppingFactory turkishToppingFactory = new TurkishToppingFactory();
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza standardPizza = pizzaFactory.getPizza("veggie", standardToppingFactory);
        System.out.println("----------");
        Pizza mexicanPizza = pizzaFactory.getPizza("cheese", mexicanToppingFactory);
        System.out.println("----------");
        Pizza turkishPizza = pizzaFactory.getPizza("pepperoni", turkishToppingFactory);
        System.out.println("----------");

        /*
        * output:
        I am a vegetarian pizza
        ----------
        Goat Cheese
        Mexican Sauce
        I am a cheese pizza
        ----------
        Feta Cheese
        Turkish Sauce
        I am a pepperoni pizza
        ----------
        * */
    }
}
