package io.log.extension.agent.sender.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.log.extension.agent.core.entity.spi.DefaultMessage;
import io.log.extension.agent.core.sender.Sender;

public class Log4jSender implements Sender{
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void send(DefaultMessage message) {
		log.info(message.toString());
	}

}
