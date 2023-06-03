package com.youngkevin.lab8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RecipeListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarTitle = findViewById(R.id.toolbar_title);
        setSupportActionBar(toolbar);
    }

    public void onClickShowRecipe(View view) {
        Intent intent = new Intent(this,RecipeActivity.class);
        startActivity(intent);
    }
    public void itemClicked(long id){
        FragmentContainerView detailFragment = findViewById(R.id.detail_fragment_container);
        if(detailFragment != null){
            //tablet layout
            RecipeDetailFragment fragment = new RecipeDetailFragment();
            fragment.setRecipe(id);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.detail_fragment_container, fragment);
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else{
            //standard layout
            Intent intent = new Intent(this, RecipeActivity.class);
            intent.putExtra(RecipeActivity.EXTRA_RECIPE_ID, (int)
                    id);
            startActivity(intent);
        }

        Intent intent = new Intent(this, RecipeActivity.class);
        intent.putExtra(RecipeActivity.EXTRA_RECIPE_ID, (int) id);
        startActivity(intent);
    }

}