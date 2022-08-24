package com.example.nestedrecycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecycleview.R;
import com.example.nestedrecycleview.model.ChildModelClass;
import com.example.nestedrecycleview.model.Model_gs;

import java.util.List;

public class Adapter_gs extends RecyclerView.Adapter<Adapter_gs.ViewHolder> {

    List<Model_gs> model_gs;
    Context context;

    public Adapter_gs(List<Model_gs> model_gs, Context context) {
        this.model_gs = model_gs;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_gs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.iv_gs_image.setImageResource(model_gs.get(position).image_gs);
    }

    @Override
    public int getItemCount() {
        return model_gs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView iv_gs_image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_gs_image=itemView.findViewById(R.id.image_gs);
        }
    }
}
