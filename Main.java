import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static void main(String[] args) throws Exception
    {
        JDA jda = JDABuilder.createDefault("TOKEN").build();

        CommandClientBuilder builder = new CommandClientBuilder();
        builder.setOwnerId("ID");
        builder.setPrefix("!PREFIX");

        builder.addCommand(new PrintScript());

        CommandClient client = builder.build();
        jda.addEventListener(client);
    }
}

