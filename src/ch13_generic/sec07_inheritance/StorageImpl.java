package ch13_generic.sec07_inheritance;

public class StorageImpl<T> implements Storage<T> {
	public T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}
	
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	
	@Override
	public T get(int index) {
		return array[index];
	}
}
