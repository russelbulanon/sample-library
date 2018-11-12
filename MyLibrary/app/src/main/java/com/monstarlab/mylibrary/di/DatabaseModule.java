package com.monstarlab.mylibrary.di;

import android.arch.persistence.room.Room;

import com.monstarlab.mylibrary.base.AppDatabase;
import com.monstarlab.mylibrary.base.BaseApplication;
import com.monstarlab.mylibrary.dao.user.UserSessionDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    @Provides
    @Singleton
    static AppDatabase provideDatabase(BaseApplication baseApplication) {
        return Room.databaseBuilder(baseApplication,
                                    AppDatabase.class, "database.sql")
                   .fallbackToDestructiveMigration()
                   .build();
    }

    @Provides
    @Singleton
    static UserSessionDao provideUserSessionDao(AppDatabase appDatabase) {
        return appDatabase.userDao();
    }
}
