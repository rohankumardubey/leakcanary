package leakcanary

/**
 * An interface to abstract the SystemClock.uptimeMillis() Android API in non Android artifacts.
 *
 * This is a functional interface with which you can create a [Clock] from a lambda.
 */
fun interface Clock {
  /**
   * On Android VMs, this should return android.os.SystemClock.uptimeMillis().
   */
  fun uptimeMillis(): Long

  companion object {
    /**
     * Utility function to create a [Clock] from the passed in [block] lambda
     * instead of using the anonymous `object : Clock` syntax.
     *
     * Usage:
     *
     * ```kotlin
     * val clock = Clock {
     *
     * }
     * ```
     */
    inline operator fun invoke(crossinline block: () -> Long): Clock =
      Clock { block() }
  }
}
