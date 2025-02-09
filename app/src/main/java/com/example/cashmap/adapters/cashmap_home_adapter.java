package com.example.cashmap.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.cashmap.data.*;
import com.example.cashmap.*;

import java.util.List;

public class cashmap_home_adapter extends BaseAdapter {
    private Context context;
    private List<cashmap_home_data> ATM_List;

    public cashmap_home_adapter(Context context, List<cashmap_home_data> ATM_List){
        this.context = context;
        this.ATM_List = ATM_List;
    }

    @Override
    public int getCount() {
        return ATM_List.size();
    }

    @Override
    public Object getItem(int position) {
        return ATM_List.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder{
        TextView ATM_Location;
        TextView ATM_Status;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder ATM;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.card_home_banklist, parent, false);
            ATM = new ViewHolder();
            ATM.ATM_Location = convertView.findViewById(R.id.Card_BankList_Item_Location);
            ATM.ATM_Status = convertView.findViewById(R.id.Card_BankList_Item_Status);
            convertView.setTag(ATM);
        } else {
            ATM = (ViewHolder) convertView.getTag();
        }

        cashmap_home_data Info = ATM_List.get(position);
        ATM.ATM_Location.setText(Info.getATM_Location());
        ATM.ATM_Status.setText(Info.getATM_Status());

        return convertView;
    }
}
