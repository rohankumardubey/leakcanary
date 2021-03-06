//[leakcanary-android-core](../../../../index.md)/[leakcanary](../../index.md)/[LeakCanary](../index.md)/[Config](index.md)/[leakingObjectFinder](leaking-object-finder.md)

# leakingObjectFinder

[androidJvm]\
val [leakingObjectFinder](leaking-object-finder.md): LeakingObjectFinder

Finds the objects that are leaking, for which LeakCanary will compute leak traces.

Defaults to KeyedWeakReferenceFinder which finds all objects tracked by a KeyedWeakReference, ie all objects that were passed to ObjectWatcher.expectWeaklyReachable.

You could instead replace it with a FilteringLeakingObjectFinder, which scans all objects in the heap dump and delegates the decision to a list of FilteringLeakingObjectFinder.LeakingObjectFilter. This can lead to finding more leaks than the default and shorter leak traces. This also means that every analysis during a given process life will bring up the same leaking objects over and over again, unlike when using KeyedWeakReferenceFinder (because KeyedWeakReference instances are cleared after each heap dump).

The list of filters can be built from AndroidObjectInspectors:

LeakCanary.config = LeakCanary.config.copy(\
    leakingObjectFinder = FilteringLeakingObjectFinder(\
        AndroidObjectInspectors.appLeakingObjectFilters\
    )\
)
