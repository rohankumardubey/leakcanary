//[leakcanary-object-watcher](../../../index.md)/[leakcanary](../index.md)/[ObjectWatcher](index.md)/[retainedObjects](retained-objects.md)

# retainedObjects

[jvm]\

@get:[Synchronized](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-synchronized/index.html)

val [retainedObjects](retained-objects.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;

Returns the objects that are currently considered retained. Useful for logging purposes. Be careful with those objects and release them ASAP as you may creating longer lived leaks then the one that are already there.
