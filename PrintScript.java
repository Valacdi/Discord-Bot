import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class PrintScript extends Command {
    final String PATH = "PATH";
    public PrintScript() {
        super.name = "NAME";
        super.help = "WHAT DOES IT DO";
        super.aliases = new String[]{"NAME"};
    }

    protected void execute(CommandEvent event)
    {
        List<String> list = null;
        try {
            list = Files.readAllLines(Paths.get(PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] DB = list.toArray(new String[list.size()]);

        Random rand = new Random();
        int random = rand.nextInt(DB.length);

        event.getChannel().sendMessage(DB[random]).queue();
    }
}
