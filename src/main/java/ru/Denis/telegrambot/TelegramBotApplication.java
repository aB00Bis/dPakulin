package ru.Denis.telegrambot;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;
import ru.Denis.telegrambot.entities.Category;
import ru.Denis.telegrambot.entities.Client;
import ru.Denis.telegrambot.entities.ClientOrder;
import ru.Denis.telegrambot.entities.Product;

@SpringBootApplication
public class TelegramBotApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(TelegramBotApplication.class, args);
	}

}
