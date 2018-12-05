package com.example.taruc.roomwordssample;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;

    private LiveData<Word> mAllWords;

    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<Word> getAllWords() { return mAllWords; }

    public void insert(Word word) { mRepository.insert(word); }
}