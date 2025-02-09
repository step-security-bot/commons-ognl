package org.apache.commons.ognl.internal;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


/**
 * Used by {@link ClassCacheImpl} to store entries in the cache.
 * <p/>
 */
class Entry<K, V>
{

    private Entry<K, V> next;

    private final K key;

    private V value;

    public Entry( K key, V value )
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return key;
    }

    public V getValue()
    {
        return value;
    }

    public void setValue( V value )
    {
        this.value = value;
    }

    public Entry<K, V> getNext()
    {
        return next;
    }

    public void setNext( Entry<K, V> next )
    {
        this.next = next;
    }

    @Override
    public String toString()
    {
        return "Entry[" + "next=" + next + '\n' + ", key=" + key + '\n' + ", value=" + value + '\n' + ']';
    }

}
