//[leakcanary-android-core](../../../index.md)/[leakcanary](../index.md)/[LeakCanary](index.md)/[config](config.md)

# config

[androidJvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

@[Volatile](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-volatile/index.html)

var [config](config.md): [LeakCanary.Config](-config/index.md)

The current LeakCanary configuration. Can be updated at any time, usually by replacing it with a mutated copy, e.g.:

LeakCanary.config = LeakCanary.config.copy(retainedVisibleThreshold = 3)

In Java, use [LeakCanary.Config.Builder](-config/-builder/index.md) instead:

LeakCanary.Config config = LeakCanary.getConfig().newBuilder()\
   .retainedVisibleThreshold(3)\
   .build();\
LeakCanary.setConfig(config);
