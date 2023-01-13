package io.github.keddnyo.miyolla.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.progressindicator.LinearProgressIndicator;

import io.github.keddnyo.miyolla.R;
import io.github.keddnyo.miyolla.local.adapters.FeedAdapter;
import io.github.keddnyo.miyolla.remote.requests.FirmwareRequest;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView feed = findViewById(R.id.feedRecyclerView);
        LinearProgressIndicator progressBar = findViewById(R.id.progressBar);

        FeedAdapter adapter = new FeedAdapter();
        feed.setAdapter(adapter);

        new FirmwareRequest(adapter, progressBar).getFirmwareList();
    }
}