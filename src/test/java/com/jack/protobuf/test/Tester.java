package com.jack.protobuf.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jack.protobuf.EnumExample.DayOfWeek;
import com.jack.protobuf.EnumExample.EnumMessage;
import com.jack.protobuf.Simple.SimpleMessage;

public class Tester {
	
	@Test
	public void testEnumMessage() throws Exception {
		EnumMessage.Builder builder = EnumMessage.newBuilder();
		builder.setId(1);
		builder.setDayOfWeekValue(5);
		
		EnumMessage message = builder.build();
		
		assertTrue(DayOfWeek.FRIDAY.equals(message.getDayOfWeek()));
		
	}

	@Test
	public void testSimpleMessage() throws Exception {
		SimpleMessage.Builder builder = SimpleMessage.newBuilder();
		String name = "This is a test";
		builder.setId(1);
		builder.setIsSimple(true);
		builder.setName(name);
		builder.addSampleList(1);
		builder.addSampleList(2);
		
		SimpleMessage message = builder.build();
		
		assertTrue(name.equals(message.getName()));
		
	}

}
