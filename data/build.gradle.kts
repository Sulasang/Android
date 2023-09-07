
plugins {
    id("lsakee.plugin.java.library")
}


dependencies {

    implementation(project(":domain"))
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.hilt.core)

    testImplementation(libs.junit4)
}