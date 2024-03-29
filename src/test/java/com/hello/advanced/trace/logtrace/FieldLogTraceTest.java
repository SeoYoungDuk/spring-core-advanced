package com.hello.advanced.trace.logtrace;

import com.hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;
class FieldLogTraceTest {

    FieldLogTrace trace = new FieldLogTrace();

    @Test
    void begin_end_level2() {
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_end_exception() {
        TraceStatus status1 = trace.begin("ex1");
        TraceStatus status2 = trace.begin("ex2");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
    }


}