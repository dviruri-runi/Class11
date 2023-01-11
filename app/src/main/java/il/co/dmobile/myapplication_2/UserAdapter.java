package il.co.dmobile.myapplication_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact,parent,false);
        UserViewHolder viewHolder = new UserViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.avatar.setImageResource(R.drawable.logo);
        holder.name.setText("Conact 1");
        holder.email.setText("contact1@post.runi.ac.il");
    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
