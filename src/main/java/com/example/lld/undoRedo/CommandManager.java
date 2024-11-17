package com.example.lld.undoRedo;

public interface CommandManager {

    public Command typing(Command oldCommand, String command);
    public Command undo(Command command);
    public Command redo(Command command);
    public void execute(Command command);
}
