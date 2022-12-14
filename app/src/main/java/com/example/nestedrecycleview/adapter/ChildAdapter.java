package com.example.nestedrecycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecycleview.R;
import com.example.nestedrecycleview.model.ChildModelClass;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {

    List<ChildModelClass> childModelClassList;
    Context context;

    //Question: root null or parent
    public ChildAdapter(List<ChildModelClass> childModelClassList, Context context) {
        this.childModelClassList = childModelClassList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.child_rv_layout, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.iv_child_image.setImageResource(childModelClassList.get(position).image);

        Adapter_gs adapter_gs;
        adapter_gs = new Adapter_gs(childModelClassList.get(position).model_gs, context);
        holder.recyclerView_gs.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView_gs.setAdapter(adapter_gs);

    }

    @Override
    public int getItemCount() {
        return childModelClassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView_gs;
        ImageView iv_child_image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_child_image=itemView.findViewById(R.id.iv_child_item);
            recyclerView_gs=itemView.findViewById(R.id.recyc_gs);
        }
    }
}
