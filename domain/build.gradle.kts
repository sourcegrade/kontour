plugins {
    id("kotlin-js.base-conventions")
    id("kotlin-jvm.base-conventions")
    id("kontour-publish")
}

dependencies {
    jvmMainApi(platform(libs.exposed.bom))
    jvmMainImplementation(libs.bundles.exposed)
}
