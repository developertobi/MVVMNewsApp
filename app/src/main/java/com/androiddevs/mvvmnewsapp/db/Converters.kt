package com.androiddevs.mvvmnewsapp.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.dataclass.Source

/**
 * This class is created because ROOM can
 * only work with primitive data-types.
 * So, by using this class, we tell ROOM how it
 * the should interpret the Source class
 */

class Converters {

    @TypeConverter
    fun fromSource(source: Source) : String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String) : Source {
        return Source(name, name)
    }
}