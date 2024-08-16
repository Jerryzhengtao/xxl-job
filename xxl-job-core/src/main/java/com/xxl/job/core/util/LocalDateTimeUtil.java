package com.xxl.job.core.util;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @Author zhengtao
 * @Date 2024/8/15 16:27
 * @Description
 **/
public class LocalDateTimeUtil {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static long toEpochMilli(LocalDateTime localDateTime) {
        return localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static LocalDateTime toLocalDateTime(long milli) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(milli), ZoneId.systemDefault());
    }

    public static String formatDate(LocalDateTime localDateTime) {
        return localDateTime.format(DATE_FORMATTER);
    }

    public static String formatDateTime(LocalDateTime localDateTime) {
        return localDateTime.format(FORMATTER);
    }

}
