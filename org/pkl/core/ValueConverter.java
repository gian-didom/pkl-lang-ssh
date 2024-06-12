/**
 * Copyright © 2024 Apple Inc. and the Pkl project authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pkl.core;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/** Converter for data models generated by [Evaluator]. */
@SuppressWarnings("unused")
public interface ValueConverter<T> {
  T convertNull();

  T convertString(String value);

  T convertBoolean(Boolean value);

  T convertInt(Long value);

  T convertFloat(Double value);

  T convertDuration(Duration value);

  T convertDataSize(DataSize value);

  T convertPair(Pair<?, ?> value);

  T convertList(List<?> value);

  T convertSet(Set<?> value);

  T convertMap(Map<?, ?> value);

  T convertObject(PObject value);

  T convertModule(PModule value);

  T convertClass(PClass value);

  T convertTypeAlias(TypeAlias value);

  T convertRegex(Pattern value);

  default T convert(Object value) {
    if (value instanceof Value v) {
      return (v.accept(this));
    } else if (value instanceof String string) {
      return convertString(string);
    } else if (value instanceof Boolean b) {
      return convertBoolean(b);
    } else if (value instanceof Long l) {
      return convertInt(l);
    } else if (value instanceof Double d) {
      return convertFloat(d);
    } else if (value instanceof List<?> list) {
      return convertList(list);
    } else if (value instanceof Set<?> set) {
      return convertSet(set);
    } else if (value instanceof Map<?, ?> map) {
      return convertMap(map);
    } else if (value instanceof Pattern pattern) {
      return convertRegex(pattern);
    } else {
      throw new IllegalArgumentException("Cannot convert value with unexpected type: " + value);
    }
  }
}