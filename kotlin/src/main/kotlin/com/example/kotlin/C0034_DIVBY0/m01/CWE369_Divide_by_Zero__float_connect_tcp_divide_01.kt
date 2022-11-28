/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__float_connect_tcp_divide_01.java
Label Definition File: CWE369_Divide_by_Zero__float.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 369 Divide by zero
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded non-zero number (two)
* Sinks: divide
*    GoodSink: Check for zero before dividing
*    BadSink : Dividing by a value that may be zero
* Flow Variant: 01 Baseline
*
* */
package romeo

import java.io.BufferedReader

class CWE369_Divide_by_Zero__float_connect_tcp_divide_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    fun bad() {
        lateinit var data: Float
        data = -1.0f/* Initialize data */

        /* Read data using an outbound tcp connection */
        run {
            lateinit var socket: Socket = null
            lateinit var readerBuffered: BufferedReader = null
            lateinit var readerInputStream: InputStreamReader = null
            try {
                /* Read data using an outbound tcp connection */
                socket = Socket("host.example.org", 39544)

                /* read input from socket */readerInputStream = InputStreamReader(socket.getInputStream(), "UTF-8")
                readerBuffered = BufferedReader(readerInputStream)

                /* POTENTIAL FLAW: Read data using an outbound tcp connection */
                val stringNumber: String = readerBuffered.readLine()
                if (stringNumber != null) // avoid NPD incidental warnings
                {
                    try {
                        data = Float.parseFloat(stringNumber.trim())
                    } catch (exceptNumberFormat: NumberFormatException) {
                        IO.logger.log(
                            Level.WARNING,
                            "Number format exception parsing data from string",
                            exceptNumberFormat
                        )
                    }
                }
            } catch (exceptIO: IOException) {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO)
            } finally {
                /* clean up stream reading objects */
                try {
                    if (readerBuffered != null) {
                        readerBuffered.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO)
                }
                try {
                    if (readerInputStream != null) {
                        readerInputStream.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO)
                }

                /* clean up socket objects */try {
                    if (socket != null) {
                        socket.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO)
                }
            }
        }

        /* POTENTIAL FLAW: Possibly divide by zero */
        val result = (100.0 / data).toInt()
        IO.writeLine(result)
    }

    @Throws(Throwable::class)
    fun good() {
        goodG2B()
        goodB2G()
    }

    /* goodG2B() - use goodsource and badsink */
    @Throws(Throwable::class)
    private fun goodG2B() {
        val data: Float

        /* FIX: Use a hardcoded number that won't a divide by zero */data = 2.0f

        /* POTENTIAL FLAW: Possibly divide by zero */
        val result = (100.0 / data).toInt()
        IO.writeLine(result)
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        var data: Float
        data = -1.0f /* Initialize data */

        /* Read data using an outbound tcp connection */
        run {
            lateinit var socket: Socket = null
            lateinit var readerBuffered: BufferedReader = null
            lateinit var readerInputStream: InputStreamReader = null
            try {
                /* Read data using an outbound tcp connection */
                socket = Socket("host.example.org", 39544)

                /* read input from socket */
                readerInputStream = InputStreamReader(socket.getInputStream(), "UTF-8")
                readerBuffered = BufferedReader(readerInputStream)

                /* POTENTIAL FLAW: Read data using an outbound tcp connection */
                val stringNumber: String = readerBuffered.readLine()
                if (stringNumber != null) // avoid NPD incidental warnings
                {
                    try {
                        data = Float.parseFloat(stringNumber.trim())
                    } catch (exceptNumberFormat: NumberFormatException) {
                        IO.logger.log(
                            Level.WARNING,
                            "Number format exception parsing data from string",
                            exceptNumberFormat
                        )
                    }
                }
            } catch (exceptIO: IOException) {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO)
            } finally {
                /* clean up stream reading objects */
                try {
                    if (readerBuffered != null) {
                        readerBuffered.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO)
                }
                try {
                    if (readerInputStream != null) {
                        readerInputStream.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO)
                }

                /* clean up socket objects */
                try {
                    if (socket != null) {
                        socket.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO)
                }
            }
        }

        /* FIX: Check for value of or near zero before dividing */
        if (Math.abs(data) > 0.000001) {
            val result = (100.0 / data).toInt()
            IO.writeLine(result)
        } else {
            IO.writeLine("This would result in a divide by zero")
        }
    }

    companion object {
        /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
        @Throws(ClassNotFoundException::class, InstantiationException::class, IllegalAccessException::class)
        fun main(args: Array<String?>?) {
            mainFromParent(args)
        }
    }
}