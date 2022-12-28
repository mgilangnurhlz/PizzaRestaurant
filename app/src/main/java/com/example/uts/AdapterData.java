package com.example.uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {
    List<DataModel> listData;
    LayoutInflater inflater;

    public AdapterData(Context context, List<DataModel> listData) {
        this.listData = listData;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_data, parent, false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        holder.txtData.setText(listData.get(position).getFoodName());
        holder.txtData2.setText(listData.get(position).getDetails());
        holder.txtData3.setText(listData.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView txtData;
        TextView txtData2;
        TextView txtData3;

        public HolderData(@NonNull View itemView){
            super(itemView);
            txtData = itemView.findViewById(R.id.foodName);
            txtData2 = itemView.findViewById(R.id.detail);
            txtData3 = itemView.findViewById(R.id.price);
        }

    }
}
