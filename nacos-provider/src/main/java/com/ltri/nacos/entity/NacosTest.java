package com.ltri.nacos.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author ltri
 * @date 2024/7/17 3:32 下午
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class NacosTest {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String content;


}
