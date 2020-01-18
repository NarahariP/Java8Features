package com.hari;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * @author Narahari
 *
 */
public class ZonedDateTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final ZonedDateTime zonedDateTime = ZonedDateTime.now();

		System.out.println("zonedDateTime : " + zonedDateTime);
		System.out.println("getOffset : " + zonedDateTime.getOffset());
		System.out.println("ZoneId : " + zonedDateTime.getZone());

		System.out.println("Availble ZoneId size : " + ZoneId.getAvailableZoneIds().size());
		ZoneId.getAvailableZoneIds().stream().forEach(zone -> System.out.println(zone));

		System.out.println("Zone Asia/Singapore  : " + ZonedDateTime.now(ZoneId.of("Asia/Singapore")));
		System.out.println("Zone Asia/Amman      : " + ZonedDateTime.now(ZoneId.of("Asia/Amman")));
		System.out.println("Zone America/Chicago : " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Zone America/New_York: " + ZonedDateTime.now(ZoneId.of("America/New_York")));

		System.out.println("ZonedDateTime using clock : " + ZonedDateTime.now(Clock.systemDefaultZone()));
		System.out.println("ZonedDateTime using clock America/Chicago : "
				+ ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));

		final LocalDateTime localDateTimeUsigZoneId = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println("localDateTimeUsigZoneId : " + localDateTimeUsigZoneId);
		final LocalDateTime localDateTimeUsingClockWithZoneId = LocalDateTime
				.now(Clock.system(ZoneId.of("Asia/Singapore")));
		System.out.println("localDateTimeUsingClockWithZoneId : " + localDateTimeUsingClockWithZoneId);
		final LocalDateTime localDateTimeUsingInstantAndZoneId = LocalDateTime.ofInstant(Instant.now(),
				ZoneId.of("Asia/Singapore"));
		System.out.println("localDateTimeUsingInstantAndZoneId : " + localDateTimeUsingInstantAndZoneId);

		final LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : " + localDateTime);
		final ZonedDateTime zonedDateTimeWithZoneId = LocalDateTime.now().atZone(ZoneId.of("America/New_York"));
		System.out.println("zonedDateTimeWithZoneId : " + zonedDateTimeWithZoneId);

		final Instant instant = Instant.now();
		System.out.println("instant : " + instant);
		final ZonedDateTime zonedDateTimeWithInstantAndZoneId = Instant.now().atZone(ZoneId.of("America/New_York"));
		System.out.println("zonedDateTimeWithInstantAndZoneId : " + zonedDateTimeWithInstantAndZoneId);
		final OffsetDateTime offsetDateTime = LocalDateTime.now().atOffset(ZoneOffset.ofHours(-6));
		System.out.println("offsetDateTime : " + offsetDateTime);

	}
}
