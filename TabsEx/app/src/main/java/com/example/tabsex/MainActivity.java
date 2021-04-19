package com.example.tabsex;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab=findViewById(R.id.tab);
        vp=findViewById(R.id.vp);
        vp.setAdapter(new MyAdapter(getSupportFragmentManager()));
        tab.setupWithViewPager(vp);
    }
    public class MyAdapter extends FragmentPagerAdapter{
        String[] title={"Chat","Status","Call"};
        public MyAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new ChatFragment();
            }
            if (position == 1) {
                return new StatusFragment();
            }
            if(position==2)
            {
                return new CallFragment();
            }
            return null;
        }
        @Override
        public int getCount() {
            return title.length;
        }


        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }
}