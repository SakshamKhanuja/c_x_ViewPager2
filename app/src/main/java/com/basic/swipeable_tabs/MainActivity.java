package com.basic.swipeable_tabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.basic.swipeable_tabs.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate((LayoutInflater)
                getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        setContentView(binding.getRoot());

        // ViewPager2 allows built-in swipe gestures to transition through screens / Fragments.
        binding.viewPager.setAdapter(
                new WeekdayAdapter(getSupportFragmentManager(), getLifecycle()));

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(binding.tabLayout,
                binding.viewPager, ((tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText(R.string.tab_monday);
                    break;

                case 1:
                    tab.setText(R.string.tab_tuesday);
                    break;

                case 2:
                    tab.setText(R.string.tab_wednesday);
                    break;

                case 3:
                    tab.setText(R.string.tab_thursday);
                    break;

                case 4:
                    tab.setText(R.string.tab_friday);
                    break;

                default:
                    break;
            }
        }));

        // Attach TabLayoutMediator to ViewPager2
        tabLayoutMediator.attach();
    }
}