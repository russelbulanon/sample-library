package com.monstarlab.mylibrary.utils.rx.internet;

import io.reactivex.Completable;

public interface RxInternet {

    Completable hasInternetConnection();
}
