package com.ariavgroup.damri.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.ariavgroup.damri.R;
import com.ariavgroup.damri.presenter.OriginPresenter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private OriginPresenter originPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        originPresenter = new OriginPresenter();
        originPresenter.getData(getApplicationContext(), rv);
    }

    private void initView() {
        rv = findViewById(R.id.rv);
    }
}