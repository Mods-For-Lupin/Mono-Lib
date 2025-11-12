package com.cursee.monolib.core.util;

/// Accepts three arguments and produces a result.
@Deprecated(since = "4.0.0", forRemoval = true)
@FunctionalInterface
public interface TriFunction<P1, P2, P3, R> {

  R apply(P1 p1, P2 p2, P3 p3);
}
