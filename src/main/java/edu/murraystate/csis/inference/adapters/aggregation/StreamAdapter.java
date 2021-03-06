package edu.murraystate.csis.inference.adapters.aggregation;

import edu.murraystate.csis.inference.adapters.TestAdapter;
import edu.murraystate.csis.inference.tests.TestResult;
import edu.murraystate.csis.inference.tests.TypeTester;

import java.util.stream.Stream;

public class StreamAdapter implements TestAdapter<Stream<TestResult>, Stream<TestResult>> {

    private final TypeTester tester;

    public StreamAdapter(final TypeTester tester) {
        this.tester = tester;
    }

    @Override
    public Stream<TestResult> test(final Stream<TestResult> input) {
        return input.map(tester::test);
    }
}
