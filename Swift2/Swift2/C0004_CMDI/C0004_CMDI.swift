//
//  C0004_CMDI.swift
//  Swift2
//
//  Created by code on 2023/05/18.
//

import Foundation

class C0004_CMDI{

    func executeCommand() {
        let input = "example; rm -rf /"
        let command = "ls \(input)"

        let task = Process()
        task.launchPath = "/bin/sh"
        task.arguments = ["-c", command]

        let pipe = Pipe()
        task.standardOutput = pipe
        task.standardError = pipe

        do {
            try task.run()
        } catch {
            print(error)
        }
        task.waitUntilExit()

        let data = pipe.fileHandleForReading.readDataToEndOfFile()
        if let output = String(data: data, encoding: .utf8) {
            print(output)
        }
    }

    func good() {
        let input = "example; rm -rf /"
        let escapedInput = input.replacingOccurrences(of: "'", with: "'\\''")
        let command = "ls '\(escapedInput)'"

        let task = Process()
        task.launchPath = "/bin/sh"
        task.arguments = ["-c", command]
        do {
            try task.run()
        } catch {
            print(error)
        }
        task.waitUntilExit()
    }
}
