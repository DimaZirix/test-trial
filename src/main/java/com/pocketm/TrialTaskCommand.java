package com.pocketm;

import com.pocketm.service.converter.PathConverterService;
import io.micronaut.configuration.picocli.PicocliRunner;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.nio.file.Path;

@Command(name = "trial-task", description = "Trial Task. Dmitrii Piniaskin", mixinStandardHelpOptions = true)
public class TrialTaskCommand implements Runnable {

    @Inject
    private PathConverterService pathConverterService;

    @Option(names = {"-s", "--source-path"}, defaultValue = "./test_data", description = "The path where the XML and JSON files are located") // (3)
    protected String sourcePath;

    @Option(names = {"-d", "--dest-file"}, defaultValue = "./test_data/output.json", description = "Output file path") // (3)
    protected String destFile;

    @Option(names = {"-i", "--image-path"}, defaultValue = "./test_data/images", description = "The path where to download images") // (3)
    protected String imagePath;

    public static void main(String[] args) {
        PicocliRunner.run(TrialTaskCommand.class, args);
    }

    public void run() {
        pathConverterService.convert(
            Path.of(sourcePath),
            Path.of(destFile),
            Path.of(imagePath)
        );
    }
}
