package com.box4utoolbox.ui.magazyn;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MagazynViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MagazynViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tu bedzie spis przedmiotow");
    }

    public LiveData<String> getText() {
        return mText;
    }
}