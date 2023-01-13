package io.github.keddnyo.miyolla.local.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import io.github.keddnyo.miyolla.R;
import io.github.keddnyo.miyolla.local.entities.FeedEntity;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedViewHolder> {

    final ArrayList<FeedEntity> feedEntities = new ArrayList<>();

    public static class FeedViewHolder extends RecyclerView.ViewHolder {
        final ImageView feedIcon;
        final TextView title, subtitle, additionalTag;

        public FeedViewHolder(@NonNull View itemView) {
            super(itemView);
            this.feedIcon = itemView.findViewById(R.id.feedIcon);
            this.title = itemView.findViewById(R.id.feedTitle);
            this.subtitle = itemView.findViewById(R.id.feedSubtitle);
            this.additionalTag = itemView.findViewById(R.id.feedAdditionalTag);
        }
    }

    @NonNull
    @Override
    public FeedAdapter.FeedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FeedViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.entity_feed, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull FeedAdapter.FeedViewHolder holder, int position) {
        FeedEntity feedEntity = feedEntities.get(position);

        holder.feedIcon.setImageResource(feedEntity.source.deviceIcon);
        holder.title.setText(feedEntity.source.deviceName);
        holder.subtitle.setText(feedEntity.remote.firmwareVersion);
        holder.additionalTag.setText(feedEntity.source.tag);
    }

    @Override
    public int getItemCount() {
        return feedEntities.size();
    }

    public void addItem(FeedEntity feedEntity) {
        feedEntities.add(feedEntity);
        notifyItemInserted(getItemCount());
    }

}
