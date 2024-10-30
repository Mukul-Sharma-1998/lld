package com.example.lld.atm;

import com.example.lld.atm.state.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Atm {
    // Assuming we have unlimited supply of Notes and balance
    private State state;
    private List<Note> dispenseNote;
}
