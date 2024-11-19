package com.pocketm;

import com.pocketm.service.converter.FileConverterService;
import io.micronaut.configuration.picocli.PicocliRunner;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;

import java.nio.file.Path;

@Command(name = "trial-task", description = "Trial Task. Dmitrii Piniaskin", mixinStandardHelpOptions = true)
public class TrialTaskCommand implements Runnable {

    @Inject
    private FileConverterService fileConverterService;

    public static void main(String[] args) {
        PicocliRunner.run(TrialTaskCommand.class, args);
    }

    public void run() {
        fileConverterService.convert(3956, Path.of("/home/user/Documents/space/personal/projects/trial_task/src/main/resources/test_data"));
    }
}
