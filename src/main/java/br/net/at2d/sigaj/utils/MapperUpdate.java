package br.net.at2d.sigaj.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class MapperUpdate {

  public Object Update(Object entity, Object delta, String tabela) {
    final Class<?> classeDelta = delta.getClass();
    final Class<?> classeEntity = entity.getClass();
    final Field[] fields = classeDelta.getDeclaredFields();

    final Method[] methodsEntity = classeEntity.getDeclaredMethods();
    final Method[] methodsDelta = classeDelta.getDeclaredMethods();

    for (final Field field : fields) {

      try {

        final Field fieldEntity = getField(classeEntity.getDeclaredFields(), field);

        Method getDelta = getMethod("GET", methodsDelta, field);

        if (fieldEntity != null && getDelta.invoke(delta) != null) {

          Method getEntity = getMethod("GET", methodsEntity, field);

          Method setEntity = getMethod("SET", methodsEntity, field);
          if (!getDelta.invoke(delta).equals(getEntity.invoke(entity))) {
            setEntity.invoke(entity, getDelta.invoke(delta));
          }
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return entity;
  }

  private Method getMethod(String PREFIX, Method[] methods, Field field) {
    return Arrays.stream(methods).filter(m -> m.getName().toUpperCase().equals(PREFIX + field.getName().toUpperCase()))
        .findFirst().get();

  }

  private Field getField(Field[] fields, Field field) {
    return Arrays.stream(fields).filter(f -> f.getName().equals(field.getName())).findFirst().get();
  }
}