package com.alizbeo.myviewpagerdemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * 主程序负责导入各种样板
 */
public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private Button btnGuide,btnMoreTab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**点击事件响应
     * @param v 点击的view
     */
    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent();
        switch (id){
            case R.id.btn_guide :
                intent.setClass(this, GuideActivity.class);
                startActivity(intent);
            case R.id.btn_moretab :
                intent.setClass(this, GuideActivity.class);
                startActivity(intent);
        }
    }
}
