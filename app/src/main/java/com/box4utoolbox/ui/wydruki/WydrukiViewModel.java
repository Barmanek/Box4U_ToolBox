package com.box4utoolbox.ui.wydruki;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WydrukiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WydrukiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tu bedzie lista wydrukow");
    }

    public LiveData<String> getText() {
        return mText;
    }
}