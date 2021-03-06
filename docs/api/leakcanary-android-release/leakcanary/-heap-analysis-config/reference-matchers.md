//[leakcanary-android-release](../../../index.md)/[leakcanary](../index.md)/[HeapAnalysisConfig](index.md)/[referenceMatchers](reference-matchers.md)

# referenceMatchers

[androidJvm]\
val [referenceMatchers](reference-matchers.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;ReferenceMatcher&gt;

Known patterns of references in the heap, added here either to ignore them (IgnoredReferenceMatcher) or to mark them as library leaks (LibraryLeakReferenceMatcher).

When adding your own custom LibraryLeakReferenceMatcher instances, you'll most likely want to set LibraryLeakReferenceMatcher.patternApplies with a filter that checks for the Android OS version and manufacturer. The build information can be obtained by calling shark.AndroidBuildMirror.fromHeapGraph.

Defaults to AndroidReferenceMatchers.appDefaults
