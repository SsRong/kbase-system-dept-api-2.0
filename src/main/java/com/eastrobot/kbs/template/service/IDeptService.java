package com.eastrobot.kbs.template.service;

import com.eastrobot.kbs.template.model.vo.DeptVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * <p>
 * simple demo for entity curd
 * </p>
 *
 * @author yogurt_lei
 * @since 2019-06-19
 */
public interface IDeptService {

    String save(DeptVO vo);


    Boolean update(DeptVO vo);

    Boolean deleteById(String id);

    DeptVO findById(String id);

    Page<DeptVO> pageForUser(PageRequest request);
}
