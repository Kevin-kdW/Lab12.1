package com.youngkevin.lab8;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecipeListFragment extends ListFragment {
    static interface Listener {
        void itemClicked( long id );
    }
    public RecipeListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String[] names = new String[Recipe.recipes.length];
        for(int i = 0; i < names.length; i++)
        {
            names[i] = Recipe.recipes[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_recipe_list,
                container, false);


    }


    private Listener listener;
    @Override
    public void onAttach( Context context )
    {
        super.onAttach( context );
        this.listener = (Listener) context;
    }
    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        if( listener != null )
        {
            listener.itemClicked( id );
        }
    }
}
