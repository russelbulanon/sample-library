package com.monstarlab.mylibrary.di;



import com.monstarlab.mylibrary.base.BaseApplication;
import com.monstarlab.mylibrary.utils.prefs.PrefsUtilModule;
import com.monstarlab.mylibrary.utils.rx.RxUtilityModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        ActivityBuilderModule.class,
        AndroidInjectionModule.class,
        AppModule.class,
        DatabaseModule.class,
        PrefsUtilModule.class,
        RxUtilityModule.class,
    })
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(BaseApplication baseApplication);

        AppComponent build();
    }

    void inject(BaseApplication baseApplication);
}
