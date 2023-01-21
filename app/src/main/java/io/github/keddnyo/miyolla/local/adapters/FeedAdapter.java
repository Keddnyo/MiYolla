package io.github.keddnyo.miyolla.local.adapters;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import io.github.keddnyo.miyolla.R;
import io.github.keddnyo.miyolla.local.entities.Feed;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedViewHolder> {
    final ArrayList<Feed> feedEntities = new ArrayList<>();

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
        Feed feed = feedEntities.get(position);

        if (feed.getHasError()) {
            holder.feedIcon.setImageResource(R.drawable.unknown);
            holder.title.setText(R.string.error_has_occurred);
            holder.subtitle.setText(R.string.error_try_again_later);
            holder.additionalTag.setText(R.string.tag_empty);
        } else {
            holder.feedIcon.setImageResource(feed.getIcon());
            holder.title.setText(feed.getTitle());
            holder.subtitle.setText(feed.getSubtitle());
            holder.additionalTag.setText(holder.additionalTag.getContext().getString(feed.getTag()));
        }
    }

    @Override
    public int getItemCount() {
        return feedEntities.size();
    }

    public void addItem(Feed feed) {
        feedEntities.add(feed);
        notifyItemInserted(getItemCount());
    }
}
