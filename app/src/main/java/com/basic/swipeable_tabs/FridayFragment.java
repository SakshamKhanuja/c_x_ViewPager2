package com.basic.swipeable_tabs;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FridayFragment extends Fragment {

    public FridayFragment() {
        super(R.layout.layout_item_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textView = view.findViewById(R.id.text_weekday);
        textView.setText(R.string.friday);
    }
}
