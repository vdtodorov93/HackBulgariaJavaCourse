package com.hackbulgaria.exceptions1;

import java.util.HashMap;

public class NotRetardedHashMap<K, V> extends HashMap<K, V> {
    private boolean isNullAllowed;
    
    public NotRetardedHashMap(){
        setNullAllowed(false);
    }
    
    public NotRetardedHashMap(boolean isNullAllowed){
        setNullAllowed(isNullAllowed);
    }

    public boolean isNullAllowed() {
        return isNullAllowed;
    }

    public void setNullAllowed(boolean isNullAllowed) {
        this.isNullAllowed = isNullAllowed;
    }
    
    @Override
    public V put(K key, V value){
        if(!isNullAllowed() && key == null){
            throw new NullValueAsKeyInHashException();
        }
        return super.put(key, value);
    }
    
    @Override
    public V get(Object key) {
        if(!isNullAllowed()){
            throw new NullValueAsKeyInHashException();
        }
        return super.get(key);
    }
}
