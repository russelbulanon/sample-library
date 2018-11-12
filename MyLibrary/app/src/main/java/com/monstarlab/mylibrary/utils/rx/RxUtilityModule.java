package com.monstarlab.mylibrary.utils.rx;

import com.monstarlab.mylibrary.utils.rx.internet.RxInternet;
import com.monstarlab.mylibrary.utils.rx.internet.RxInternetImpl;
import com.monstarlab.mylibrary.utils.rx.scheduler.RxScheduler;
import com.monstarlab.mylibrary.utils.rx.scheduler.RxSchedulerImpl;

import dagger.Binds;
import dagger.Module;

@Module
public interface RxUtilityModule {

    @Binds
    RxInternet bindsRxInternet(RxInternetImpl rxInternetImpl);

    @Binds
    RxScheduler bindRxScheudle(RxSchedulerImpl rxSchedulerImpl);
}
