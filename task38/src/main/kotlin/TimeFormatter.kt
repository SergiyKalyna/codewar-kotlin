import Duration.*

class TimeFormatter {

    fun formatDuration(seconds: Int): String {
        if (seconds == 0) return "now"

        val timeDuration = getTimeDuration(seconds)

        return timeDuration.toHumanReadableFormat().removeSuffix(", ")
    }

    private fun getTimeDuration(seconds: Int): TimeDuration {
        return when {
            seconds >= YEAR.duration -> TimeDurationProvider.getYearsTimeDuration(seconds)
            seconds >= DAY.duration -> TimeDurationProvider.getDaysTimeDuration(seconds)
            seconds >= HOUR.duration -> TimeDurationProvider.getHoursTimeDuration(seconds)
            seconds >= MINUTE.duration -> TimeDurationProvider.getMinutesTimeDuration(seconds)
            else -> return TimeDuration(second = seconds)
        }
    }

    private fun TimeDuration.toHumanReadableFormat(): String {
        return formatTimeDescription(this.year, "year") +
                formatTimeDescription(this.day, "day") +
                formatTimeDescription(this.hour, "hour") +
                formatTimeDescription(this.minute, "minute") +
                formatTimeDescription(this.second, "second")
    }

    private fun formatTimeDescription(time: Int, timeDescription: String): String {
        return when (time) {
            0 -> ""
            1 -> "$time $timeDescription, "
            else -> "$time $timeDescription" + "s, "
        }
    }
}