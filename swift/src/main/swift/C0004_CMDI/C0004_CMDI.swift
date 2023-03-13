package swift.C0004_CMDI

import Foundation

func bad_executeCommand() {
    let input = "example; rm -rf /"
    let command = "ls \(input)"

    let task = Process()
    task.launchPath = "/bin/sh"
    task.arguments = ["-c", command]
    task.launch()
    task.waitUntilExit()
}

func good_executeCommand() {
    let input = "example; rm -rf /"
    let escapedInput = input.replacingOccurrences(of: "'", with: "'\\''")
    let command = "ls '\(escapedInput)'"

    let task = Process()
    task.launchPath = "/bin/sh"
    task.arguments = ["-c", command]
    task.launch()
    task.waitUntilExit()
}