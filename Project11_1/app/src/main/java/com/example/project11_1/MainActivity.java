package com.example.project11_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("그리드뷰 영화 포스터");

        final GridView gv=(GridView) findViewById(R.id.gridView1);
        MyGridAdapter gAdapter=new MyGridAdapter(this);
        gv.setAdapter(gAdapter);


    }

    public class MyGridAdapter extends BaseAdapter{
        Context context;
        public MyGridAdapter(Context c){
            context=c;
        }
        public int getCount(){
            return posterID.length;
        }
        public Object getItem(int arg0){
            return null;
        }
        public long getItemId(int arg0){
            return 0;
        }
        Integer[] posterID={
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background
                };
        public View getView(int position, View covertView, ViewGroup parent){
            ImageView imageView=new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(200,300));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(5,5,5,5);

            imageView.setImageResource(posterID[position]);

            final int pos=position;
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    View dialogView=(View) View.inflate(MainActivity.this,R.layout.dialog,null);
                    ImageView ivPoster=(ImageView) dialogView.findViewById(R.id.ivPoster);
                    ivPoster.setImageResource(posterID[pos]);
                    AlertDialog.Builder dlg=new AlertDialog.Builder(MainActivity.this);
                    dlg.setTitle("큰 포스터");
                    dlg.setIcon(R.drawable.ic_launcher_background);
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기",null);
                    dlg.show();
                }
            });
            return imageView;
        }

    }
}