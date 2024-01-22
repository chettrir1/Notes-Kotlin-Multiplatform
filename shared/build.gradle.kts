plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    kotlin("plugin.serialization").version("1.9.21")
    id("com.squareup.sqldelight").version("1.5.5")
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
            implementation(libs.kotlinx.coroutines.core)
            implementation(libs.runtime)
            implementation(libs.kotlinx.datetime)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        androidMain {
            dependencies {
                implementation(libs.android.driver)
            }
        }
        iosMain {
            // ...
            dependencies {
                implementation(libs.native.driver)
            }
        }
    }
}

android {
    namespace = "com.example.noteskmm"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}
