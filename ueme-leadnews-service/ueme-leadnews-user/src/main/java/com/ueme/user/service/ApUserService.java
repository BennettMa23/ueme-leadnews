package com.ueme.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ueme.model.common.dtos.ResponseResult;
import com.ueme.model.user.dtos.LoginDto;
import com.ueme.model.user.pojos.ApUser;

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}
