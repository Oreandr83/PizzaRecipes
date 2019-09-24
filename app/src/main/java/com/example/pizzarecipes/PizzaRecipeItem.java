package com.example.pizzarecipes;

public class PizzaRecipeItem {

    private int ImageRecourse;
    private String title;
    private String description;
    private String recipe;



    public  PizzaRecipeItem (int ImageRecourse,String title,String description,String recipe){
        this.ImageRecourse = ImageRecourse;
        this.title = title;
        this.description = description;
        this.recipe = recipe;

    }

    public int getImageRecourse(){
        return ImageRecourse;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getRecipe(){
        return recipe;
    }
}
