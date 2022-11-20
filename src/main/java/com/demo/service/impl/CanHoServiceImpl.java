package com.demo.service.impl;

import com.demo.dto.request.CanHoRequest;
import com.demo.dto.response.CanHoResponse;
import com.demo.repository.CanHoRepository;
import com.demo.service.CanHoService;
import com.demo.service.components.PagingReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Slf4j
@RequiredArgsConstructor
public class CanHoServiceImpl implements CanHoService {

    private final ModelMapper modelMapper;
    private final CanHoRepository canHoRepository;

    @Override
    public Page<CanHoResponse> getAllCanHo(PagingReq pagingReq) {
        var canHoPage = canHoRepository.findAll(pagingReq.makePageable());
        return canHoPage.map(e -> modelMapper.map(e, CanHoResponse.class));
    }

    @Override
    public Page<CanHoResponse> getCanHoByTrangThai(String trangThai) {
        return null;
    }

    @Override
    public CanHoResponse getCanHoById(Long id) {
        return null;
    }

    @Override
    public CanHoResponse editCanHo(Long id, CanHoRequest source) {
        return null;
    }

    @Override
    public CanHoResponse handleDataAndCreateCanHo(CanHoRequest canHoRequest) {
        return null;
    }
}
