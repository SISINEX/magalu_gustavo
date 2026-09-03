package com.example.magalu_gustavo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;

public class ProductListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        
        View backButton = findViewById(R.id.backButton);
        if (backButton != null) {
            backButton.setOnClickListener(v -> finish());
        }

        // Navigation for items in the grid
        ViewGroup productGrid = findViewById(R.id.productListGrid);
        if (productGrid != null) {
            for (int i = 0; i < productGrid.getChildCount(); i++) {
                View child = productGrid.getChildAt(i);
                child.setOnClickListener(v -> {
                    Intent intent = new Intent(ProductListActivity.this, ProductDetailActivity.class);
                    startActivity(intent);
                });
            }
        }
    }
}