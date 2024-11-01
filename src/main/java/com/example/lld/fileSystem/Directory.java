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
    private String directoryName;
    private List<FileSystem> fileSystems;

    @Override
    public void ls() {
        System.out.println(this.directoryName);
        for(FileSystem fileSystem : this.fileSystems) {
            fileSystem.ls();
        }
    }
}
