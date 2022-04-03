package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ArrayList<String> productList;
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private int newPro,newStock,newType;
    private String newTitle,newDsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar(toolbar);///menu
        init();

    }

    private void setSupportActionBar(Toolbar toolbar) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);//xml file name menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.btnAdd) {
            Intent intent = new Intent(MainActivity.this, AddInfo.class);
            startActivityForResult(intent, 1);

        }
        return super.onOptionsItemSelected(item);
    }

    public void init() {
        toolbar = findViewById(R.id.btnAdd);
        productList = new ArrayList<>();
       // for(int i = 0; i <= 10; i++) {
          //  productList.add("Product --"+i);
        //}
        Intent intent = getIntent();

        Bundle input = intent.getExtras();
        newTitle = input.getString(Constants.KEY_TITLE, "Not Available");
        newType= input.getInt(Constants.KEY_TYPE, 2);
        productList.add(" " + newTitle);
       // String title;
        mt(newTitle + " " + newType);
        Log.e("tag", newTitle + " " + newType);

       recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(
                        this,
                        LinearLayoutManager.VERTICAL,
                        false
                )
        );

        productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);

    }

    private void mt(String s) {
        Toast.makeText(this,s, Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       /* if(data==null)
        {
            return;
        }
        Bundle productBundle=data.getExtras();
        newPro=Integer.parseInt(productBundle.getString("productNo"));
        newStock=Integer.parseInt(productBundle.getString("productTitle"));
        newTitle=productBundle.getString("productStock");
        newDsc=productBundle.getString("productDescription");*/


    }
}


   /*    productList.add(
                new Product(
                     01,10,"philips","aksjkasjksj"
                )
        );
        productList.add(new Product(01, 10, "Mahrashtra",  "Economical capital of India, Corporate, Bollywood, Sea, Humidity, Rush, FAst, Safe"));
        productList.add(new Product(01 ,10, "Delhi",  "Capital of India, Foody"));
        productList.add(new Product(01, 10, "Tamilnadu",  "Capital of Tamilnadu, Nice CIty, bad weather"));

       recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(
                        this,
                        LinearLayoutManager.HORIZONTAL,
                        false)
        );
        productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);
    }


}*/