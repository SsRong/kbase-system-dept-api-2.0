package com.eastrobot.kbs.template.web.controller;


import com.eastrobot.kbs.common.version.ApiVersion;
import com.eastrobot.kbs.template.model.vo.DeptVO;
import com.eastrobot.kbs.template.service.IDeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

/**
 * <p>
 * Controller
 * </p>
 *
 * @author yogurt_lei
 * @since 2019-06-19˙
 */
@Api(description = "部门接口", tags = "dept")
@ApiVersion
@Validated
@RestController
@RequestMapping("/dept/")
public class DeptController {

    @Resource
    private IDeptService deptService;

    @ApiOperation(value = "创建部门", notes = "返回表示创建成功")
    @PostMapping("/dept")
    public ResponseEntity<String> create(@ApiParam(value = "UserVO Create RequestBody")
                                         @Validated(DeptVO.Create.class)
                                         @RequestBody DeptVO vo) {
        return ResponseEntity.ok(deptService.save(vo));
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping("{id}")
    public ResponseEntity delete(@NotEmpty @PathVariable String id) {
        return ResponseEntity.ok(deptService.deleteById(id));
    }

    @ApiOperation(value = "修改用户")
    @PutMapping("/dept")
    public ResponseEntity<Boolean> update(@ApiParam(value = "UserVO Create RequestBody", type = "DatasourceVO")
                                          @Validated(DeptVO.Update.class)
                                          @RequestBody DeptVO vo) {
        return ResponseEntity.ok(deptService.update(vo));
    }

    @ApiOperation(value = "根据id查询实体")
    @GetMapping("{id}")
    public ResponseEntity<DeptVO> getOne(@PathVariable String id) {
        return ResponseEntity.ok(deptService.findById(id));
    }

    @ApiOperation(value = "分页", notes = "返回查询结果")
    @GetMapping("/depts")
    public ResponseEntity<Page<DeptVO>> list(@ApiParam(value = "Page Request", type = "PageRequest")
                                             @Valid PageRequest pageRequest) {
        return ResponseEntity.ok(deptService.pageForUser(pageRequest));
    }

}
