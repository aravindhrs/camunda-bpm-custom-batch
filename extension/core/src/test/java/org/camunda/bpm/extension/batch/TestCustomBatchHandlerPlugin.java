package org.camunda.bpm.extension.batch;

import java.util.Collections;

import org.camunda.bpm.extension.batch.plugin.CustomBatchHandlerPlugin;

public class TestCustomBatchHandlerPlugin extends CustomBatchHandlerPlugin {

    public TestCustomBatchHandlerPlugin() {
        super(Collections.singletonList(new TestCustomBatchJobHandler()));
    }
}
