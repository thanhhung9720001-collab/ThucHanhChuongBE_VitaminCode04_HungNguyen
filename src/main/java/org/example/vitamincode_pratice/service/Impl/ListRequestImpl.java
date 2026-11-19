package org.example.vitamincode_pratice.service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.vitamincode_pratice.entity.ListRequestEntity;
import org.example.vitamincode_pratice.mapper.ListRequestMapper;
import org.example.vitamincode_pratice.mapper.UserProfileMapper;
import org.example.vitamincode_pratice.service.ListRequestService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListRequestImpl implements ListRequestService {

    private final ListRequestMapper listRequestMapper;

    public List<ListRequestEntity> getListRequests() {
        return listRequestMapper.getListRequests();
    }

    public ListRequestEntity insertRequest(ListRequestEntity request){
        int result = listRequestMapper.insertRequest(request);
        if (result > 0) {
            return request;
        }
        throw new RuntimeException("Tạo request thấy bại");
    }

    public ListRequestEntity updateListRequest(ListRequestEntity request){
        if (request.getId() == null) {
            throw new RuntimeException("Không thể cập nhập - vì User ID null");
        }
        int result = listRequestMapper.updateRequest(request);
        if (result > 0) {
            return request;
        }
        throw new RuntimeException("Không thể cập nhập User");
    }

    public int deleteListRequest(int listRequestId){
        if (listRequestId == 0) {
            throw new RuntimeException("Khong the xoa - vi Request ID null");
        }
        return listRequestMapper.deleteRequest(listRequestId);
    }
}
