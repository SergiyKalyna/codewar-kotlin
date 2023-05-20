import Duration.*

internal object TimeDurationProvider {

    fun getYearsTimeDuration(seconds: Int): TimeDuration {
        return TimeDuration(
            year = getYearDuration(seconds),
            day = getDaysDuration(seconds),
            hour = getHoursDuration(seconds),
            minute = getMinutesDuration(seconds),
            second = getSecondsDuration(seconds)
        )
    }

    fun getDaysTimeDuration(seconds: Int): TimeDuration {
        return TimeDuration(
            day = getDaysDuration(seconds),
            hour = getHoursDuration(seconds),
            minute = getMinutesDuration(seconds),
            second = getSecondsDuration(seconds)
        )
    }

    fun getHoursTimeDuration(seconds: Int): TimeDuration {
        return TimeDuration(
            hour = getHoursDuration(seconds),
            minute = getMinutesDuration(seconds),
            second = getSecondsDuration(seconds)
        )
    }

    fun getMinutesTimeDuration(seconds: Int): TimeDuration {
        return TimeDuration(
            minute = getMinutesDuration(seconds),
            second = getSecondsDuration(seconds)
        )
    }

    private fun getYearDuration(seconds: Int): Int {
        return seconds / YEAR.duration
    }

    private fun getDaysDuration(seconds: Int): Int {
        return seconds % YEAR.duration / DAY.duration
    }

    private fun getHoursDuration(seconds: Int): Int {
        return seconds % YEAR.duration % DAY.duration / HOUR.duration
    }

    private fun getMinutesDuration(seconds: Int): Int {
        return seconds % YEAR.duration % DAY.duration % HOUR.duration / MINUTE.duration
    }

    private fun getSecondsDuration(seconds: Int): Int {
        return seconds % YEAR.duration % DAY.duration % HOUR.duration % MINUTE.duration
    }
}