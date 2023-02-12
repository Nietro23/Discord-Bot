import commands.SayCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.interactions.commands.OptionType;

import javax.security.auth.login.LoginException;

public class main {

    public static void main(String[] args) throws LoginException {

        JDABuilder jda = JDABuilder.createDefault("your token");

        jda.setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.playing("your status"));

        jda.addEventListeners(new SayCommand());

        JDA shardMan = jda.build();

        shardMan.upsertCommand("say", "Let the bot write something for you")
                .addOption(OptionType.STRING, "message", "message to write", true).queue();

        //shardMan.awaitReady().updateCommands().queue();

        System.out.println("Bot is Online!");

    }

}
