package testcasesupport

abstract class AbstractTestCaseKotlin {
    @Throws(Throwable::class)
    abstract fun bad()

    @Throws(Throwable::class)
    abstract fun good()

    open fun runTest(className: String) {
        IOKotlin.writeLine("Starting tests for Class $className")
        try {
            good()
            IOKotlin.writeLine("Completed good() for Class $className")
        } catch (throwableException: Throwable) {
            IOKotlin.writeLine("Caught a throwable from good() for Class $className")
            IOKotlin.writeLine("Throwable's message = " + throwableException.message)
            val stackTraceElements = throwableException.stackTrace
            IOKotlin.writeLine("Stack trace below")
            for (stackTraceElement in stackTraceElements) {
                IOKotlin.writeLine(stackTraceElement.toString())
            }
        }
        try {
            bad()
            IOKotlin.writeLine("Completed bad() for Class $className")
        } catch (throwableException: Throwable) {
            IOKotlin.writeLine("Caught a throwable from bad() for Class $className")
            IOKotlin.writeLine("Throwable's message = " + throwableException.message)
            val stackTraceElements = throwableException.stackTrace
            IOKotlin.writeLine("Stack trace below")
            for (stackTraceElement in stackTraceElements) {
                IOKotlin.writeLine(stackTraceElement.toString())
            }
        }
    } /* runTest */
}
