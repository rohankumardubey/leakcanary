//[plumber-android-core](../../../../index.md)/[leakcanary](../../index.md)/[AndroidLeakFixes](../index.md)/[IMM_CUR_ROOT_VIEW](index.md)

# IMM_CUR_ROOT_VIEW

[androidJvm]\
[IMM_CUR_ROOT_VIEW](index.md)()

When an activity is destroyed, the corresponding ViewRootImpl instance is released and ready to be garbage collected. Some time after that, ViewRootImpl#W receives a windowfocusChanged() callback, which it normally delegates to ViewRootImpl which in turn calls InputMethodManager#onPreWindowFocus which clears InputMethodManager#mCurRootView.

Unfortunately, since the ViewRootImpl instance is garbage collectable it may be garbage collected before that happens. ViewRootImpl#W has a weak reference on ViewRootImpl, so that weak reference will then return null and the windowfocusChanged() callback will be ignored, leading to InputMethodManager#mCurRootView not being cleared.

Filed here: https://issuetracker.google.com/u/0/issues/116078227 Fixed here: https://android.googlesource.com/platform/frameworks/base/+/dff365ef4dc61239fac70953b631e92972a9f41f%5E%21/#F0 InputMethodManager.mCurRootView is part of the unrestricted grey list on Android 9: https://android.googlesource.com/platform/frameworks/base/+/pie-release/config/hiddenapi-light-greylist.txt#6057

## Properties

| Name | Summary |
|---|---|
| [name](../-m-e-d-i-a_-s-e-s-s-i-o-n_-l-e-g-a-c-y_-h-e-l-p-e-r/index.md#-372974862%2FProperties%2F-1073788996) | [androidJvm]<br>val [name](../-m-e-d-i-a_-s-e-s-s-i-o-n_-l-e-g-a-c-y_-h-e-l-p-e-r/index.md#-372974862%2FProperties%2F-1073788996): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../-m-e-d-i-a_-s-e-s-s-i-o-n_-l-e-g-a-c-y_-h-e-l-p-e-r/index.md#-739389684%2FProperties%2F-1073788996) | [androidJvm]<br>val [ordinal](../-m-e-d-i-a_-s-e-s-s-i-o-n_-l-e-g-a-c-y_-h-e-l-p-e-r/index.md#-739389684%2FProperties%2F-1073788996): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
