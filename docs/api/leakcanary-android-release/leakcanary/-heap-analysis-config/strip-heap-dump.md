//[leakcanary-android-release](../../../index.md)/[leakcanary](../index.md)/[HeapAnalysisConfig](index.md)/[stripHeapDump](strip-heap-dump.md)

# stripHeapDump

[androidJvm]\
val [stripHeapDump](strip-heap-dump.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false

Whether the first step after a heap dump should be to replace the content of all arrays with zeroes. This increases the overall processing time but limits the amount of time the heap dump exists on disk with potential PII.
