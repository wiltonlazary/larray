package xerial.larray.buffer;

/**
 * Memory allocator interface
 * @author Taro L. Saito
 */
public interface MemoryAllocator {

    /**
     * Allocate a memory of the specified byte length. The allocated memory must be released via `release`
     * as in malloc() in C/C++.
     * @param size byte length of the memory
     * @return allocated memory information
     */
    Memory allocate(long size);

    /**
     * Register a memory
     * @param m
     */
    void register(Memory m);

    /**
     * Release a memory
     */
    void release(Memory m);

    /**
     * Release a memory, referenced by ref
     */
    void release(MemoryReference ref);

}
