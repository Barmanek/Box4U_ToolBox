package com.box4utoolbox.ui.ustawienia_lasera;

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

public class Ustawienia_laseraFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_ustawienia_lasera, container, false);
        final TextView textView = root.findViewById(R.id.text_ustawienia_lasera);
        return root;
    }
}