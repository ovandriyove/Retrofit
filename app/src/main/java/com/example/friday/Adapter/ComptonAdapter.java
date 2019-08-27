package com.example.friday.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.friday.Model.ComptonModel;
import com.example.friday.R;

import java.util.ArrayList;

public class ComptonAdapter extends RecyclerView.Adapter<ComptonAdapter.ComptonViewHolder> {

    private ArrayList<ComptonModel> mComptonList;
    public ComptonAdapter (ArrayList<ComptonModel> listCompton){
        mComptonList = listCompton;
    }

    public class ComptonViewHolder extends RecyclerView.ViewHolder {
        public TextView userId;
        public TextView id;
        public TextView title;
        public TextView completed;

        public ComptonViewHolder(@NonNull View itemView) {
            super(itemView);
            userId = itemView.findViewById(R.id.text_userId);
            id = itemView.findViewById(R.id.text_id);
            title = itemView.findViewById(R.id.text_title);
            completed = itemView.findViewById(R.id.text_completed);
        }
    }

    @NonNull
    @Override
    public ComptonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_compton, parent, false);
        ComptonViewHolder comptonViewHolder = new ComptonViewHolder(view);
        return comptonViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ComptonViewHolder holder, int position) {
        final ComptonModel currentItem = mComptonList.get(position);
        holder.userId.setText(currentItem.getUserId());
        holder.id.setText(currentItem.getId());
        holder.title.setText(currentItem.getTitle());
        holder.completed.setText(currentItem.getCompleted());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
