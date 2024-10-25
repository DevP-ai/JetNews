// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "2.1.0-Beta2"
    alias(libs.plugins.compose.compiler) apply false
//    kotlin("jvm") version "2.0.20"
//    kotlin("plugin.serialization") version "2.0.20"
}