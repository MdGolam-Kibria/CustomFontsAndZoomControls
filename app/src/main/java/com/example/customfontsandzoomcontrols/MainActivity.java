package com.example.customfontsandzoomcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
Typeface typeface;
TextView textView;
ImageView imageView;
ZoomControls zoomControls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        typeface = Typeface.createFromAsset(getAssets(),"kibria/kkk.ttf");//project a giya save korte hobe age dowonload kore
        textView = (TextView)findViewById(R.id.textStyle);
        imageView = (ImageView)findViewById(R.id.image);
        zoomControls  = (ZoomControls)findViewById(R.id.zoomControls);
        textView.setTypeface(typeface);//for font style source = https://www.fontsquirrel.com/


//        zoomControls part


        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {//jakhon joom hobe
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();
                imageView.setScaleX(x+1);
                imageView.setScaleY(y+1);
            }
        });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {//jakhon joom out korbo
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();
                if (x>1&&y>1){
                    imageView.setScaleX(x-1);
                    imageView.setScaleY(y-1);
                }
            }
        });
    }
}
