package com.example.revel_ks.ugd4_c_9810.util;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;


public class DateRoomConverter {

    @TypeConverter
    public static Date toDate(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long toLong(Date value) {
        return value == null ? null : value.getTime();
    }
}
