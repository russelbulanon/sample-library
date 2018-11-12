package com.monstarlab.mylibrary.base;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.monstarlab.mylibrary.dao.user.UserSession;
import com.monstarlab.mylibrary.dao.user.UserSessionDao;

@Database(
        entities = {
                UserSession.class,
        },
        exportSchema = false,
        version = 1
)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserSessionDao userDao();
}
