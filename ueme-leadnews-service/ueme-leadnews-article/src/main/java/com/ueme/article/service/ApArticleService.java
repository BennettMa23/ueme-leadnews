package com.ueme.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ueme.model.article.dtos.ArticleHomeDto;
import com.ueme.model.article.pojos.ApArticle;
import com.ueme.model.common.dtos.ResponseResult;

import java.io.IOException;

public interface ApArticleService extends IService<ApArticle> {

    /**
     * 根据参数加载文章列表
     * @param loadtype 1为加载更多  2为加载最新
     * @param dto
     * @return
     */
    ResponseResult load(Short loadtype, ArticleHomeDto dto);

}
