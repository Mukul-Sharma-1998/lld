package com.example.lld.fileSystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Directory implements FileSystem{
    private List<FileSystem> fileSystems;

    @Override
    public void ls() {
        for(FileSystem fileSystem : this.fileSystems) {
            fileSystem.ls();
        }
    }
}
