package com.example.lld.undoRedo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Command {
    private String  command;
    private Command prev;
    private Command next;
    private Executor executor = new Executor();


    public String toString() {
        return this.command;
    }

}
