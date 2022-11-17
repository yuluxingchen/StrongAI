package com.thslus.basicmaterials.abstracts;

import lombok.Data;

/**
 * 氨基酸抽象类
 *
 * @author yuluxingchen
 * @since 2022/11/17 15:32
 * @version 0.0.1
 */
@Data
public abstract class BaseAminoAcid extends BaseProtein {
    private Integer[] bases;
}
