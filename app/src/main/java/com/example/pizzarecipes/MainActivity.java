package com.example.pizzarecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza1,
                Utils.PIZZA_1_TITLE,Utils.PIZZA_1_DESCRIPTION,
                Utils.PIZZA_1_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza2,
                Utils.PIZZA_2_TITLE,Utils.PIZZA_2_DESCRIPTION,
                Utils.PIZZA_2_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza3,
                Utils.PIZZA_3_TITLE,Utils.PIZZA_3_DESCRIPTION,
                Utils.PIZZA_3_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza4,
                Utils.PIZZA_4_TITLE,Utils.PIZZA_4_DESCRIPTION,
                Utils.PIZZA_4_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza5,
                Utils.PIZZA_5_TITLE,Utils.PIZZA_5_DESCRIPTION,
                Utils.PIZZA_5_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza6,
                Utils.PIZZA_6_TITLE,Utils.PIZZA_6_DESCRIPTION,
                Utils.PIZZA_6_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza7,
                Utils.PIZZA_7_TITLE,Utils.PIZZA_7_DESCRIPTION,
                Utils.PIZZA_7_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza8,
                Utils.PIZZA_8_TITLE,Utils.PIZZA_8_DESCRIPTION,
                Utils.PIZZA_8_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza9,
                Utils.PIZZA_9_TITLE,Utils.PIZZA_9_DESCRIPTION,
                Utils.PIZZA_9_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza10,
                Utils.PIZZA_10_TITLE,Utils.PIZZA_10_DESCRIPTION,
                Utils.PIZZA_10_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza11,
                Utils.PIZZA_11_TITLE,Utils.PIZZA_11_DESCRIPTION,
                Utils.PIZZA_11_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza12,
                Utils.PIZZA_12_TITLE,Utils.PIZZA_12_DESCRIPTION,
                Utils.PIZZA_12_RECIPE));
      /*  pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza12,
                Utils.PIZZA_15_TITLE,Utils.PIZZA_15_DESCRIPTION,
                Utils.PIZZA_15_RECIPE));*/
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza14,
                Utils.PIZZA_14_TITLE,Utils.PIZZA_14_DESCRIPTION,
                Utils.PIZZA_14_RECIPE));


        recyclerView = findViewById(R.id.recyclerView);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems,this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);





    }
}
