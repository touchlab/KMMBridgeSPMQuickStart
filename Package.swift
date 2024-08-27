// swift-tools-version:5.8
import PackageDescription

// BEGIN KMMBRIDGE VARIABLES BLOCK (do not edit)
let remoteKotlinUrl = "https://api.github.com/repos/touchlab/KMMBridgeSPMQuickStart/releases/assets/188671022.zip"
let remoteKotlinChecksum = "327140ce6a184b4de9105076038c7ef1f8cafa48d0bc312c0e1f79620db6be37"
let packageName = "allshared"
// END KMMBRIDGE BLOCK

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v14)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)