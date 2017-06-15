package com.example.bhushan.mmvmtry.View;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bhushan.mmvmtry.Model.Person;
import com.example.bhushan.mmvmtry.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Bhushan on 6/15/2017.
 */

public class PersonView extends RecyclerView.Adapter<PersonView.ViewHolder> {
    private ArrayList<Person> persons;
    private Context context;

    public PersonView(ArrayList<Person> persons, Context context){
        this.persons = persons;
        this.context = context;
    }

    @Override
    public PersonView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PersonView.ViewHolder viewHolder, int i){

        viewHolder.tvfirstName.setText(persons.get(i).getFirstname());
        viewHolder.tvlastName.setText(persons.get(i).getLastname());
        viewHolder.tvid.setText(persons.get(i).getId());
        Picasso.with(context).load(persons.get(i).getImage()).resize(80,80).into(viewHolder.ivImage);
    }

    @Override
    public int getItemCount(){
        return persons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvfirstName, tvlastName, tvid;
        private ImageView ivImage;

        public ViewHolder(View view) {
            super(view);
            ivImage = (ImageView)view.findViewById(R.id.ivImage);
            tvfirstName = (TextView)view.findViewById(R.id.tvfirstName);
            tvlastName = (TextView)view.findViewById(R.id.tvlastName);
            tvid = (TextView)view.findViewById(R.id.tvid);

        }
    }

}
