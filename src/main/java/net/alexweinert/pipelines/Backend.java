package net.alexweinert.pipelines;

public interface Backend<T> {
    void process(T input) throws ProcessorException;
}
