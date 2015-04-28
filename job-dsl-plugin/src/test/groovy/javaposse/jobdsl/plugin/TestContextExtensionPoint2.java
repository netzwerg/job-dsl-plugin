package javaposse.jobdsl.plugin;

import hudson.Extension;
import javaposse.jobdsl.dsl.DslExtensionMethod;
import javaposse.jobdsl.dsl.helpers.step.StepContext;

@Extension
public class TestContextExtensionPoint2 extends ContextExtensionPoint {
    @DslExtensionMethod(context = StepContext.class)
    public Object twice() {
        return "error";
    }
}
