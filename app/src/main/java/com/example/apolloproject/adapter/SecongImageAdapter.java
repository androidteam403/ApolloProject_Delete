package com.example.apolloproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apolloproject.ImageModal;
import com.example.apolloproject.ImageModal1;
import com.example.apolloproject.R;
import com.example.apolloproject.databinding.Image2Binding;
import com.example.apolloproject.databinding.ImageBinding;

import java.util.ArrayList;
import java.util.List;

public class SecongImageAdapter  extends  RecyclerView.Adapter<SecongImageAdapter.ViewHolder> {
    private List<ImageModal1> imagelist = new ArrayList<>();

    public SecongImageAdapter(List<ImageModal1> imagelist)
    {
        this.imagelist = imagelist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        Image2Binding binding= DataBindingUtil.inflate(inflater,R.layout.image2,parent,false);
        return  new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ImageModal1 imageModal1 = imagelist.get(position);
        holder.image2Binding.imageRec1.setImageResource(imageModal1.getImage());
        holder.image2Binding.textView1.setText(imageModal1.getName());

    }

    @Override
    public int getItemCount() {
        return imagelist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public Image2Binding image2Binding;
        public ViewHolder(@NonNull Image2Binding image2Binding) {
            super(image2Binding.getRoot());
            this.image2Binding=image2Binding;

        }
    }
}
