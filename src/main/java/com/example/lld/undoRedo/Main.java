package com.example.lld.undoRedo;

public class Main {
    public static void main(String[] args) {
        CommandManager commandManager = new CommandManagerImpl();

        Command currentCommand = commandManager.typing(null, "cd Desktop");
        commandManager.execute(currentCommand);

        currentCommand = commandManager.typing(currentCommand, "ls");
        commandManager.execute(currentCommand);

        currentCommand = commandManager.typing(currentCommand, "pwd");
        commandManager.execute(currentCommand);

        currentCommand = commandManager.undo(currentCommand);
        commandManager.execute(currentCommand);

        currentCommand = commandManager.redo(currentCommand);
        commandManager.execute(currentCommand);

    }
}
