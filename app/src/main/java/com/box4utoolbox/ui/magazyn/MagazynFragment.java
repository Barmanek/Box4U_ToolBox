package com.box4utoolbox.ui.magazyn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.box4utoolbox.R;

public class MagazynFragment extends Fragment {

    private MagazynViewModel magazynViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        magazynViewModel =
                new ViewModelProvider(this).get(MagazynViewModel.class);
        View root = inflater.inflate(R.layout.fragment_magazyn, container, false);
        final TextView textView = root.findViewById(R.id.text_magazyn);
        magazynViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}