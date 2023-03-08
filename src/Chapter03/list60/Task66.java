package Chapter03.list60;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/*
Получение всех часовых поясов в UTC и GMT. Написать программу,
которая показывает все имеющиеся часовые пояса в UTC и GMT.
 */
public class Task66 {

    public static final class DateTimes {

        public enum OffsetType {
            GMT, UTC
        }

        private DateTimes() {
            throw new AssertionError("Cannot be instantiated");
        }

        public List<String> fetchTimeZones8(OffsetType type) {

            List<String> timezones = new ArrayList<>();
            Set<String> zoneIds = ZoneId.getAvailableZoneIds();

            LocalDateTime now = LocalDateTime.now();

            zoneIds.forEach((zoneId) -> {
                timezones.add("(" + type + now.atZone(ZoneId.of(zoneId))
                        .getOffset().getId().replace("Z", "+00:00") + ") " + zoneId);
            });
            return timezones;
        }

        public List<String> fetchTimeZones7(OffsetType type) {

            List<String> timezones = new ArrayList<>();
            String[] zoneIds = TimeZone.getAvailableIDs();

            long timestamp = new Date().getTime();

            for (String zoneId : zoneIds) {
                TimeZone curTimeZone = TimeZone.getTimeZone(zoneId);
                curTimeZone.useDaylightTime();
                String offset = formatOffset(curTimeZone.getOffset(timestamp));

                timezones.add("(" + type + offset + ") " + zoneId);
            }
            return timezones;
        }

        public String formatOffset(int offset) {

            if (offset == 0) {
                return "+00:00";
            }
            long offsetInHours = TimeUnit.MILLISECONDS.toHours(offset);
            long offsetInMinutesFromHours = TimeUnit.HOURS.toMinutes(offsetInHours);
            long offsetInMinutes = TimeUnit.MILLISECONDS.toMinutes(offset);

            offsetInMinutes = Math.abs(offsetInMinutesFromHours - offsetInMinutes);
            return String.format("%+03d:%02d", offsetInHours, offsetInMinutes);
        }
    }
}
