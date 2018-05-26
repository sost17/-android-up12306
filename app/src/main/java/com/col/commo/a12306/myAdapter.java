package com.col.commo.a12306;

/**
 * Created by commo on 2017/4/20.
 */
        import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class myAdapter extends BaseAdapter {

    private ArrayList<HashMap<String, Object>> data;

    private LayoutInflater layoutInflater;
    private Context context;


    public myAdapter(Context context,ArrayList<HashMap<String, Object>> data) {

        this.context = context;
        this.data = data;
        this.layoutInflater = LayoutInflater.from(context);
    }


    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return data.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        zujian zuJian = null;
        final int selectID = position;
        if(convertView==null){
            zuJian = new zujian();
            // 获取组件布局
            convertView = layoutInflater.inflate(R.layout.simple_list_item_layout, null);
            zuJian.xiala = (ImageView) convertView.findViewById(R.id.xiala);
            zuJian.img_start = (ImageView) convertView.findViewById(R.id.image_start);
            zuJian.img_end = (ImageView) convertView.findViewById(R.id.image_end);
            zuJian.chepai = (TextView) convertView.findViewById(R.id.chepai);
            zuJian.start = (TextView) convertView.findViewById(R.id.start);
            zuJian.end = (TextView) convertView.findViewById(R.id.end);
            zuJian.time = (TextView) convertView.findViewById(R.id.time);
            zuJian.start_time = (TextView) convertView.findViewById(R.id.time_start);
            zuJian.end_time = (TextView) convertView.findViewById(R.id.time_end);
            zuJian.ruanwo = (TextView) convertView.findViewById(R.id.ruanwo);
            zuJian.yingwo = (TextView) convertView.findViewById(R.id.yingwo);
            zuJian.yingzuo = (TextView) convertView.findViewById(R.id.yingzuo);
            zuJian.wuzuo = (TextView) convertView.findViewById(R.id.wuzuo);
            // tag来存储数据的。
            convertView.setTag(zuJian);
        }
        else {
            zuJian = (zujian) convertView.getTag();
        }
        // 绑定数据、以及事件触发
        zuJian.img_start.setBackgroundResource((Integer) data.get(position).get("img_Start"));
        zuJian.img_end.setBackgroundResource((Integer) data.get(position).get("img_end"));
        zuJian.chepai.setText((String)data.get(position).get("text_chepai"));
        zuJian.time.setText((String)data.get(position).get("text_time"));
        zuJian.start.setText((String)data.get(position).get("text_start"));
        zuJian.end.setText((String)data.get(position).get("text_end"));
        zuJian.start_time.setText((String)data.get(position).get("text_timestart"));
        zuJian.end_time.setText((String)data.get(position).get("text_timeend"));
        zuJian.ruanwo.setText((String)data.get(position).get("text_runwo"));
        zuJian.yingwo.setText((String)data.get(position).get("text_yingwo"));
        zuJian.yingzuo.setText((String)data.get(position).get("text_yingzuo"));
        zuJian.wuzuo.setText((String)data.get(position).get("text_wuzuo"));
        zuJian.xiala.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showInfo(position);
            }

        });
        zuJian.chepai.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showcarInfo(position);
            }

        });
        zuJian.time.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showcarInfo(position);
            }

        });
        zuJian.start.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showcarInfo(position);
            }

        });
        zuJian.end.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showcarInfo(position);
            }

        });
        zuJian.start_time.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showcarInfo(position);
            }

        });
        zuJian.end_time.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showcarInfo(position);
            }

        });
        zuJian.ruanwo.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showcarInfo(position);
            }

        });
        zuJian.yingwo.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showcarInfo(position);
            }

        });
        zuJian.yingzuo.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showcarInfo(position);
            }

        });
        zuJian.wuzuo.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                showcarInfo(position);
            }

        });



        return convertView;
    }



    public void showInfo(int clickID){

        new AlertDialog.Builder(context)

                .setTitle("列车信息")

                .setMessage("暂无"+ data.get(clickID).get("text_chepai").toString()+"列车信息")

                .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {

                    }

                })

                .show();

    }

    public void showcarInfo(int clickID){

        new AlertDialog.Builder(context)

                .setTitle("购票信息")

                .setMessage("暂无"+ data.get(clickID).get("text_chepai").toString()+"购票信息")

                .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {

                    }

                })

                .show();

    }

}
