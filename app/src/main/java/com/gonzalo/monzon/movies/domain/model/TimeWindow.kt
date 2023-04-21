package com.gonzalo.monzon.movies.domain.model

import com.google.gson.annotations.SerializedName

enum class TimeWindow(val value: String) {
    @SerializedName("day")
    DAY("day"),

    @SerializedName("week")
    WEEK("week");
}
