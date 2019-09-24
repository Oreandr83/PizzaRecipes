package com.example.pizzarecipes;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class PizzaRecipeAdapter extends RecyclerView.Adapter<PizzaRecipeAdapter.PizzaRecipeViewHolder> {

    private ArrayList<PizzaRecipeItem> pizzaRecipeItems;
    Context context;//create for Intent
//2
    public class PizzaRecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //after create Activity for recipe implements interface OnClickListener
        public ImageView pizzaImageView;
        public TextView titleTextView;
        public TextView descriptionTextView;

        //4
    public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            pizzaImageView = itemView.findViewById(R.id.pizzaImageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }

    @Override
    public void onClick(View view) {//method onClickListener

        int position = getAdapterPosition();
        PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(position);//Position index item

        Intent intent = new Intent(context,PizzaRecipes.class);
        intent.putExtra("imageResource", pizzaRecipeItem.getImageRecourse());
        intent.putExtra("title",pizzaRecipeItem.getTitle());
        intent.putExtra("description",pizzaRecipeItem.getDescription());
        intent.putExtra("recipe",pizzaRecipeItem.getRecipe());

        context.startActivity(intent);

    }
}//create new item put context
    public PizzaRecipeAdapter(ArrayList<PizzaRecipeItem> pizzaRecipeItems,Context context){
        this.pizzaRecipeItems = pizzaRecipeItems;
        this.context = context;

    }


//3
    @NonNull
    @Override
    public PizzaRecipeAdapter.PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pizza_recipe_item, viewGroup,false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder viewHolder, int i) {
        PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(i);

        viewHolder.pizzaImageView.setImageResource(pizzaRecipeItem.getImageRecourse());
        viewHolder.titleTextView.setText(pizzaRecipeItem.getTitle());
        viewHolder.descriptionTextView.setText(pizzaRecipeItem.getDescription());


    }


    @Override
    public int getItemCount() {
        return pizzaRecipeItems.size();
    }
}
