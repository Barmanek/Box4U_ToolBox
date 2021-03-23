package com.box4utoolbox.ui.cennik;

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
import com.box4utoolbox.ui.cennik.CennikViewModel;

public class CennikFragment extends Fragment{

    private CennikViewModel cennikViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cennikViewModel=
                new ViewModelProvider(this).get(CennikViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cennik, container, false);
        final TextView textView = root.findViewById(R.id.text_cennik);
        cennikViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
