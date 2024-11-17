package com.example.lld.undoRedo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Executor {
    private Command command;

    public void execute() {
        System.out.println(this.command);
    }
}
