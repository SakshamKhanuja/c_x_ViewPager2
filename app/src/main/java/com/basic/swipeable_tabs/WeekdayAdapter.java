package com.basic.swipeable_tabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * Provides Fragments to a ViewPager.
 */
public class WeekdayAdapter extends FragmentStateAdapter {

    public WeekdayAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new MondayFragment();

            case 1:
                return new TuesdayFragment();

            case 2:
                return new WednesdayFragment();

            case 3:
                return new ThursdayFragment();

            case 4:
                return new FridayFragment();

            default:
                // Empty Fragment
                return new Fragment(R.layout.layout_item_fragment);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}