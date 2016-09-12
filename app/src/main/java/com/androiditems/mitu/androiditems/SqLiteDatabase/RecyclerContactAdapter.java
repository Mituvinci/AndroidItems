package com.androiditems.mitu.androiditems.SqLiteDatabase;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androiditems.mitu.androiditems.R;

import java.util.List;

/**
 * Created by Hi on 13-Sep-16.
 */
public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.CustomViewHolder>  {
    private List<NameModel> mDataSet;
    private Context mContext;
    private static customInterface1 customInterface;
    public RecyclerContactAdapter(Context context, List<NameModel>mDataSet) {
        this.mDataSet = mDataSet;
        mContext  = context;
        Log.d("recycler :", mDataSet.size() + "");


    }
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_phonebook,parent,false);
        CustomViewHolder customViewHolder = new CustomViewHolder(view);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder,final int position) {
        holder.mNameTextView.setText(mDataSet.get(position).getName());
        Log.d("contact :", position + " " + mDataSet.get(position) + "");

    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public static class  CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mNameTextView;
        public CustomViewHolder(View itemView) {
            super(itemView);
            mNameTextView = (TextView) itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            customInterface.onItemClick(getAdapterPosition(),v);

        }
    }

    public void setOnItemClickListener(customInterface1 clickListener){
        this.customInterface = clickListener;
    }

    public interface customInterface1{
        void onItemClick(int position, View v);    }
}
