package com.example.revealdare;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.yalantis.library.Koloda;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 public class MainActivity extends AppCompatActivity {


    private SwipeAdapter adapter;
    private List<Integer>list;
    private Koloda koloda;
   public TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText=findViewById(R.id.tvText);

        // Initialize Koloda (swipe cards view)
        koloda = findViewById(R.id.koloda);

        list =new ArrayList<>();
        adapter=new SwipeAdapter( this,list);
        koloda.setAdapter(adapter);



    }
}




