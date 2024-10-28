package org.example;

import java.nio.file.Files;
import java.nio.file.Path;

public class ShitRepository {
    private String worktree;
    private String shitdir;

    public ShitRepository(String path, boolean force) {
        this.worktree = path;
        this.shitdir = path + "/.shit";

        if(!force && !Files.isDirectory(Path.of(this.shitdir))) {
            System.out.println(String.format("Error: Not a SHIT respository %s", this.worktree));
        }
    }

}
