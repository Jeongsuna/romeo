package swift.C002B_SYSTEMLEAK

import Foundation
import UIKit
import os

func bad() {
    let deviceID = UIDevice.current.name
    let systemName = UIDevice.current.systemName
    let systemVersion = UIDevice.current.systemVersion
    let model = UIDevice.current.model
    let device_info = "device info = \(deviceID), \(systemName), \(systemVersion), \(model)"
    // Flaw
    print("\(systemName)")
    // Flaw
    print("\(device_info)")
    // Flaw
    NSLog("\(device_info)")
    let logger = Logger(subsystem: Bundle.main.bundleIdentifier!, category: "device")
    // Flaw
    logger.log("\(device_info)")
}