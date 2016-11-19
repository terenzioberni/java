package com.tnz.presentation.std;

import java.util.HashMap;
import java.util.Map;

import com.tnz.presentation.PresentationContext;

public class PresentationContextImpl implements PresentationContext {

	private Map<Object, Object> contextMap;

	public PresentationContextImpl() {
		contextMap = new HashMap<Object, Object>();
	}

	@Override
	public void put(Object key, Object value) {
		contextMap.put(key, value);
	}

	@Override
	public Object get(Object key) {
		return contextMap.get(key);
	}

}
