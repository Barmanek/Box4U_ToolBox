package com.box4utoolbox.ui.kamera;

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

public class KameraFragment extends Fragment {

    private KameraViewModel kameraViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        kameraViewModel =
                new ViewModelProvider(this).get(KameraViewModel.class);
        View root = inflater.inflate(R.layout.fragment_kamera, container, false);
        final TextView textView = root.findViewById(R.id.text_kamera);
        kameraViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}