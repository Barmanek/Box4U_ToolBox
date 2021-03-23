package com.box4utoolbox.ui.ustawienia_lasera;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Ustawienia_laseraViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Ustawienia_laseraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tu bedzie lista ustawien lasera");
    }

    public LiveData<String> getText() {
        return mText;
    }
}