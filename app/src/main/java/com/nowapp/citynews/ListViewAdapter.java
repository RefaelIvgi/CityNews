package com.nowapp.citynews;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    Context mcontext;
    LayoutInflater inflater;
    List<Model> modelList;
    ArrayList<Model> arrayList;

    public ListViewAdapter(Context context, List<Model> modelList) {
        mcontext = context;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mcontext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modelList);
    }


    public class ViewHolder{
        TextView mTitleTv,mDescTv;
        ImageView mIconIv;
    }


    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row , null);

            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        holder.mTitleTv.setText(modelList.get(position).getTitle());
        holder.mDescTv.setText(modelList.get(position).getDesc());
        holder.mIconIv.setImageResource(modelList.get(position).getIcon());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (modelList.get(position).getTitle().equals("????????????")){
                    Intent i = new Intent(mcontext , ofakimpage.class);
                    mcontext.startActivity(i);
                }

                if (modelList.get(position).getTitle().equals("?????? ??????????")){
                    Intent i = new Intent(mcontext , oryehudapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ??????????")){
                    Intent i = new Intent(mcontext , orakivapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????")){
                    Intent i = new Intent(mcontext , eilatpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????")){
                    Intent i = new Intent(mcontext , eladpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext , arielpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext , ashdodpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????????")){
                    Intent i = new Intent(mcontext , ashkelonpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ????????")){
                    Intent i = new Intent(mcontext , beeryakov.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ??????")){
                    Intent i = new Intent(mcontext , beersheva.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ??????")){
                    Intent i = new Intent(mcontext , betsheanpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ??????")){
                    Intent i = new Intent(mcontext , betshemeshpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???????? ??????????")){
                    Intent i = new Intent(mcontext , betarpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ??????")){
                    Intent i = new Intent(mcontext , bnebrakpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ????????")){
                    Intent i = new Intent(mcontext , bneaishpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???? ????")){
                    Intent i = new Intent(mcontext , batyampage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???????? ????????")){
                    Intent i = new Intent(mcontext , givatbrenerpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???????? ??????")){
                    Intent i = new Intent(mcontext ,givatzeevpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???????? ??????????")){
                    Intent i = new Intent(mcontext ,givatshmuelpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????????")){
                    Intent i = new Intent(mcontext ,givataimpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????")){
                    Intent i = new Intent(mcontext ,gederapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???? ????????")){
                    Intent i = new Intent(mcontext ,ganyavnepage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????????")){
                    Intent i = new Intent(mcontext ,dimonapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ??????????")){
                    Intent i = new Intent(mcontext ,hodhasharonpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????????")){
                    Intent i = new Intent(mcontext ,herzeliyapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ????????")){
                    Intent i = new Intent(mcontext ,zihronyakovpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????")){
                    Intent i = new Intent(mcontext ,haderapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,hulonpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????")){
                    Intent i = new Intent(mcontext ,haifapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,tveriapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???????? ??????????")){
                    Intent i = new Intent(mcontext ,tirathakarmelpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????")){
                    Intent i = new Intent(mcontext ,yavnepage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???? ????????????")){
                    Intent i = new Intent(mcontext ,yadbinyaminpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????")){
                    Intent i = new Intent(mcontext ,yahudpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,yokneampage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,yeruhampage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????????")){
                    Intent i = new Intent(mcontext ,jerusalempage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ??????")){
                    Intent i = new Intent(mcontext ,kfarhabadpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ??????")){
                    Intent i = new Intent(mcontext ,kfarsabapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????????")){
                    Intent i = new Intent(mcontext ,karmielpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,lehavimpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????")){
                    Intent i = new Intent(mcontext ,ludpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ????????")){
                    Intent i = new Intent(mcontext ,mevaseretpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????????")){
                    Intent i = new Intent(mcontext ,modiinpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ????????")){
                    Intent i = new Intent(mcontext ,mazkeretbatyapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,metulapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???????? ????????????")){
                    Intent i = new Intent(mcontext ,maaleadumimpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???????? ????????")){
                    Intent i = new Intent(mcontext ,mizperamonpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,nahariapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????")){
                    Intent i = new Intent(mcontext ,nitzanpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???? ??????????")){
                    Intent i = new Intent(mcontext ,neszionapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???????? ??????????")){
                    Intent i = new Intent(mcontext ,nazratelitpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????")){
                    Intent i = new Intent(mcontext ,nesherpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????????")){
                    Intent i = new Intent(mcontext ,netivotpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,natanyapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????")){
                    Intent i = new Intent(mcontext ,akopage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,afulapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???????? ??????")){
                    Intent i = new Intent(mcontext ,pardeshanapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ??????????")){
                    Intent i = new Intent(mcontext ,petahtikvapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????????")){
                    Intent i = new Intent(mcontext ,kesaryapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ??????")){
                    Intent i = new Intent(mcontext ,atapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ????????????")){
                    Intent i = new Intent(mcontext ,bialikpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ????")){
                    Intent i = new Intent(mcontext ,gatpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ????????????")){
                    Intent i = new Intent(mcontext ,moskinpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ??????????")){
                    Intent i = new Intent(mcontext ,malahipage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ??????????")){
                    Intent i = new Intent(mcontext ,ekronpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ??????????")){
                    Intent i = new Intent(mcontext ,shmonapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ????????")){
                    Intent i = new Intent(mcontext ,roshainpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ????????")){
                    Intent i = new Intent(mcontext ,roshpinapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????????? ??????????")){
                    Intent i = new Intent(mcontext ,rishonpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????????")){
                    Intent i = new Intent(mcontext ,rehovotpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????")){
                    Intent i = new Intent(mcontext ,ramlepage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ????")){
                    Intent i = new Intent(mcontext ,ramatganpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("?????? ??????????")){
                    Intent i = new Intent(mcontext ,ramathasharonpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,rananapage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("??????????")){
                    Intent i = new Intent(mcontext ,sderotpage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("????????")){
                    Intent i = new Intent(mcontext ,shoampage.class);
                    mcontext.startActivity(i);
                }
                if (modelList.get(position).getTitle().equals("???? ????????")){
                    Intent i = new Intent(mcontext ,telavivpage.class);
                    mcontext.startActivity(i);
                }

            }
        });

        return view;
    }

    public void filter (String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if (charText.length() == 0){
            modelList.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault()).contains(charText)){
                    modelList.add(model);
                }
            }
        }
        notifyDataSetChanged();

    }

}
