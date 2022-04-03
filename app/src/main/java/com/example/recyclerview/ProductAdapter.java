package com.example.recyclerview;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private ArrayList<String> productList;

    public ProductAdapter(ArrayList<String> productList){
        this.productList=productList;
    }



    public class ProductViewHolder extends RecyclerView.ViewHolder{
        public TextView txtProduct;

        public ProductViewHolder(View itemView){
            super(itemView);
            this.txtProduct=(TextView)itemView;                 //to desplay the view holder

        }
    }

    @Override
    public int getItemCount() {
        if (productList==null)
        {
            return 0;
        }
        return productList.size();
    }

    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        log("onCreateViewHolder");

        TextView txtProduct = new TextView(parent.getContext());
        txtProduct.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );
        txtProduct.setTextSize(30);
        txtProduct.setPadding(20, 10, 20, 10);

        return new ProductViewHolder(txtProduct);
    }
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        log("onBindViewHolder");
       holder.txtProduct.setText(productList.get(position));
    }

    private void log(String text) {
        Log.e("tag", text);
    }
}




