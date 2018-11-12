package com.monstarlab.mylibrary.dao.user;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import io.reactivex.Maybe;
import io.reactivex.Single;

@Dao
public interface UserSessionDao {

    @Query("SELECT COUNT(*) FROM UserSession")
    Single<Long> count();

    @Delete
    void delete(UserSession myProfile);

    @Query("SELECT * FROM UserSession")
    Maybe<List<UserSession>> findAll();

    @Query("SELECT * FROM UserSession LIMIT 1")
    Single<UserSession> findOne();

    @Query("SELECT * FROM UserSession WHERE UserSession.userId = :userId")
    Single<UserSession> findById(String userId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserSession myProfile);

    @Update
    void update(UserSession myProfile);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<UserSession> departments);

    @Query("DELETE FROM UserSession")
    void deleteAll();
}
