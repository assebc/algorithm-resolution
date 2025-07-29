/**
 * LRU Cache
 *
 * Design and implement a data structure that supports the following operations in O(1) time:
 * - get(key): Return the value of the key if it exists, otherwise return -1.
 * - put(key, value): Insert or update the value of the key. If the cache exceeds its capacity,
 *   evict the least recently used (LRU) key before inserting the new one.
 *
 * The cache must track the usage order of keys to efficiently identify and remove the least recently used item.
 *
 * Typical approach:
 * - Use a hashmap (Map) for O(1) access to cache entries by key.
 * - Use a doubly linked list to maintain the usage order of keys:
 *     - Most recently used items near the head.
 *     - Least recently used items near the tail.
 *
 * On every get or put, move the accessed or updated node to the head of the list.
 * When capacity is exceeded, remove the node at the tail of the list.
 *
 * Example:
 *   let cache = new LRUCache(2);
 *   cache.put(1, 1);
 *   cache.put(2, 2);
 *   cache.get(1);       // returns 1
 *   cache.put(3, 3);    // evicts key 2
 *   cache.get(2);       // returns -1 (not found)
 */

class LRUCache {
    private capacity: number;
    private cacheMap: Map<number, number>;
    private lruSorted: number[]; // Most recently used at index 0

    constructor(capacity: number) {
        this.capacity = capacity;
        this.cacheMap = new Map();
        this.lruSorted = [];
    }

    get(key: number): number {
        if (!this.cacheMap.has(key)) { return -1; }

        this.updateLRUOrder(key);
        return this.cacheMap.get(key)!;
    }

    put(key: number, value: number): void {
        if (this.cacheMap.has(key)) {
            this.cacheMap.set(key, value);
            this.updateLRUOrder(key);
            return;
        }

        if (this.cacheMap.size >= this.capacity) {
            const leastUsed = this.lruSorted.pop(); // remove last (least recently used)
            if (leastUsed !== undefined) this.cacheMap.delete(leastUsed);
        }

        this.cacheMap.set(key, value);
        this.lruSorted.unshift(key); // most recently used at front
    }

    private updateLRUOrder(key: number): void {
        this.lruSorted = [key, ...this.lruSorted.filter(k => k !== key)];
    }
}
