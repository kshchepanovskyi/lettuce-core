/*
 * Copyright 2011-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lambdaworks.redis.cluster;

/**
 * Event listener for cluster state/cluster node events.
 *
 * @author Mark Paluch
 */
interface ClusterEventListener {

    /**
     * Event callback if a command receives a {@literal ASK} redirection.
     */
    default void onAskRedirection() {
    }

    /**
     * Event callback if a command receives a {@literal MOVED} redirection.
     */
    default void onMovedRedirection() {
    }

    /**
     * Event callback if a connection tries to reconnect.
     */
    default void onReconnectAttempt(int attempt) {
    }

    /**
     * Event callback if a connection is attempted to an unknown node.
     */
    default void onUnknownNode() {
    }

    ClusterEventListener NO_OP = new ClusterEventListener() {
    };
}
