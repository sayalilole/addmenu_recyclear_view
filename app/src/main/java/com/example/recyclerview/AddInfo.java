package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddInfo extends AppCompatActivity {
    private EditText editTextProduct,editTextTitle,editTextDescription,editTextStock;
    Button btnAdd , btnDone;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_info);
        init();
        btnDone.setOnClickListener(new OnAddProductClickListener());

        }


    private  class OnAddProductClickListener implements View.OnClickListener{
    @Override
        public void onClick(View view) {
        Intent intent = new Intent(AddInfo.this, MainActivity.class);

        intent.putExtra(Constants.KEY_TITLE, editTextProduct.getText().toString());
        intent.putExtra(Constants.KEY_TYPE, editTextStock.getText().toString());

        //startActivity(intent);
        startActivityForResult(intent, 1);


       /* Intent intent=new Intent(AddInfo.this,MainActivity.class);
        intent.putExtra("productNo",editTextProduct.getText().toString());
        intent.putExtra("productTitle",editTextTitle.getText().toString());
        intent.putExtra("productStock",editTextStock.getText().toString());
        intent.putExtra("productDescription",editTextDescription.getText().toString());
        startActivityForResult(intent,1);*/
        }
    }

    public void init(){
        editTextDescription=findViewById(R.id.edtTextDiscription);
        editTextTitle=findViewById(R.id.editTextTitle);
        editTextProduct=findViewById(R.id.edtTextProduct);
        editTextStock=findViewById(R.id.editTextStock);
        btnAdd=findViewById(R.id.btnAdd);
        btnDone=findViewById(R.id.btnDone);
    }

}
