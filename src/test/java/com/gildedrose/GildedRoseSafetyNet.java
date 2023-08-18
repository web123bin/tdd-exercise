package com.gildedrose;

import com.google.common.io.Files;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;

public class GildedRoseSafetyNet {

    @Test
    public void should_always_align_with_baseline() throws IOException {
        String output = TextTestFixture.getBaseline();
        String baseline = Files.asCharSource(new File("src/test/baseline.txt"), UTF_8).read();

        Assertions.assertEquals(baseline,output);
    }

}
