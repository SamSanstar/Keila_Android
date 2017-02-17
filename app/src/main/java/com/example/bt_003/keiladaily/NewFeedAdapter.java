package com.example.bt_003.keiladaily;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by BT-003 on 29-Jan-17.
 */
public class NewFeedAdapter extends RecyclerView.Adapter<NewFeedAdapter.ViewHolder> {

    @Override
    public NewFeedAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.new_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ModelNewFeed modelNewFeed = mModelFeed.get(position);
        TextView textdate = holder.dateView;
        textdate.setText(modelNewFeed.getTextdate());
        TextView textDecription = holder.descriptionView;
        textDecription.setText(modelNewFeed.getTextdecription());
        ImageView imageView = holder.imageView;
        imageView.setImageResource(R.drawable.ic_menu_gallery);

    }

    @Override
    public int getItemCount() {
         return mModelFeed.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView dateView;
        public TextView descriptionView;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
//            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
//            messageButton = (Button) itemView.findViewById(R.id.message_button);
            dateView = (TextView) itemView.findViewById(R.id.textdate);
            descriptionView = (TextView) itemView.findViewById(R.id.textDecription);
            imageView = (ImageView) itemView.findViewById(R.id.imageViewFeed);
        }
    }

    private List<ModelNewFeed> mModelFeed;

    private Context mContext;
    public NewFeedAdapter(Context context, List<ModelNewFeed> contacts) {
        mModelFeed = contacts;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }


}
