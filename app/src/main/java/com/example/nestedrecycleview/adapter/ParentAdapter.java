package com.example.nestedrecycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecycleview.R;
import com.example.nestedrecycleview.model.ChildModelClass;
import com.example.nestedrecycleview.model.ParentModelClass;

import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ViewHolder> {

    List<ParentModelClass> parentModelClassList;
    Context context;

    public ParentAdapter(List<ParentModelClass> parentModelClassList , Context context) {
        this.parentModelClassList = parentModelClassList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.parent_rv_layout, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_parent_title.setText(parentModelClassList.get(position).title);

         // parentModelClassList.get(position).childModelClassList
        ChildAdapter childAdapter;
        childAdapter=new ChildAdapter(parentModelClassList.get(position).childModelClassList, context);
        holder.rv_child.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.rv_child.setAdapter(childAdapter);
       // childAdapter.notifyDataSetChanged();
       }

    @Override
    public int getItemCount() {
        return parentModelClassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerView  rv_child;
        TextView tv_parent_title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rv_child=itemView.findViewById(R.id.rv_child);
            tv_parent_title=itemView.findViewById(R.id.tv_parent_title);
        }
    }
}
