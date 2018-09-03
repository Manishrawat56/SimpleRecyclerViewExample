package com.vdishub.simplerecyclerviewexample;

import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vdishub.
 * Date: 3/9/18
 * Time: 3:05 PM
 *
 * @author Manish rawat
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<Contact>mDataList;
    MyAdapter(ArrayList<Contact> mDataList){
    this.mDataList=mDataList;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name, textCircle, number;
        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            number = (TextView) view.findViewById(R.id.number);
            textCircle= (TextView) view.findViewById(R.id.image);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.contant_item, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int position) {
        Contact contact = mDataList.get(position);
        viewHolder.name.setText(contact.getName());
        viewHolder.number.setText(contact.getNumber());
        viewHolder.textCircle.setText(contact.getName().substring(0,1).toUpperCase());
    }

    @Override
    public int getItemCount() {
        return mDataList == null? 0:mDataList.size();
    }

    public void setmDataList(ArrayList<Contact> mDataList) {
        this.mDataList = mDataList;
        notifyDataSetChanged();
    }
}
