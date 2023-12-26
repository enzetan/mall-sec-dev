package com.macro.mall.controller;

/*
 * media-master controller
 * Created by tanenze on 2023/11/18.
 * */

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.mediaMaster.MediaFile;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Api(tags = "CipMediaMasterController")
@Tag(name = "CipMediaMasterController", description = "media-master")
@RequestMapping("/media-master")
public class CipMediaMasterController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CipMediaMasterController.class);

    @ApiOperation(value = "文件上传")
    @PostMapping()
    @ResponseBody
    public CommonResult<MediaFile> upload(@RequestBody MediaFile mediaFile) {
        LOGGER.info("file: ", mediaFile);
        return CommonResult.success(mediaFile);
    }
}
