object Versions{
    const val lifecycle = "2.5.0-alpha04"
    const val hiltPlugin = "2.38.1"

    const val activity = "1.5.0-alpha03"
    const val fragment = "1.5.0-alpha03"
    const val androidCore = "1.9.0-alpha01"
    const val appcompat = "1.3.0"
    const val material = "1.4.0"
    const val constraintLayout = "2.1.3"

    const val aRouter = "1.5.2"
    const val gson = "2.9.0"
    const val okhttp = "4.9.3"
    const val retrofit = "2.9.0"
    const val glide = "4.13.1"
    const val utilCode = "1.31.0"

    const val junit = "4.13.2"
    const val junitExt = "1.1.3"
    const val espressoCore = "3.4.0"
}

object ProjectVersion{
    const val compileSdk = 32
    const val minSdk = 21
    const val targetSdk = 32
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object PluginDependencies{
    const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltPlugin}"
    const val aRouterResister = "com.alibaba:arouter-register:${Versions.aRouter}"
}

object Dependencies{
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycle}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata:${Versions.lifecycle}"
    const val lifecycleCommon = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    const val lifecycleProcess = "androidx.lifecycle:lifecycle-process:${Versions.lifecycle}"
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hiltPlugin}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hiltPlugin}"

    const val activityKtx = "androidx.activity:activity-ktx:${Versions.activity}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val androidCore = "androidx.core:core-ktx:${Versions.androidCore}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val aRouter = "com.alibaba:arouter-api:${Versions.aRouter}"
    const val aRouterCompiler = "com.alibaba:arouter-compiler:${Versions.aRouter}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val utilCode = "com.blankj:utilcodex:${Versions.utilCode}"

    const val junit = "junit:junit:${Versions.junit}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}