package com.demo.service;

import com.demo.dto.request.CanHoRequest;
import com.demo.dto.response.CanHoResponse;
import com.demo.service.components.PagingReq;
import org.springframework.data.domain.Page;

public interface CanHoService {
    Page<CanHoResponse> getAllCanHo(PagingReq pagingReq);
    Page<CanHoResponse> getCanHoByTrangThai(String trangThai);
    CanHoResponse getCanHoById(Long id);
    CanHoResponse editCanHo(Long id, CanHoRequest source);
    CanHoResponse handleDataAndCreateCanHo(CanHoRequest canHoRequest);
}
