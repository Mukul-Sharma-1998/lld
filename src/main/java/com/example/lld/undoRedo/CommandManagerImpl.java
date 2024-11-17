package com.example.lld.undoRedo;

public class CommandManagerImpl implements CommandManager {

    @Override
    public Command typing(Command oldCommand, String command) {
        if(oldCommand != null) {
            Command newCommand = new Command(command, oldCommand, null, new Executor());
            newCommand.getExecutor().setCommand(newCommand);
            oldCommand.setNext(newCommand);
            return newCommand;
        } else {
            Command newCommand = new Command(command, null, null, new Executor());
            newCommand.getExecutor().setCommand(newCommand);
            return newCommand;
        }
    }

    @Override
    public Command undo(Command command) {
        if(command.getPrev() != null) {
            return command.getPrev();
        } else {
            System.out.println("This is the last command");
            return null;
        }
    }

    @Override
    public Command redo(Command command) {
        if(command.getNext() != null) {
            return command.getNext();
        } else {
            System.out.println("This is the latest command");
            return null;
        }
    }

    @Override
    public void execute(Command command) {
        command.getExecutor().execute();
    }
}
