package com.h2t.study.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 文件实体
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2020/01/03 16:44
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilesPO {
    private Long id;

    private Long userId;

    private String name;

    private String savePath;

    private Integer deleted;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;
}
