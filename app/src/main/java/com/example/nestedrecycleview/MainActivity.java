package com.example.nestedrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nestedrecycleview.adapter.Adapter_gs;
import com.example.nestedrecycleview.adapter.ParentAdapter;
import com.example.nestedrecycleview.model.ChildModelClass;
import com.example.nestedrecycleview.model.Model_gs;
import com.example.nestedrecycleview.model.ParentModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ParentModelClass> parentModelClassArrayList;
    ArrayList<ChildModelClass> childModelClassArrayList;
    ArrayList<Model_gs> model_gs;

    ParentAdapter parentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        recyclerView=findViewById(R.id.rv_parent);

        childModelClassArrayList=new ArrayList<>();
        parentModelClassArrayList=new ArrayList<>();
        model_gs = new ArrayList<>();

        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));
        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));
        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));
        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));
        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));
        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));
        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));
        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));
        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));
        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));
        model_gs.add(new Model_gs(R.drawable.ic_launcher_foreground));

        childModelClassArrayList.add(new ChildModelClass(R.drawable.img8, model_gs));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img9, model_gs));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img10, model_gs));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img11, model_gs));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img8, model_gs));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img9, model_gs));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img10, model_gs));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img11, model_gs));

        parentModelClassArrayList.add(new ParentModelClass("Nature", childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Nature", childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Nature", childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Nature", childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Nature", childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Nature", childModelClassArrayList));


        parentAdapter=new ParentAdapter(parentModelClassArrayList, MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(parentAdapter);
       // parentAdapter.notifyDataSetChanged();
    }
}