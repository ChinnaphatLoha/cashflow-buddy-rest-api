package edu.sit.cashflow_buddy_rest_api.utils;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ModelConvertor {
    private static final ModelConvertor converter = new ModelConvertor();
    private final ModelMapper modelMapper;

    private ModelConvertor() {
        this.modelMapper = new ModelMapper();
    }

    public static ModelConvertor getInstance() {
        return converter;
    }

    public <S, T> List<T> convertList(Iterable<S> source, Class<T> targetClass) {
        return StreamSupport.stream(source.spliterator(), false)
                .map(entity -> modelMapper.map(entity, targetClass))
                .collect(Collectors.toList());
    }

    public <S, T> List<T> convertList(List<S> source, Class<T> targetClass) {
        return source.stream()
                .map(entity -> modelMapper.map(entity, targetClass))
                .collect(Collectors.toList());
    }

//    public <S, T> PageDto<T> convertPage(Page<S> source, Class<T> targetClass) {
//        List<T> content = convertList(source.getContent(), targetClass);
//        return new PageDto<>(content, source.isLast(), source.isFirst(), source.getTotalPages(),
//                (int) source.getTotalElements(), source.getSize(), source.getNumber());
//    }
//
//    public <S, T> PageDto<T> convertPage(List<S> source, Class<T> targetClass) {
//        List<T> content = convertList(source, targetClass);
//        return new PageDto<>(content, true, true, 1, source.size(), source.size(), 0);
//    }
}
