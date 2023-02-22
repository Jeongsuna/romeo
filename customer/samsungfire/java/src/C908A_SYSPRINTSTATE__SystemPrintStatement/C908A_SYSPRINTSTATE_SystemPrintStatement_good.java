package C908A_SYSPRINTSTATE__SystemPrintStatement;

import common.PosLogger;

public class C908A_SYSPRINTSTATE_SystemPrintStatement_good {

    public void goodMethod() {
        String loggingTest = "";

        PosLogger.developerLog(PosLogger.PosLogWriterIF.WARN,
                "(DEVELOPER_LOG) WARN LEVEL TEST", loggingTest); // @fixed
    }
}
