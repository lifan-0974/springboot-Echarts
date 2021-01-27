package com.lllfff.service;

import com.lllfff.vo.BarVO;
import com.lllfff.vo.DataVO;
import com.lllfff.vo.PieVO;
import com.lllfff.vo.ProductVO;

import java.util.List;

public interface ProductService {
    public DataVO<ProductVO> findData(Integer page,Integer limit);

    public BarVO getBarVO();

    public List<PieVO> getPieVO();
}
