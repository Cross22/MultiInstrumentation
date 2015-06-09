# MultiInstrumentation
The trials and tribulations of getting library code coverage.

Usage:
$ cd app

$ gradle jacocoTestReport

$ open build/reports/jacoco/jacocoReport/html/index.html

This runs an instrumentation test and generates coverage for included library classes. Took ages to figure that one out :(
