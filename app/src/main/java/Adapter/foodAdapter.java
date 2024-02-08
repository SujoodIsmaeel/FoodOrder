package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodorder.R;

import java.util.ArrayList;

import Domain.CafeteriesDomain;
import Domain.FoodDomain;


public class foodAdapter extends RecyclerView.Adapter<foodAdapter.ViewHolder> {
ArrayList<FoodDomain> cafeteriesDomain;

    public foodAdapter(ArrayList<FoodDomain> FoodDomain) {
        this.cafeteriesDomain = cafeteriesDomain;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_list,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
 holder.categoryName.setText(cafeteriesDomain.get(position).getTitle());
   String picUrl="" ;

       switch (position){
           case 0:{
            picUrl= "btn_1";
            break;
         } /*case 1:{
               picUrl= "";
               break;
           } case 2:{
               picUrl= "";
               break;
           } case 3:{
               picUrl= "";
               break;
           }*/
         }
         int drawableReourceId=holder.itemView.getContext()
                 .getResources().getIdentifier(picUrl,"drawable",holder.itemView.
                         getContext().getPackageName());
       // Instant Glide = null;
        Glide.with(holder.itemView.getContext())
                .load(drawableReourceId)
                .into(holder.categoryPicture);
    }

    @Override
    public int getItemCount() {return cafeteriesDomain.size();}

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView categoryName;
        ImageView categoryPicture;
        ConstraintLayout mainLayout ;

        public ViewHolder( View itemView){
            super(itemView);
            categoryName=itemView.findViewById(R.id.categoryName);
            categoryPicture= itemView.findViewById(R.id.categoryPicture);
            mainLayout = itemView.findViewById(R.id.mainLayout);

        }

    }

}
