package com.example.lld.fileSystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class File implements FileSystem{
    private String fileName;

    @Override
    public void ls() {
        System.out.println("File : " + this.fileName);
    }
}
