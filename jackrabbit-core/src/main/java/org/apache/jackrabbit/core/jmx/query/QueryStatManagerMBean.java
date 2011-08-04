/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.core.jmx.query;

import javax.management.openmbean.TabularData;

import org.apache.jackrabbit.core.jmx.JackrabbitBaseMBean;

/**
 * JMX Binding for the {@link QueryStatManagerImpl}. <br>
 * 
 */
public interface QueryStatManagerMBean extends JackrabbitBaseMBean {

    String NAME = BASE_NAME + ":type=QueryStats";

    TabularData getQueries();

    /**
     * @return how big the <b>Top X</b> queue is
     */
    int getQueueSize();

    /**
     * Change the <b>Top X</b> queue size
     * 
     * @param size
     *            the new size
     */
    void setQueueSize(int size);

    /**
     * clears the queue
     */
    void clearQueue();
}