package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortedCyclist<T extends Comparable<T>> {
    private List<T> list=new ArrayList<>();
    private int iterator=0;

    public T next(){
        T item = list.get(iterator);
        iterator=iterator%list.size();
        return item;
    }
    public void add(T value){
        list.add(value);
        Collections.sort(list);
    }
    public boolean contains(T value){
        return list.contains(value);
    }
    public void remove(T value){
        list.remove(value);
    }
    public void addAll(Collection<? extends T > collection){
        list.addAll(collection);
        Collections.sort(list);
    }

}
