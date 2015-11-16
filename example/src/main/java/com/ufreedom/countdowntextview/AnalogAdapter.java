package com.ufreedom.countdowntextview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Author UFreedom
 * Date : 2015 十月 29
 */
public class AnalogAdapter extends RecyclerView.Adapter<AnalogHolder> {

    private List<AnalogData> datas;

    public AnalogAdapter(List<AnalogData> analogDatas) {
        datas = analogDatas;
    }

    @Override
    public AnalogHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_yummy_pic, parent, false);
        return new AnalogHolder(view);
    }

    @Override
    public void onBindViewHolder(AnalogHolder holder, int position) {
        holder.onBindView(datas.get(position));
    }


    @Override
    public int getItemCount() {
        return datas.size();
    }
}
