import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kmmbridge)
    alias(libs.plugins.skie)
    `maven-publish`
}

kotlin {

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            export(project(":analytics"))
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":breeds"))
            api(project(":analytics"))
        }
    }
}

kmmbridge {
    gitHubReleaseArtifacts()
    spm(swiftToolVersion = "5.8") {
        iOS { v("14") }
    }
}

skie {
    build {
        produceDistributableFramework()
    }
}