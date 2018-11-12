package com.monstarlab.mylibrary.utils.prefs;

import dagger.Binds;
import dagger.Module;

@Module
public interface PrefsUtilModule {

    @Binds
    PrefsUtil bindPrefsUtil(PrefsUtilImpl prefsUtil);
}
