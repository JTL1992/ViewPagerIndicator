package com.alizbeo.myviewpagerdemo;

import android.app.ActionBar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.shizhefei.view.indicator.Indicator;
import com.shizhefei.view.indicator.IndicatorViewPager;

import java.util.zip.Inflater;

import static com.alizbeo.myviewpagerdemo.R.id.guide_indicator;


public class MainActivity extends ActionBarActivity {
    private IndicatorViewPager indicatorViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ViewPager viewPager = (ViewPager) findViewById(R.id.guide_viewPager);
        Indicator indicator = (Indicator) findViewById(guide_indicator);
        indicatorViewPager = new IndicatorViewPager(indicator,viewPager);
        indicatorViewPager.setAdapter(adapter);

    }
    private IndicatorViewPager.IndicatorViewPagerAdapter adapter = new IndicatorViewPager.IndicatorViewPagerAdapter() {
        private int[] imageIds = {R.mipmap.p1,R.mipmap.p2,R.mipmap.p3,R.mipmap.p4};
        @Override
        public int getCount() {
            return imageIds.length;
        }

        @Override
        public View getViewForTab(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater =  LayoutInflater.from(getApplicationContext());
            if (null == view){
               view = layoutInflater.inflate(R.layout.tab_guide,viewGroup,false);
            }
            return view;
        }

        @Override
        public View getViewForPage(int i, View view, ViewGroup viewGroup) {
            if (null == view){
                view = new View(getApplicationContext());
                view.setLayoutParams(new ViewGroup.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
            }
            view.setBackgroundResource(imageIds[i]);
            return view;
        }
    };

}
