package com.mulyadifamily.bisyaraapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mulyadifamily.bisyaraapp.AbjadActivity;
import com.mulyadifamily.bisyaraapp.AngkaActivity;
import com.mulyadifamily.bisyaraapp.Kata_Activity;
import com.mulyadifamily.bisyaraapp.PercakapanActivity;
import com.mulyadifamily.bisyaraapp.R;
import com.mulyadifamily.bisyaraapp.BulanActivity;
import com.mulyadifamily.bisyaraapp.HariActivity;
import com.mulyadifamily.bisyaraapp.TanyaActivity;
import com.mulyadifamily.bisyaraapp.WarnaActivity;
import com.mulyadifamily.bisyaraapp.model.dashboard;

import java.util.List;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.MyViewHolder> {
    private Context mContext;
    private List<dashboard> dashboardList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvtitle;
        ImageView imgMenu;
        CardView cdview;
        public MyViewHolder(View view) {
            super(view);
            tvtitle = (TextView) view.findViewById(R.id.tvmenutitle);
            imgMenu=(ImageView)view.findViewById(R.id.imgmenu);
            cdview = (CardView) view.findViewById(R.id.card_view);
        }
    }

    public DashboardAdapter(Context mContext, List<dashboard> dashboardList) {
        this.mContext = mContext;
        this.dashboardList = dashboardList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.raw_menu, parent, false);
        return new MyViewHolder(itemView);

    }
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        //FetchImages();
        //imageserver=imageList;
//        tf = Typeface.createFromAsset(mContext.getAssets(), "fonts/saira_regular.ttf");
//        tf = Typeface.createFromAsset(mContext.getAssets(), "fonts/proximanovaregular.ttf");
//        holder.tvtitle.setTypeface(tf);
        final dashboard dashboard = dashboardList.get(position);
        holder.tvtitle.setText(dashboard.getTitle());
        Glide.with(mContext)
                .load(dashboard.getImg())
                .into(holder.imgMenu);
        holder.cdview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                switch (position){
                    case 0 :
                        intent = new Intent(mContext, AbjadActivity.class);
                        break;
                    case 1 :
                        intent = new Intent(mContext, AngkaActivity.class);
                        break;
                    case 2 :
                        intent = new Intent(mContext, BulanActivity.class);
                        break;
                    case 3 :
                        intent = new Intent(mContext, HariActivity.class);
                        break;
                    case 4 :
                        intent = new Intent(mContext, TanyaActivity.class);
                        break;
                    case 5 :
                        intent = new Intent(mContext, WarnaActivity.class);
                        break;
                    case 6 :
                        intent = new Intent(mContext, PercakapanActivity.class);
                        break;
                    case 7 :
                        intent = new Intent(mContext, Kata_Activity.class);
                        break;

                }
                mContext.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return dashboardList.size();
    }
}
