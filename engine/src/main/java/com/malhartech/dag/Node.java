/*
 *  Copyright (c) 2012 Malhar, Inc.
 *  All Rights Reserved.
 */
package com.malhartech.dag;

/**
 *
 * TBD<p>
 * <br>
 * 
 * @author chetan
 */
public interface Node extends DAGComponent<NodeConfiguration, NodeContext>
{
  /**
   * This method gets called at the beginning of each window.
   *
   */
  public void beginWindow();

  /**
   * This method gets called at the end of each window.
   *
   */
  public void endWindow();
}
