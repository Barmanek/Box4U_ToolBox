package com.box4utoolbox.ui.cennik;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CennikViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CennikViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Zawartosc cennika");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
