package com.ariavgroup.damri.presenter;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ariavgroup.damri.adapter.OriginAdapter;
import com.ariavgroup.damri.api.ApiConfig;
import com.ariavgroup.damri.api.ApiService;
import com.ariavgroup.damri.model.DataItem;
import com.ariavgroup.damri.model.Root;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OriginPresenter {
    private ArrayList<DataItem> dataItems;
    private OriginAdapter originAdapter;
    public void getData(final Context context, final RecyclerView rv) {
        ApiService apiService = ApiConfig.getApiService();
        apiService.getData().enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                if (response.isSuccessful()) {
                    assert response.body() != null;
                    dataItems = response.body().getData();
                    originAdapter = new OriginAdapter(context, dataItems);
                    rv.setLayoutManager(new LinearLayoutManager(context));
                    rv.setAdapter(originAdapter);
                    originAdapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                Toast.makeText(context, "Errro : " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
