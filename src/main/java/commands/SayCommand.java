package commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.time.temporal.ChronoUnit;

public class SayCommand extends ListenerAdapter {

    public void onSlashCommandInteraction(SlashCommandInteractionEvent event){

        if (event.getName().equals("say")) {

            String message = event.getOption("message").getAsString();

            event.reply(message).queue();

        }

    }

}
