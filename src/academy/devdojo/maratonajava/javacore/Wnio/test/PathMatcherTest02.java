package academy.devdojo.maratonajava.javacore.Wnio.test;
// Exercicio: Usando PathMatcher e SimpleFileVisitor retorne todos os
// arquivos que contenham Test no nome e que tenham a extensao .java ou .class

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListFiles extends SimpleFileVisitor<Path> {
    private final PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        final Path root = Paths.get(".");
        Files.walkFileTree(root, new ListFiles());
    }
}
