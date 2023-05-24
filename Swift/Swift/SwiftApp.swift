//
//  SwiftApp.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/09.
//

import SwiftUI

@main
struct SwiftApp: App {
    let persistenceController = PersistenceController.shared

    var body: some Scene {
        WindowGroup {
            ContentView()
                .environment(\.managedObjectContext, persistenceController.container.viewContext)
        }
    }
}
