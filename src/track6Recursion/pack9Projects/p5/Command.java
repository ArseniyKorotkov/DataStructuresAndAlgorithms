package track6Recursion.pack9Projects.p5;

public class Command {

    private int commandSize;
    private final String allElements;
    private final StringBuilder commandElements = new StringBuilder();

    public Command(int commandSize, String allElements) {
        this.commandSize = commandSize;
        this.allElements = allElements;
        buildCommands(this.commandSize, this.allElements);

    }

    private void buildCommands(int commandSize, String allElements) {

        commandElements.append(allElements.charAt(0));

        if (commandSize > 1) {
            buildCommands(commandSize - 1, allElements.substring(1));
        }

        if(commandElements.length() == this.commandSize) {
            System.out.println(commandElements);
        }

        commandElements.deleteCharAt(commandElements.length() - 1);

        if(allElements.substring(1).length() >= commandSize) {
            buildCommands(commandSize, allElements.substring(1));
        }

    }
}
