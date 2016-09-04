package com.example.wzb97.activitylife_homework8;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by wzb97 on 2016/8/31.
 */
public class MainActivity extends Activity {
    final String TAG="Info:";
    TextView t;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.textView6);
        Log.i(TAG,"onCreate");
        t.setText(t.getText()+  "\nonCreate");
        Button btn=(Button)findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this).setTitle("消息").setMessage("None").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).show();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.i(TAG,"onStart");
        t.setText(t.getText()+  "\nonStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG,"\nonRestart");
        t.setText(t.getText()+  "\nonRestart");
        super.onRestart();
    }
    @Override
    protected void onResume() {
        Log.i(TAG,"onResume");
        t.setText(t.getText()+  "\nonResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG,"onPause");
        t.setText(t.getText()+  "\nonPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG,"onStop");
        t.setText(t.getText()+  "\nonStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,"onDestroy");
        t.setText(t.getText()+  "\nonDestroy");
        super.onDestroy();
    }
}
