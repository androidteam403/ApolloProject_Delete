package com.example.apolloproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apolloproject.adapter.ImageAdapter;
import com.example.apolloproject.adapter.SecongImageAdapter;

import java.util.ArrayList;
import java.util.List;

public class ShopCategory extends AppCompatActivity   {
    public  List<ImageModal> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_category);

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycle);
        RecyclerView recyclerView_2=(RecyclerView) findViewById(R.id.recycle_2);

       list=new ArrayList<>();
        List<ImageModal1> list1=new ArrayList<>();


        list.add(new ImageModal(R.drawable.point_of_care_devices,"POINT OF CARE   DEVICES","45"   ));
       list.add(new ImageModal(R.drawable.pain_solutions,"PAIN SOLUTION","165"));
        list.add(new ImageModal(R.drawable.wellness,"WELNESS","175"));
        list.add(new ImageModal(R.drawable.hospital_supplies,"HOSPITAL SUPPLIES","555"));
        list.add(new ImageModal(R.drawable.daily_living_aids,"DAILY LIVING AIDS","98"));
        list.add(new ImageModal(R.drawable.lifestyle,"LIFE STYLE","250"));
        ImageAdapter imageAdapter=new ImageAdapter(list,this);
        recyclerView.setAdapter(imageAdapter);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);


        list1.add(new ImageModal1("PYSIO BAND LATEX FREE", R.drawable.pysioband));
        list1.add(new ImageModal1("OMRON NERVE STIMULATOR", R.drawable.omronnerve));
        list1.add(new ImageModal1("ELASTIC WRIST SPLINT RIGHT", R.drawable.pysioband));
        list1.add(new ImageModal1("MANUAL BREAST PUMP BY 15", R.drawable.manualbreastpump));
        list1.add(new ImageModal1("MANUAL BREAST PUMP (ACTURA)", R.drawable.beucermanual));
        SecongImageAdapter adapter=new SecongImageAdapter(list1);
        recyclerView_2.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager2=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView_2.setLayoutManager(layoutManager2);




    }


}