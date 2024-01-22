
plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    id("org.jetbrains.kotlin.jvm") version "1.6.10" apply false
    id("com.google.dagger.hilt.android") version "2.46" apply false
}
