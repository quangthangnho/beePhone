package com.example.beephone.convert;

import java.util.function.Function;

public interface ICovertModelAndEntity<E, M> extends Function<E, M> {
	E convertToModel(M tObject);

	M convertToEntity(E tObject);
}
