import Foundation

class C0004_CWE78_Os_Command_Injection {
    func bad() {
        let input = "example; rm -rf /"
        let command = "ls \(input)"
        var task = Process()

        task.launchPath = "/bin/sh"
        task.arguments = ["-c", command]
        task.launch()
        task.waitUntilExit()
    }

    func good() {
        let input = "example; rm -rf /"
        let escapedInput = input.replacingOccurrences(of: "'", with: "'\\''")
        let command = "ls '\(escapedInput)'"
        var task = Process()

        task.launchPath = "/bin/sh"
        task.arguments = ["-c", command]
        task.launch()
        task.waitUntilExit()
    }
}