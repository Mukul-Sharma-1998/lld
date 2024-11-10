package com.example.lld.splitwise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GroupController {
    private Map<Integer, Group> groupMap = new HashMap<>();

    public Group createGroup(int id, String name, List<User> users, List<Expense> expenses) {
        Group group = new Group(id, name, users, expenses);
        this.groupMap.put(group.getId(), group);
        return group;
    }
}
