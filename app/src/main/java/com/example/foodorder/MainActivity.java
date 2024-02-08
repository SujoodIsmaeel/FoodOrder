package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Locale;

import Adapter.CategoryAdapter;
import Domain.CafeteriesDomain;
import Domain.FoodDomain;

public class MainActivity extends AppCompatActivity {
      private RecyclerView.Adapter adapter1,adapter2;
      private RecyclerView recyclerViewCafeteriesList, recyclerViewMenuList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerViewCafeteriesList();
       recyclerViewMenuList();
        
    }

    private void recyclerViewMenuList() {
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewMenuList=findViewById(R.id.view2);
        recyclerViewMenuList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodlist = new ArrayList<>();
        foodlist.add(new FoodDomain("","", "slices,mozzarella chese, oregano, black pepper, sauce",13.0 , 5,20));
      // adapter2= new
    }

    private void recyclerViewCafeteriesList() {
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCafeteriesList= findViewById(R.id.view1);
        recyclerViewCafeteriesList.setLayoutManager(linearLayoutManager);

        ArrayList<CafeteriesDomain> CafeteriesList = new ArrayList<>();
        CafeteriesList.add(new CafeteriesDomain("الدوم ", ""));
        CafeteriesList.add(new CafeteriesDomain("المحطة", ""));
        CafeteriesList.add(new CafeteriesDomain("العلوم ", ""));
        CafeteriesList.add(new CafeteriesDomain("ابو مارسيل", ""));
        CafeteriesList.add(new CafeteriesDomain("ابو احمد", ""));
        CafeteriesList.add(new CafeteriesDomain("كوكتيل رنوش", "ranosh"));
        CafeteriesList.add(new CafeteriesDomain("Nutella", ""));
        CafeteriesList.add(new CafeteriesDomain(" الآداب", ""));
        CafeteriesList.add(new CafeteriesDomain("Vanella", "vanella"));
        CafeteriesList.add(new CafeteriesDomain("سناكس", ""));
        CafeteriesList.add(new CafeteriesDomain("ميرميه", ""));
        CafeteriesList.add(new CafeteriesDomain("Toast  ", "tost"));
        CafeteriesList.add(new CafeteriesDomain("Burger ", "btn_2"));
        CafeteriesList.add(new CafeteriesDomain("Grand Falafel ", ""));
        CafeteriesList.add(new CafeteriesDomain("معجنات ", "btn_1"));
        CafeteriesList.add(new CafeteriesDomain("توب شاورما ", "shawarma"));

        adapter1=new CategoryAdapter(CafeteriesList);
        recyclerViewCafeteriesList.setAdapter(adapter1);






    }
}