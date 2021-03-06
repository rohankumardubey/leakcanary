//[shark](../../../index.md)/[shark](../index.md)/[KeyedWeakReferenceFinder](index.md)

# KeyedWeakReferenceFinder

[jvm]\
object [KeyedWeakReferenceFinder](index.md) : [LeakingObjectFinder](../-leaking-object-finder/index.md)

Finds all objects tracked by a KeyedWeakReference, ie all objects that were passed to ObjectWatcher.watch.

## Functions

| Name | Summary |
|---|---|
| [findLeakingObjectIds](find-leaking-object-ids.md) | [jvm]<br>open override fun [findLeakingObjectIds](find-leaking-object-ids.md)(graph: HeapGraph): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)&gt;<br>For a given heap graph, returns a set of object ids for the objects that are leaking. |
| [heapDumpUptimeMillis](heap-dump-uptime-millis.md) | [jvm]<br>fun [heapDumpUptimeMillis](heap-dump-uptime-millis.md)(graph: HeapGraph): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? |
