package io.github.keddnyo.miyolla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import io.github.keddnyo.miyolla.local.adapters.FeedAdapter;
import io.github.keddnyo.miyolla.remote.requests.FirmwareRequest;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView feed = findViewById(R.id.feed_recycler_view);
        FeedAdapter adapter = new FeedAdapter();
        feed.setAdapter(adapter);

        new FirmwareRequest(adapter).getFirmwareList();
    }
}