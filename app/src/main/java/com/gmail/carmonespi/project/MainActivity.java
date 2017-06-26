package com.gmail.carmonespi.project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.eftimoff.viewpagertransformers.RotateDownTransformer;
import com.gmail.carmonespi.project.firstlog.Account;
import com.gmail.carmonespi.project.firstlog.PrimerPantalla;
import com.gmail.carmonespi.project.firstlog.SegundaPantalla;
import com.gmail.carmonespi.project.firstlog.TercerPantalla;
import com.gmail.carmonespi.project.util.pagetransformer.DepthPageTransformer;

public class MainActivity extends FragmentActivity{
    private RadioButton [] radios;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setPageTransformer(true , new DepthPageTransformer());

        radios = new RadioButton[4];

        radios[0] = (RadioButton) findViewById(R.id.primaraPagina);
        radios[1] = (RadioButton) findViewById(R.id.segundaPagina);
        radios[2] = (RadioButton) findViewById(R.id.tercerPagina);
        radios[3] = (RadioButton) findViewById(R.id.accout);


        radios[0].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mPager.setCurrentItem(0);
                }
            }
        });

        radios[1].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mPager.setCurrentItem(1);
                }
            }
        });

        radios[2].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mPager.setCurrentItem(2);
                }
            }
        });

        radios[3].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mPager.setCurrentItem(3);
                }
            }
        });



    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        private Fragment [] pantallas = {
            new PrimerPantalla(),
            new SegundaPantalla(),
            new TercerPantalla(),
            new Account()
        };

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return pantallas[position];
        }

        @Override
        public int getCount() {
            return pantallas.length;
        }

        @Override
        public void setPrimaryItem(ViewGroup container, int position, Object object) {
            super.setPrimaryItem(container, position, object);

            if(!radios[position].isChecked()){
                radios[position].setChecked(true);
            }

        }
    }

}