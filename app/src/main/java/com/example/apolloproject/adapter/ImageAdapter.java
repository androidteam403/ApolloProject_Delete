package com.example.apolloproject.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.library.baseAdapters.BR;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apolloproject.ImageModal;
import com.example.apolloproject.R;
import com.example.apolloproject.ShopCategory;
import com.example.apolloproject.databinding.ImageBinding;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {
    private List<ImageModal> imagelist = new ArrayList<>();
    public ImageBinding binding;
    public ImageAdapter(List<ImageModal> imagelist, ShopCategory shopCategory) {
        this.imagelist = imagelist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        ImageBinding binding= DataBindingUtil.inflate(inflater,R.layout.image,parent,false);
        return  new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ImageModal imageModal = imagelist.get(position);
        holder.binding.imageRec.setImageResource(imageModal.getImage());
        holder.binding.textView.setText(imageModal.getText());
        holder.binding.circleNumber.setText(imageModal.getText());
    }

    @Override
    public int getItemCount() {
        return imagelist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageBinding binding;
        public ViewHolder(@NonNull ImageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


    }


}
