package com.thslus.basicmaterials.mapper;

import static com.thslus.basicmaterials.enums.BaseGroup.*;
import com.thslus.basicmaterials.enums.BaseGroup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * 碱基对和氨基酸的映射关系
 *
 * @author yuluxingchen
 * @since 2022/11/17 15:32
 * @version 0.0.1
 */
public class BaseToAminoMapper {
    private static class MapperHolder {
        private static final Map<List<BaseGroup>, String> MAPPER;
        static{
            MAPPER = new HashMap<>();
            MAPPER.put(Arrays.asList(U, U, U), "phenylalanine");
            MAPPER.put(Arrays.asList(U, U, C), "phenylalanine");
            MAPPER.put(Arrays.asList(U, U, A), "leucine");
            MAPPER.put(Arrays.asList(U, U, G), "leucine");
            MAPPER.put(Arrays.asList(U, C, U), "serine");
            MAPPER.put(Arrays.asList(U, C, C), "serine");
            MAPPER.put(Arrays.asList(U, C, A), "serine");
            MAPPER.put(Arrays.asList(U, C, G), "serine");
            MAPPER.put(Arrays.asList(U, A, U), "tyrosine");
            MAPPER.put(Arrays.asList(U, A, C), "tyrosine");
            MAPPER.put(Arrays.asList(U, A, A), "end");
            MAPPER.put(Arrays.asList(U, A, G), "end");
            MAPPER.put(Arrays.asList(U, G, U), "cysteine");
            MAPPER.put(Arrays.asList(U, G, C), "cysteine");
            MAPPER.put(Arrays.asList(U, G, A), "end");
            MAPPER.put(Arrays.asList(U, G, G), "end");
        }
    }


    public Map<List<BaseGroup>, String> getInstance(){
        return MapperHolder.MAPPER;
    }

    public String getAmino(List<BaseGroup> bases){
        return MapperHolder.MAPPER.get(bases);
    }

    public String getAmino(BaseGroup a, BaseGroup b, BaseGroup c){
        return MapperHolder.MAPPER.get(Arrays.asList(a, b, c));
    }
}
