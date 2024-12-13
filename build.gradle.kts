plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.kmmbridge) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.cocoapods) apply false
    alias(libs.plugins.sqlDelight) apply false
    alias(libs.plugins.skie) apply false
    alias(libs.plugins.compose.compiler) apply false
}

subprojects {
    val GROUP: String by project
    val LIBRARY_VERSION: String by project

    group = GROUP
    version = LIBRARY_VERSION
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
