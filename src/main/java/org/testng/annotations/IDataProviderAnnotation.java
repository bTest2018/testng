package org.testng.annotations;

import java.util.List;

/**
 * Encapsulate the @DataProvider / @testng.data-provider annotation
 *
 * <p>Created on Dec 20, 2005
 *
 * @author <a href="mailto:cedric@beust.com">Cedric Beust</a>
 */
public interface IDataProviderAnnotation extends IAnnotation {
  /** The name of this DataProvider. */
  String getName();

  void setName(String name);

  /** Whether this data provider should be used in parallel. */
  boolean isParallel();

  void setParallel(boolean parallel);

  List<Integer> getIndices();

  void setIndices(List<Integer> indices);
}
