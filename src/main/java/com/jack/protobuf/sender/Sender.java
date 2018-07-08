package com.jack.protobuf.sender;

import com.jack.protobuf.generated.Simple.SimpleMessage;

public class Sender {

	public static void main(String[] args) {
		SimpleMessage.Builder builder = SimpleMessage.newBuilder();
		
		builder.setId(1);
		builder.setIsSimple(true);
		builder.setName("This is a test");
		builder.addSampleList(1);
		builder.addSampleList(2);
		System.out.println(builder.toString());
		
		SimpleMessage message = builder.build();
		
		System.out.println(message.toByteArray());
	}

}
