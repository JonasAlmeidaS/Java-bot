package com.dagdev.gregarios;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.entities.Game.GameType;

public class GBot {
	
	public static JDA api;
	
	public static void main(String[] args) {
		JDABuilder builder = new JDABuilder(AccountType.BOT)
				.setToken("NTM1OTc2MDY5MTUzNjg1NTA0.XVmYpg.Vg11AZqUKm4WJEsfJy8r3Qokx7k")
				.setGame(Game.of(GameType.DEFAULT, "Testando Heroku"))
				.setStatus(OnlineStatus.IDLE);
		
		try {
			api = builder.buildBlocking();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
