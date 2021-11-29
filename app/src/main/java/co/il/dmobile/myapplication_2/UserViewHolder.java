package co.il.dmobile.myapplication_2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    public CardView Card;
    public ImageView Avatar;
    public TextView Name;
    public TextView Email;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        Card = itemView.findViewById(R.id.card);
        Avatar = itemView.findViewById(R.id.avatar);
        Name = itemView.findViewById(R.id.name);
        Email = itemView.findViewById(R.id.email);

    }
}

