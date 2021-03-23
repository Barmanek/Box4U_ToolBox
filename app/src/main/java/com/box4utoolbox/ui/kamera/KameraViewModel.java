package com.box4utoolbox.ui.kamera;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KameraViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KameraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tu bedzie podglad kamery");
    }

    public LiveData<String> getText() {
        return mText;
    }
}