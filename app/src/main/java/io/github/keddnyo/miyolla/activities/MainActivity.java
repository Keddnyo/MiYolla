package io.github.keddnyo.miyolla.activities;

import android.os.Bundle;

import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import io.github.keddnyo.miyolla.R;
import io.github.keddnyo.miyolla.local.adapters.FeedAdapter;
import io.github.keddnyo.miyolla.remote.requests.FirmwareRequest;

public class MainActivity extends AppCompatActivity {

    public ProgressBar progressBar;
    public FeedAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView feed = findViewById(R.id.feedRecyclerView);
        progressBar = findViewById(R.id.progressBar);

        adapter = new FeedAdapter();
        feed.setAdapter(adapter);

        new FirmwareRequest().getFirmwareList(this);
    }
}